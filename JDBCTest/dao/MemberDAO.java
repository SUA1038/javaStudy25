package JDBCTest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import JDBCTest.dto.MemberDTO;

public class MemberDAO {
	
	// ��ü
	public MemberDTO memberDTO = new MemberDTO();
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;
	public int result = 0;
	
	// �⺻ ������
	public MemberDAO() {
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.167:1521:xe", "membertest", "membertest");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �̸��̳� ojdbc6.jar ���Ͽ� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
			System.exit(0); // ��������
		}catch (SQLException e) {
			System.out.println("URL, ID Ȥ�� PW�� ������ �߻��߽��ϴ�. MemberDAO�� �⺻ �����ڸ� Ȯ���ϼ���.");
			e.printStackTrace();
			System.exit(0); // ��������
		}
		
	} // �⺻ ������ ����
	
	
	
	// �޼���
	public MemberDTO login(String inputID, String inputPW) throws SQLException {
		// �α���
		MemberDTO session = null;
		
		try {
			String sql = "select * from membertable where id = ? and pw = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, inputID);
			preparedStatement.setString(2, inputPW);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				session = new MemberDTO();
				session.setMno(resultSet.getInt("mno"));
				session.setBwriter(resultSet.getString("bwriter"));
				session.setId(resultSet.getString("id"));
				session.setPw(resultSet.getString("pw"));
				session.setRegidate(resultSet.getDate("regidate"));
				System.out.println("�α��� ����. �������.");
				connection.commit();
				return session;
			}else {
				System.out.println("�α��� ����. ID Ȥ�� PW ����.");
				connection.rollback();
			} // if�� ����
			
		} catch (SQLException e) {
			System.out.println("���� �߻� : login �޼��� Ȥ�� sql ���� Ȯ���ϼ���.");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
			resultSet.close();
		} // try ����
		return session;
	} // �α��� �޼��� ����



	public void insert(MemberDTO memberDTO) throws SQLException {
		// ȸ������ �޼��� ����

		try {	
			String sql = "insert into membertable(mno, bwriter, id, pw, regidate) "
					+ "values(board_seq.nextval, ?, ?, ?, sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getBwriter());
			preparedStatement.setString(2, memberDTO.getId());
			preparedStatement.setString(3, memberDTO.getPw());
			// System.out.println("���� Ȯ�� : " + sql); // ���� Ȯ�ο�. �ϼ� �� ����***
			
			result = preparedStatement.executeUpdate();
			
			if(result > 0) {
				System.out.println("ȸ�� ���Կ� �����߽��ϴ�.");
				connection.commit();
			}else {
				// System.out.println("���� ���� ��� : " + result); // �ϼ� �� ���� ***
				System.out.println("ȸ�� ���Կ� �����߽��ϴ�.");
				connection.rollback();
			} // if�� ����
		} catch (SQLException e) {
			System.out.println("���� �߻� : insert() �޼����� �������� Ȯ���ϼ���.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		} // try ����
		
	} // ȸ������ �޼��� ����




	public void update(Scanner inputStr, String updateID) throws SQLException {
		// ȸ�� ���� ������Ʈ
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("������ �̸��� �ۼ��ϼ���.");
		System.out.print(">>> ");
		memberDTO.setBwriter(inputStr.next());

		System.out.println("������ ID�� �ۼ��ϼ���.");
		System.out.print(">>> ");
		memberDTO.setId(inputStr.next());

		System.out.println("������ PW�� �ۼ��ϼ���.");
		System.out.print(">>> ");
		memberDTO.setPw(inputStr.next());


		try {
			String sql = "update membertable set bwriter = ?, id = ?, pw = ? , regidate = sysdate where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getBwriter());
			preparedStatement.setString(2, memberDTO.getId());
			preparedStatement.setString(3, memberDTO.getPw());
			preparedStatement.setString(4, updateID);
			result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println(result + "���� ������ �����Ǿ����ϴ�.");
				connection.commit(); // ��������
			} else {
				System.out.println("�������� �ʾҽ��ϴ�.");
				connection.rollback();
			}
		} catch (SQLException e) {
			System.out.println("���� �߻� : update() �޼����� sql���� Ȯ���ϼ���.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}	

		
	} // ȸ�� ���� ������Ʈ �޼��� ����



	public void readAll() throws SQLException {
		// ��ü ȸ�� ��ȸ �޼���
		
		try {
			String sql = "select mno, bwriter, regidate from membertable order by regidate desc";
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			System.out.println("��ȣ\t ȸ����\t ���Գ�\t");
			while(resultSet.next()) {
				System.out.print(resultSet.getInt("mno") + "\t");
				System.out.print(resultSet.getString("bwriter") + "\t");
				System.out.println(resultSet.getDate("regidate") + "\t");
			}
		} catch (SQLException e) {
			System.out.println("���� �߻� : readAll()�޼����� �������� Ȯ���ϼ���.");
			e.printStackTrace();
		}finally {
			resultSet.close();
			statement.close();
		}
		
	} // ��ü ȸ�� ��ȸ �޼��� ����



	public void delete(Scanner inputStr) throws SQLException {
		// ȸ�� Ż�� �޼���
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("Ż�� ������ ID�� �Է��ϼ���.");
		System.out.print(">>> ");
		String delID = inputStr.next();
		
		try {
			String sql = "update membertable set bwriter = ?, pw = ? , regidate = sysdate where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "Ż��ȸ��");
			preparedStatement.setString(2, "0000"); // ���� pw��
			preparedStatement.setString(3, delID);
			
			result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println("ȸ�� Ż�� �����߽��ϴ�.");
				connection.commit(); // ��������
			} else {
				System.out.println("Ż�� ����.");
				connection.rollback();
			}
		} catch (SQLException e) {
			System.out.println("���� �߻� : delete �޼���� sql���� Ȯ���ϼ���.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}
				
		
	} // ȸ�� Ż�� �޼��� ����



	public void readOne(String readID) throws SQLException {
		// �� ���� ���� �޼���
		
		try {
			String sql = "select mno, bwriter, id, regidate from membertable where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, readID); 
			resultSet = preparedStatement.executeQuery(); // ������ ���� �� ����� ǥ�� �޴´�.

			if (resultSet.next()) { // �˻� ����� ���� ���
				MemberDTO memberDTO = new MemberDTO(); // �� ��ü ����

				memberDTO.setMno(resultSet.getInt("mno"));
				memberDTO.setBwriter(resultSet.getString("bwriter"));
				memberDTO.setId(resultSet.getString("id"));
				memberDTO.setRegidate(resultSet.getDate("regidate"));
				// ������ ���̽��� �ִ� ���� ��ü�� �ֱ�
				System.out.println("==========================");
				System.out.println("��ȣ : " + memberDTO.getMno());
				System.out.println("�̸� : " + memberDTO.getBwriter());
				System.out.println("id : " + memberDTO.getId());
				System.out.println("������ : " + memberDTO.getRegidate());
				System.out.println("==========================");
			} else { // �˻� ����� ���� ���
				System.out.println("�ش��ϴ� ID�� �������� �ʽ��ϴ�.");
			} // if�� ����
		} catch (SQLException e) {
			System.out.println("���� �߻� : readOne() �޼��带 Ȯ���ϼ���.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			preparedStatement.close();
		}
		
		
	} // �� ���� ���� �޼��� ����

	
	
	
} // Ŭ���� ����

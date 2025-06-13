package JDBCTest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import JDBCTest.dto.MemberBoardDTO;
import JDBCTest.dto.MemberDTO;

public class MemberBoardDAO {

	// ��ü
	public MemberDTO memberDTO = new MemberDTO();
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;
	public int result = 0;
	
	// �⺻ ������
	public MemberBoardDAO() {
		
		
		
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

	public MemberDTO insertBoard(MemberBoardDTO memberBoardDTO, MemberDTO session) throws SQLException {
		// �Խñ� �ۼ� �޼���
		
		try {
			String sql = "insert into memberboard(bno, btitle, bcontent, bwriter, bdate) values(board_seq.nextval, ?, ?, ?, sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberBoardDTO.getBtitle());
			preparedStatement.setString(2, memberBoardDTO.getBcontent());
			preparedStatement.setString(3, session.getId());
			// System.out.println("���� Ȯ�� : " + sql); // ���� Ȯ�ο� �ϼ������� ���� ***
			
			result = preparedStatement.executeUpdate();
			if(result>0) {
				System.out.println(result + "���� �Խù��� ��ϵǾ����ϴ�.");
				connection.commit();
				return session;
			}else {
				// System.out.println("���� ���� ��� : " + result); // ***��������
				System.out.println("�Խñ��� ��ϵ��� �ʾҽ��ϴ�.");
			} // if�� ����
		} catch (SQLException e) {
			System.out.println("���� �߻� : insertBoard()�޼����� �������� �ٽ� Ȯ���ϼ���.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}
		
		return null;
		
	} // �Խñ� �ۼ� �޼��� ����
	
	

	public void readAll() throws SQLException {
		// ��ü �Խñ� Ȯ�� �޼���
		try {
			String sql = "select bno, btitle, bwriter, bdate from memberboard order by bdate desc";

			statement = connection.createStatement(); 
			resultSet = statement.executeQuery(sql); 

			System.out.println("��ȣ\t ����\t �ۼ���\t �ۼ���\t");
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("bno") + "\t");
				System.out.print(resultSet.getString("btitle") + "\t");
				System.out.print(resultSet.getString("bwriter") + "\t");
				System.out.println(resultSet.getDate("bdate") + "\t");

			}
			System.out.println("==========================");
		} catch (SQLException e) {
			System.out.println("seletALL() �޼����� �������� �߸��Ǿ����ϴ�.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			statement.close(); // ���� ��ü�� �ݾƾ� �ٸ� �޼��嵵 ���� �۵�.
		}

	} // ��ü �Խñ� Ȯ�� �޼��� ����
	
	
	
	public void readOne(String bno, MemberBoardDAO memberboardDAO) throws SQLException {
		// �Խñ� �˻� ��ȸ �޼���
		
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from memberboard where bno = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, bno); 
			resultSet = preparedStatement.executeQuery(); 

			if (resultSet.next()) { 
				MemberBoardDTO memberboardDTO = new MemberBoardDTO();

				memberboardDTO.setBno(resultSet.getInt("bno"));
				memberboardDTO.setBtitle(resultSet.getString("btitle"));
				memberboardDTO.setBcontent(resultSet.getString("bcontent"));
				memberboardDTO.setBwriter(resultSet.getString("bwriter"));
				memberboardDTO.setBdate(resultSet.getDate("bdate"));
				
				System.out.println("==========================");
				System.out.println("��ȣ : " + memberboardDTO.getBno());
				System.out.println("���� : " + memberboardDTO.getBtitle());
				System.out.println("���� : " + memberboardDTO.getBcontent());
				System.out.println("�ۼ��� : " + memberboardDTO.getBwriter());
				System.out.println("�ۼ��� : " + memberboardDTO.getBdate());
			} else { // �˻� ����� ���� ���
				System.out.println("�ش��ϴ� �Խù��� �������� �ʽ��ϴ�.");
			} // if�� ����
		} catch (SQLException e) {
			System.out.println("���� �߻� : readOne() �޼��带 Ȯ���ϼ���.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			preparedStatement.close();
		}
		
	} // �Խñ� �˻� ��ȸ �޼��� ���� 

	
	
	
	public void modify(Scanner inputStr, MemberBoardDAO memberboardDAO, String bno, MemberDTO session) throws SQLException {
		// �Խñ� ���� �޼��� 
		   Scanner inputLine = new Scanner(System.in);
		   MemberBoardDTO memberboardDTO = new MemberBoardDTO();

			System.out.println("������ �Խñ��� ������ �Է��ϼ���.");
			System.out.print(">>> ");
			memberboardDTO.setBtitle(inputStr.next());

			System.out.println("������ �Խñ� ������ �Է����ּ���.");
			System.out.print(">>> ");
			memberboardDTO.setBcontent(inputLine.nextLine());

			try {
				
				String sql = "update memberboard set btitle = ?, bcontent = ?, bdate = sysdate where bno = ?";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, memberboardDTO.getBtitle());
				preparedStatement.setString(2, memberboardDTO.getBcontent());
				preparedStatement.setString(3, bno);

				result = preparedStatement.executeUpdate(); // ���� �� ��� ������ �ޱ�

				if (result > 0) {
					System.out.println(result + "���� �����Ͱ� �����Ǿ����ϴ�.");
					connection.commit(); // ���� ����
				} else {
					System.out.println("������ ���� �ʾҽ��ϴ�.");
					connection.rollback();
				} // if�� ����
			} catch (SQLException e) {
				System.out.println("���� �߻� : modify()�޼���� sql���� Ȯ���ϼ���.");
				e.printStackTrace();
			} finally {
				preparedStatement.close();
			}
		
	} // �Խñ� ���� �޼��� ����

	public void deleteOne(int deleteBno, MemberDTO session) throws SQLException {
		// �Խñ� ���� �޼���
		try {
			String sql = "delete from memberboard where bno = ? ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, deleteBno);

			result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println(result + "���� �Խñ��� �����Ǿ����ϴ�.");
				connection.commit();
			} else {
				System.out.println("�Խñ��� �������� �ʾҽ��ϴ�.");
				connection.rollback();
			}

		} catch (SQLException e) {
			System.out.println("���� �߻�. delete �޼���� sql���� Ȯ���ϼ���.");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}
	} // �Խñ� ���� �޼��� ����
	
	
}

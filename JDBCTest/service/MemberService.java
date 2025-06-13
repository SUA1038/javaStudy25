package JDBCTest.service;

import java.sql.SQLException;
import java.util.Scanner;

import JDBCTest.dao.MemberDAO;
import JDBCTest.dto.MemberDTO;

public class MemberService {

	public static MemberDAO memberDAO = new MemberDAO();

	public MemberDTO subMenu(Scanner inputStr, Scanner inputInt, MemberDTO session) throws SQLException {
		// �θ޴�
		boolean subRun = true;
		
		while (subRun) {
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ȸ�� ��ȸ");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� Ż��");
			System.out.println("5. ���� �޴���");
			System.out.print(">>> ");
			String subSelect = inputStr.next();

			switch (subSelect) {
			case "1":
				System.out.println("ȸ������ �������� �̵��մϴ�.");
				insert(memberDAO, inputStr);
				break;

			case "2":
				System.out.println("ȸ�� ��ȸ �������� �̵��մϴ�.");
				if(session != null) {
					readAll(memberDAO, inputStr);	
				}else {
					System.out.println("�α��� �� �̿� ������ �����Դϴ�.");
				}
				
				break;

			case "3":
				System.out.println("ȸ�� ���� ���� �������� �̵��մϴ�.");
				if(session != null) {
					update(memberDAO, inputStr);	
				}else {
					System.out.println("�α��� �� �̿� ������ �����Դϴ�.");
				}
				
				break;

			case "4":
				System.out.println("ȸ�� Ż�� �������� �̵��մϴ�.");
				if(session != null) {
					delete(memberDAO, inputInt, inputInt);	
				}else {
					System.out.println("�α��� �� �̿� ������ �����Դϴ�.");
				}
				
				break;

			case "5":
				System.out.println("���� �޴��� ���ư��ϴ�.");
				subRun = false;
				break;

			default:
				System.out.println("1~6�� ���� �Է��ϼ���.");
			}

		} // �θ޴� while�� ����

		return session;
		
	} // �θ޴� �޼��� ����

	
	
	private void delete(MemberDAO memberDAO, Scanner inputInt, Scanner inputStr) throws SQLException {
		// ȸ�� Ż��
		System.out.println("ȸ�� Ż�� �Ŀ��� ���� �� Ȱ�� ������ �����ϴ�.");
		System.out.println("1. Ż�� ����");
		System.out.println("2. ���ư���");
		System.out.print(">>> ");
		int dSelect = inputInt.nextInt();
		
		if(dSelect == 1) {
			memberDAO.delete(inputStr);
		}else if(dSelect == 2) {
			System.out.println("�޴��� ���ư��ϴ�.");
		}else {
			System.out.println("1~2�� ���� �Է��ϼ���.");
		}
	} // ȸ�� Ż�� ����



	private void readAll(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// ��ü ȸ�� ��ȸ
		System.out.println("==========================");
		System.out.println("======== ȸ�� ���========");
		memberDAO.readAll();
		System.out.println("==========================");
		
		System.out.println("�ڼ��� Ȯ���� ȸ���� ID�� �Է����ּ���. ���� ��� '0'�� �Է��ϼ���.");
		System.out.print(">>> ");
		String readID = inputStr.next();
		String exit = "0";
		if(readID.equals(exit)) {
			System.out.println("�޴��� �̵��մϴ�.");
		}else {
			memberDAO.readOne(readID);	
		}
		
		
	} // ��ü ȸ�� ��ȸ ����

	
	
	private void update(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// ȸ�� ���� ����
		System.out.println("������ ������ ������ ID�� �Է��ϼ���.");
		System.out.print(">>> ");
		String updateID = inputStr.next();

		memberDAO.update(inputStr, updateID);
	} // ȸ�� ���� ���� ����

	
	
	public MemberDTO login(Scanner inputStr) throws SQLException {
		// �α���
		MemberDAO memberDAO = new MemberDAO();
		
		System.out.print("ID : ");
		String inputID = inputStr.next();

		System.out.print("PW : ");
		String inputPW = inputStr.next();

		return memberDAO.login(inputID, inputPW);

	} // �α��� �޼��� ����

	private void insert(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// ȸ������

		MemberDTO memberDTO = new MemberDTO();

		System.out.print("�̸� : ");
		memberDTO.setBwriter(inputStr.next());

		System.out.print("ID : ");
		memberDTO.setId(inputStr.next());

		System.out.print("PW : ");
		memberDTO.setPw(inputStr.next());

		memberDAO.insert(memberDTO);

	} // ȸ������ �޼��� ����

} // Ŭ���� ����

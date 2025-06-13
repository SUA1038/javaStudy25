package JDBCTest.service;

import java.sql.SQLException;
import java.util.Scanner;

import JDBCTest.dao.MemberBoardDAO;
import JDBCTest.dto.MemberBoardDTO;
import JDBCTest.dto.MemberDTO;

public class MemberBoardService {

	public void menu(Scanner inputStr, Scanner inputInt, MemberDTO session) throws SQLException {

		MemberBoardDAO memberboardDAO = new MemberBoardDAO();
		boolean boardRun = true;

		while (boardRun) {
			System.out.println("---- �Խ��� ���� ----");
			System.out.println("1. �Խñ� �ۼ�");
			System.out.println("2. �Խñ� ��ȸ");
			System.out.println("3. �Խñ� ����");
			System.out.println("4. �Խñ� ����");
			System.out.println("5. ���� �޴���");
			System.out.print(">>> ");
			String subSelect = inputStr.next();

			switch (subSelect) {
			case "1":
				System.out.println("�Խñ� �ۼ� �������� �̵��մϴ�.");
				insertBoard(memberboardDAO, inputStr, session);
				break;

			case "2":
				System.out.println("�Խñ� ��ȸ �������� �̵��մϴ�.");
				System.out.println("1. ��ü �Խñ� Ȯ���ϱ�");
				System.out.println("2. �˻����� �Խñ� �� Ȯ���ϱ�.");
				System.out.print(">>> ");
				int readSelect = inputInt.nextInt();
				
				if(readSelect == 1) {
					System.out.println("��ü �Խñ��� Ȯ���մϴ�.");
					readAll();
				}else if(readSelect == 2) {
					System.out.println("�˻��� �Խñ��� ������ Ȯ���մϴ�.");
					readOne(inputStr, memberboardDAO);
				}
				break;

			case "3":
				System.out.println("�Խñ� ���� �������� �̵��մϴ�.");
				modify(inputStr, memberboardDAO, session);
				break;

			case "4":
				System.out.println("�Խñ� ���� �������� �̵��մϴ�.");
				deleteOne(inputInt, memberboardDAO, session);
				break;

			case "5":
				System.out.println("���� �޴��� �̵��մϴ�.");
				boardRun = false;
				break;

			default:
				System.out.println("1~5�� ���� �Է��ϼ���.");

			} // switch�� ����
			
		} // while�� ����

	}

	private void deleteOne(Scanner inputInt, MemberBoardDAO memberboardDAO, MemberDTO session) throws SQLException {
		// �Խñ� ���� �޼���
		
		System.out.println("������ �Խñ��� ��ȣ�� �Է��ϼ���.");
		System.out.print(">>> ");
		int deleteBno = inputInt.nextInt();
		memberboardDAO.deleteOne(deleteBno, session);
		
		
	}// �Խñ� ���� �޼��� ����

	private void modify(Scanner inputStr, MemberBoardDAO memberboardDAO, MemberDTO session) throws SQLException {
		// �Խñ� ���� �޼���
		System.out.println("�����Ϸ��� �Խñ��� ��ȣ�� �Է��ϼ���.");
		System.out.print(">>> ");
		String bno = inputStr.next();
		
		memberboardDAO.modify(inputStr, memberboardDAO, bno, session);
	} // �Խñ� ���� �޼��� ����

	private void readOne(Scanner inputStr, MemberBoardDAO memberboardDAO) throws SQLException {
		// �Խñ� �� ��ȸ �޼���
		System.out.println("Ȯ���Ϸ��� �Խñ��� ��ȣ�� �Է��ϼ���.");
		System.out.print(">>> ");
		String bno = inputStr.next();
		
		memberboardDAO.readOne(bno, memberboardDAO);
	} // �Խñ� �� ��ȸ �޼��� ����

	private void readAll() throws SQLException {
		// ��ü �Խñ� Ȯ�� �޼���
		MemberBoardDAO memberboardDAO = new MemberBoardDAO();
		
		System.out.println("==========================");
		System.out.println("===== MBC �Խ��� ��� =====");
		memberboardDAO.readAll();
		System.out.println("==========================");
	} // ��ü �Խñ� Ȯ�� �޼��� ����

	private void insertBoard(MemberBoardDAO memberboardDAO, Scanner inputStr, MemberDTO session) throws SQLException {
		// �Խñ� �ۼ� �޼���
		Scanner inputLine = new Scanner(System.in);
		MemberBoardDTO memberBoardDTO = new MemberBoardDTO();
		
		System.out.print("���� : ");
		memberBoardDTO.setBtitle(inputStr.next());
		
		System.out.print("���� : ");
		memberBoardDTO.setBcontent(inputLine.nextLine());
		
		memberboardDAO.insertBoard(memberBoardDTO, session);
		
	} // �Խñ� �ۼ� �޼��� ����

}

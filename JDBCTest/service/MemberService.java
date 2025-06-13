package JDBCTest.service;

import java.sql.SQLException;
import java.util.Scanner;

import JDBCTest.dao.MemberDAO;
import JDBCTest.dto.MemberDTO;

public class MemberService {

	public static MemberDAO memberDAO = new MemberDAO();

	public MemberDTO subMenu(Scanner inputStr, Scanner inputInt, MemberDTO session) throws SQLException {
		// 부메뉴
		boolean subRun = true;
		
		while (subRun) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 탈퇴");
			System.out.println("5. 메인 메뉴로");
			System.out.print(">>> ");
			String subSelect = inputStr.next();

			switch (subSelect) {
			case "1":
				System.out.println("회원가입 페이지로 이동합니다.");
				insert(memberDAO, inputStr);
				break;

			case "2":
				System.out.println("회원 조회 페이지로 이동합니다.");
				if(session != null) {
					readAll(memberDAO, inputStr);	
				}else {
					System.out.println("로그인 후 이용 가능한 서비스입니다.");
				}
				
				break;

			case "3":
				System.out.println("회원 정보 수정 페이지로 이동합니다.");
				if(session != null) {
					update(memberDAO, inputStr);	
				}else {
					System.out.println("로그인 후 이용 가능한 서비스입니다.");
				}
				
				break;

			case "4":
				System.out.println("회원 탈퇴 페이지로 이동합니다.");
				if(session != null) {
					delete(memberDAO, inputInt, inputInt);	
				}else {
					System.out.println("로그인 후 이용 가능한 서비스입니다.");
				}
				
				break;

			case "5":
				System.out.println("메인 메뉴로 돌아갑니다.");
				subRun = false;
				break;

			default:
				System.out.println("1~6의 값을 입력하세요.");
			}

		} // 부메뉴 while문 종료

		return session;
		
	} // 부메뉴 메서드 종료

	
	
	private void delete(MemberDAO memberDAO, Scanner inputInt, Scanner inputStr) throws SQLException {
		// 회원 탈퇴
		System.out.println("회원 탈퇴 후에도 정보 및 활동 내역은 남습니다.");
		System.out.println("1. 탈퇴 진행");
		System.out.println("2. 돌아가기");
		System.out.print(">>> ");
		int dSelect = inputInt.nextInt();
		
		if(dSelect == 1) {
			memberDAO.delete(inputStr);
		}else if(dSelect == 2) {
			System.out.println("메뉴로 돌아갑니다.");
		}else {
			System.out.println("1~2의 값을 입력하세요.");
		}
	} // 회원 탈퇴 종료



	private void readAll(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 전체 회원 조회
		System.out.println("==========================");
		System.out.println("======== 회원 목록========");
		memberDAO.readAll();
		System.out.println("==========================");
		
		System.out.println("자세히 확인할 회원의 ID를 입력해주세요. 없을 경우 '0'을 입력하세요.");
		System.out.print(">>> ");
		String readID = inputStr.next();
		String exit = "0";
		if(readID.equals(exit)) {
			System.out.println("메뉴로 이동합니다.");
		}else {
			memberDAO.readOne(readID);	
		}
		
		
	} // 전체 회원 조회 종료

	
	
	private void update(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 회원 정보 수정
		System.out.println("정보를 수정할 계정의 ID를 입력하세요.");
		System.out.print(">>> ");
		String updateID = inputStr.next();

		memberDAO.update(inputStr, updateID);
	} // 회원 정보 수정 종료

	
	
	public MemberDTO login(Scanner inputStr) throws SQLException {
		// 로그인
		MemberDAO memberDAO = new MemberDAO();
		
		System.out.print("ID : ");
		String inputID = inputStr.next();

		System.out.print("PW : ");
		String inputPW = inputStr.next();

		return memberDAO.login(inputID, inputPW);

	} // 로그인 메서드 종료

	private void insert(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 회원가입

		MemberDTO memberDTO = new MemberDTO();

		System.out.print("이름 : ");
		memberDTO.setBwriter(inputStr.next());

		System.out.print("ID : ");
		memberDTO.setId(inputStr.next());

		System.out.print("PW : ");
		memberDTO.setPw(inputStr.next());

		memberDAO.insert(memberDTO);

	} // 회원가입 메서드 종료

} // 클래스 종료

package service;

import java.sql.SQLException;
import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberService {
	public static MemberDAO memberDAO = new MemberDAO();
	
	public static void subMenu(Scanner inputStr) throws SQLException {
		boolean subRun = true;
		
		while(subRun) {
			System.out.println("MBC 회원 서비스입니다.");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 확인");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 탈퇴");
			System.out.println("5. 돌아가기");
			System.out.print(">>> ");
			String subSelect = inputStr.next();
			
			switch(subSelect) {
			case "1" :
				System.out.println("회원 가입을 진행합니다.");
				create(memberDAO, inputStr);
				break;
				
			case "2" :
				System.out.println("회원 정보를 확인합니다.");
				System.out.println("1. 전체 정보 보기");
				System.out.println("2. 상세 정보 보기");
				System.out.print(">>> ");
				String readSelect = inputStr.next();
				switch(readSelect) {
				case "1" :
					readAll(memberDAO);
					break;
					
				case "2" :
					System.out.println("보고 싶은 회원의 ID를 입력하세요.");
					System.out.print(">>> ");
					String readId = inputStr.next();
					readOne(memberDAO, readId);
					break;
					
				default :
					System.out.println("1~2의 값을 입력하세요.");
					break;
					
				} // readSelect 종료
				
				break;
				
			case "3" :
				System.out.println("회원 정보 수정을 진행합니다.");
				
				System.out.println("정보를 수정할 ID를 입력하세요.");
				System.out.print(">>> ");
				String updateID = inputStr.next();
				
				update(memberDAO, inputStr, updateID);
				break;
				
			case "4" :
				System.out.println("회원 탈퇴를 진행합니다.");
				
				delete(memberDAO, inputStr);
				break;
				
			case "5" :
				System.out.println("메인 메뉴로 돌아갑니다.");
				subRun = false;
				break;
				
			default : 
				System.out.println("1~5의 값을 입력하세요.");
				break;
			} // switch문 종료
			
		} // while문 종료
		
		
	} // subMenu 종료

	private static void delete(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 회원 탈퇴
		
		System.out.println("탈퇴 후에도 게시글은 삭제되지 않습니다.");
		System.out.println("1. 탈퇴 진행");
		System.out.println("2. 돌아가기");
		System.out.print(">>> ");
		String deleteSelete = inputStr.next();
		
		switch(deleteSelete) {
		case "1":
			memberDAO.delete(inputStr);
			break;
			
		case "2":
			System.out.println("메뉴로 돌아갑니다.");
			break;
			
		default:
			System.out.println("1~2의 값을 입력하세요.");
		
		}
		
	}

	private static void update(MemberDAO memberDAO, Scanner inputStr, String updateID) throws SQLException {
		// 회원 정보 업데이트
		
		memberDAO.update(updateID,inputStr);
		
	}

	private static void readOne(MemberDAO memberDAO, String readId) throws SQLException {
		// 회원 상세정보 확인
		memberDAO.readOne(readId);
	}

	private static void readAll(MemberDAO memberDAO) throws SQLException { // 수정
		// 회원 전체 보기 메서드
		System.out.println("==========================");
		System.out.println("======= MBC 회원 목록 =======");
		memberDAO.readAll();
		System.out.println("==========================");
		
	} // 회원 전체 보기 메서드 종료

	private static void create(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		MemberDTO memberDTO = new MemberDTO(); // 빈 객체 생성
		
		System.out.print("이름 : ");
		memberDTO.setBwriter(inputStr.next());
		
		System.out.print("ID : ");
		memberDTO.setId(inputStr.next());
		
		System.out.print("PW : ");
		memberDTO.setPw(inputStr.next());
		
		memberDAO.create(memberDTO);
		
	} // create 메서드 종료


	public MemberDTO login(Scanner inputStr) throws SQLException {
		// 로그인 메서드  
		MemberDAO memberDAO = new MemberDAO();
		
		System.out.print("ID : ");
		String loginID = inputStr.next();
		
		System.out.print("PW : ");
		String loginPW = inputStr.next();
		
		return memberDAO.login(loginID, loginPW);

		
	} // 로그인 메서드 종료

	
} // 클래스 종료

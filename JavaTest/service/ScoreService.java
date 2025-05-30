package JavaTest.service;

import java.util.Scanner;

import JavaTest.DTO.MemberDTO;
import JavaTest.DTO.ScoreDTO;

public class ScoreService {

	public void menu(Scanner inputStr, Scanner inputInt, MemberDTO[] memberDTOs, MemberDTO loginState,
			ScoreDTO[] scoreDTOs) {
		
		 if (loginState == null) {
	            System.out.println("로그인이 필요합니다.");
	            return;
	        }
		
		boolean run = true;
		while(run) {
			System.out.println("1. 성적 입력 | 2. 내 성적 조회 | 3. 전체 성적 조회 | 4. 성적 수정 | 5. 성적 삭제 | 6. 메인 메뉴로 이동");
			System.out.print(">>> ");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("내 성적을 입력합니다.");
				createScore(inputStr, inputInt, memberDTOs, loginState, scoreDTOs);
				break;
				
			case "2" :
				System.out.println("내 성적을 조회합니다.");
				reedOneScore(loginState);
				break;
				
			case "3" :
				System.out.println("전체 성적을 조회합니다.");
				readAllScore(memberDTOs, loginState, scoreDTOs);
				break;
				
			case "4" :
				System.out.println("내 성적을 수정합니다.");
				changeScore(inputStr, inputInt, memberDTOs, loginState, scoreDTOs);
				break;
				
			case "5" :
				System.out.println("내 성적을 삭제합니다.");
				deleteScore(loginState);
				break;
				
			case "6" :
				System.out.println("메인 메뉴로 돌아갑니다.");
				run = false;
				break;
				
			default :
				System.out.println("입력 오류. 1~6의 값을 입력해주세요.");
			
			} // 부메뉴 선택문 switch 종료
			
		} // 부메뉴 while문 종료


	} // menu 종료

	
	// 성적 삭제
	private void deleteScore(MemberDTO loginState) {
		  if (loginState.getScoreDTO() == null) {
	            System.out.println("삭제할 성적이 없습니다.");
	            return;
	        }

	        loginState.setScoreDTO(null);
	        System.out.println("성적이 삭제되었습니다.");
		
	} // 성적 삭제

	
	
	
	// 성적 정정
	private void changeScore(Scanner inputStr, Scanner inputInt, MemberDTO[] memberDTOs, MemberDTO loginState, ScoreDTO[] scoreDTOs) {
		if (loginState.getScoreDTO() == null) {
            System.out.println("입력된 성적이 없습니다. 먼저 성적을 입력해주세요.");
            return;
        }

        ScoreDTO newScore = new ScoreDTO();

        System.out.print("국어 점수: ");
        newScore.setKor(inputInt.nextInt());
        System.out.print("영어 점수: ");
        newScore.setEng(inputInt.nextInt());
        System.out.print("수학 점수: ");
        newScore.setMat(inputInt.nextInt());

        loginState.setScoreDTO(newScore);
        System.out.println("성적 수정이 완료되었습니다.");
		
		// scoreDTOs = editScore;
		
	} // 성적 정정

	
	// 전체 성적 확인
	private void readAllScore(MemberDTO[] memberDTOs, MemberDTO loginState, ScoreDTO[] scoreDTOs) {
		
		for(int i=0; i<scoreDTOs.length; i++) {
			if(scoreDTOs[i] != null) {
				System.out.println("---------------------------------");
				System.out.println("국어 점수 : " + scoreDTOs[i].getKor());
				System.out.println("영어 점수 : " + scoreDTOs[i].getEng());
				System.out.println("수학 점수 : " + scoreDTOs[i].getMat());
			}
		}
	
		
	}// 전체 성적 확인

	
	// 내 성적 확인
	private void reedOneScore(MemberDTO loginState) {
		ScoreDTO scoreDTO = loginState.getScoreDTO();
		
		if(scoreDTO == null) {
			System.out.println("결과값 없음. 성적 입력 후 다시 시도해주세요.");
		}
		
		System.out.println("내 성적 조회 결과");
		System.out.println("---------------------------------");
		System.out.println("국어 점수 : " + scoreDTO.getKor());
		System.out.println("영어 점수 : " + scoreDTO.getEng());
		System.out.println("수학 점수 : " + scoreDTO.getMat());
		System.out.println("---------------------------------");
	}
	// 내 성적 확인
	
	
	
	
	// 내 성적 입력
	private void createScore(Scanner inputStr, Scanner inputInt, MemberDTO[] memberDTOs, MemberDTO loginState, ScoreDTO[] scoreDTOs) {
		ScoreDTO scoreDTO = new ScoreDTO();
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.print("국어 점수 : ");
		scoreDTO.setKor(inputInt.nextInt());
		System.out.print("영어 점수 : ");
		scoreDTO.setEng(inputInt.nextInt());
		System.out.print("수학 점수 : ");
		scoreDTO.setMat(inputInt.nextInt());
		
		loginState.setScoreDTO(scoreDTO);
		
		System.out.println("점수 입력이 완료되었습니다.");
		
	} // 내 성적 입력


}

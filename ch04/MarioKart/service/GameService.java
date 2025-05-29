package ch04.MarioKart.service;

import java.util.Arrays;
import java.util.Scanner;

import ch01.Login;
import ch04.MarioKart.dto.CartDTO;
import ch04.MarioKart.dto.CharacterDTO;
import ch04.MarioKart.dto.MemberDTO;

public class GameService {

    public static void menu(Scanner input, CharacterDTO[] characterDTOs, CartDTO[] cartDTOs, MemberDTO[] memberDTOs, MemberDTO loginState) {

      
        if (loginState == null || loginState.getCharacterDTO() == null || loginState.getCartDTO() == null) {
            System.out.println("로그인 후 캐릭터와 카트를 선택해주세요.");
            
        }

        System.out.println("마리오 카트 게임을 시작합니다.");
        System.out.println("카트 경쟁을 시작합니다...");
        

        // 유저 점수 계산
        double playerScore = calculateScore1(loginState.getCharacterDTO(), loginState.getCartDTO());
        double botScore = calculateScore2(characterDTOs, cartDTOs);
    
        
        System.out.println("경쟁 중. 카트가 열심히 달립니다.");
        System.out.println("결승점 도착. 승자를 발표합니다.");
        
        System.out.println("나의 점수 : " + playerScore);
        System.out.println("상대의 점수 : " + botScore);
        
        if(playerScore < botScore) {
        	System.out.println("패배. 상대가 더 빨랐습니다.");
        } else if(playerScore > botScore) {
        	System.out.println("승리. 상대보다 빨리 결승점에 도착했습니다.");
        } else if (playerScore == botScore) {
        	System.out.println("무승부입니다.");
        } // if문 종료
        
    
    }
    
    
// 랜덤봇으로 상대 생성 후 점수 계산
	static double calculateScore2(CharacterDTO[] characterDTOs, CartDTO[] cartDTOs) {
		
        int charIndex = (int)(Math.random() * characterDTOs.length);
        int cartIndex = (int)(Math.random() * cartDTOs.length);

        CharacterDTO character = characterDTOs[charIndex];
        CartDTO cart = cartDTOs[cartIndex];

        return character.getSpeed() + character.getHandling() + (character.getAcceleration() * character.getWeight())
             + cart.getCartSpeed() + (cart.getAcceleration() * cart.getAcceleration());
	}

	
	
	// 나의 점수 계산
	static double calculateScore1(CharacterDTO characterDTOs, CartDTO cartDTOs) {
		double playerScore = characterDTOs.getSpeed() + characterDTOs.getHandling() + (characterDTOs.getAcceleration() * characterDTOs.getWeight())
				+ cartDTOs.getCartSpeed() + (cartDTOs.getAcceleration() * cartDTOs.getCartWeight());
		// 점수 = 캐릭터 속도 + 핸들링 수치 + (가속도 * 무게)
		//		+ 카트 속도 + (카트 가속도 * 카트 무게)
		// 를 계산하여 점수가 더 높은 쪽이 우승
		
		
		return characterDTOs.getSpeed() + characterDTOs.getHandling() + (characterDTOs.getAcceleration() * characterDTOs.getWeight());
	}
	
}
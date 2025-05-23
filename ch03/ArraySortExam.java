package ch03;

public class ArraySortExam {

	public static void main(String[] args) {
		// 배열에 있는 값을 정렬하여 출력해보자.
		// 오름차순 정렬 : 큰값이 뒤에 (성적 등)
		// 내림차순 정렬 : 작은값이 뒤에 (게시판, 육성경기 등)
		// 배열에 있는 값을 좌우로 변경하기 위해서는 임시방(temp)이 필요하다.
		
		int[] scores = {79, 88, 91, 33, 100, 55, 95};
		//              0   1   2   3    4    5   6
		System.out.println("=== 정렬 전 배열 값 ===");
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores + " ");
			// 배열 안에 있는 값 가로로 출력용
		}
		System.out.println();
		System.out.println("=== 정렬 후 배열 값 ===");
		
		
		for(int j=0; j < scores.length-1; j++) {
			// 0~7-1까지 반복하는 문 (앞자리용)
			
			for(int k=0; k<scores.length-1-j; k++) {
				// 0 ~ 7-1-0
				// 0 ~ 7-1-1
				// 0 ~ 7-1-2
				// 0 ~ 7-1-3... 결론 : 뒷자리 비교 금지 코드(큰값완성)
				// j값과 k값을 비교하여 j값이 크면 자리를 바꿔야 함
				if (scores[k] > scores[k+1]) {
					// 앞에 있는 값이 뒤에 있는 값보다 크면 자리를 바꾼다.
					int temp = scores[k]; // 큰 값을 임시방에 넣음
					scores[k] = scores[k+1]; // 작은 값을 앞에 넣음
					scores[k+1] = temp; // 임시방에 큰 값을 뒷방에 넣음
					// 자리 변경 완료
				} // 큰 값 비교용 if문 종료
				
				// 검증용 코드
				System.out.println("검증 중...");
				for(int i=0; i<scores.length; i++) {
					System.out.print(scores + " ");
					// 배열 안에 있는 값 가로로 출력용
				}
				
			} // 뒷자리용 for문 종료
			
		} // 앞자리용 for문 종료
		
		
	}

}

package ch04.earth;

public class Earth {
	// 지구의 반지름과 표면적 구하기
	// 상수로 선언 -> 정적 블록으로 계산식 제작
	// Math.PI 값은 내장된 값
	
	static final double PI = Math.PI ;
	static final double EARTH_RADIUS = 6400 ;
	static final double EARTH_SURFACE_AREA ;
	static final String earth = "지구";

	static{
		EARTH_SURFACE_AREA = 4 * PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
}

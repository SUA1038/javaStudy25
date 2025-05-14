package ch01;

public class VarExam {

	public static void main(String[] args) {
		
		// ���� ���� �׽�Ʈ
		
		int x = 1 ; 
		// ����Ÿ�� x ������ 1���� �ִ´�.
		
		char y = 65 ;
		// char�� ����Ÿ���ε� ���ڷ� ��ȯ�Ǳ⵵ �Ѵ�.
		// ��ǻ�ʹ� ���ڸ� �����ڵ�� ��ȯ ó���Ѵ�.
		// �����ڵ� ǥ�� 65�� A�� �ǹ��Ѵ�. 
		// �����ڵ� ����� PC�� �ִ� ���⿡�� ���α׷��� �׸� �� Ȯ���� �� �ִ�.
				
		char z = 'A' ;
		// char Ÿ���� z ������ ���� A�� ����
		
		System.out.println("int x =" + x);
		System.out.println("char y = " + y);
		System.out.println("char z = " + z);
		
		// qustndml tjsdjs
		
		int x1 ; // �ʱ�ȭ �ȵ� ����
		x1 = 10 ; // ������ �ʱⰪ�� 10���� ����
		
		System.out.println(x1);
		
		// ���� ���� ����
		int kor, mat, eng, total, avg ;
		
		kor = 90 ;
		mat = 80 ;
		eng = 70 ;
		
		total = kor + mat + eng ; // ����
		avg = total / 3 ; //���
		
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + avg);
		
		// �׷��� �Ҽ����� ǥ����� �ʾ� ������ ���� �� �ִ�.
		
		// ���� �ۼ� ��Ģ
		// ������ ù���ڰ� �����̾�� �Ǹ�, $, +�� ����� �� �ִ�.
		// ���ʷ� ù���� ������ �ҹ��ڷ�, 2��° �ܾ���ʹ� �빮�ڷ� �����Ѵ�.
		
		// int price, $price, _price ;
		// �������̸� Ư�����ڴ� ������� �ʵ��� �Ѵ�.
		
		// �ȵǴ� ����
		// int 1v;
		// int @speed
		// int @#value
		
		char firstname = '김' ;
		char firstName = '박' ;
		
		System.out.println("이름 : " + firstname);
		System.out.println("이름 : " + firstName);
		// ���� �߿� ��ҹ��ڴ� �ٸ� ������ �νĵȴ�.
		
		// ������ ������ ����� �� ����.
		// ������ �ڹٿ��� �̹� ������� ��ɾ��.
		
		// �ȵǴ� ����
		// int char
		
		// ���ͷ� : ���� �Էµ� ��
		
		int literal1 = 75 ;
		// 10����
		
		int literal2 = 075 ;
		// 8����
		
		int literal3 = 0b0011 ;
		// 2����
		
		int literal4 = 0xA ;
		// 16����
		
		System.out.println("10���� 75: " + literal1);
		System.out.println("8���� : " + literal2);
		System.out.println("2���� 0011: " + literal3);
		System.out.println("16���� A: " + literal4);
		
				
	}

}

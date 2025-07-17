package chap02_01;

public class TestClass01 {
// 변수 , 변수 선언
	public static void main(String[] args) { // main method 
		// TODO Auto-generated method stub
		int math;	// 변수 선언하기
		byte a;
		short b;
		char c; 
		
		long d = 123456787890L; // int 타입이 기본이기 때문에 뒤에 대문자 L을 넣어 Long 타입이라 알려줌
		
		int eng, kor, sci; // 같은 타입 변수는 ',' 로 구분하여 같이 설정 가능함
		
		/*	int eng; 동일
			int kor;
			int sci; */
		
		// = -> 대입 연산자 | == -> 등호
		
		eng = 90; // 변수에 초깃값 대입하기 - 변수의 초기화. 필수 작업!
		kor = 80; // 임시 초깃값 - 0으로 설정
		sci = 70;
		
		int total; // 총점 변수 선언
		total = eng + kor + sci; // 초기화 안된 변수 - 에러
		
//		System.out.print(total); 
		
	}

}

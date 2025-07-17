package chap02_01;

public class TestClass02 {
// 변수 선언 , 초기화
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hour = 3; // integer 타입의 hour 변수를 선언하고, 초깃값 3으로 초기화
		int minute = 50; 
		
		System.out.println(hour + "시" + minute + "분"); // 변수와 문자열 같이 출력하기
		
		System.out.println(hour); // hour 변수에 저장된 값(3) 출력
		System.out.println("hour"); // 문자열 hour 출력
		
		int totalMinute;
		
		totalMinute = (hour * 60) + minute;
		System.out.println(totalMinute);
		
		// 변수 값 복사하기
		
		int a;
		int b = 10;
		int c = 50;
		
		a = 100;
		b = a; // 초깃값 있어도 변수 값 복사됨
		c = 0; // 50 -> 0 으로 값 변화
		
		int a1 = 0b1010; // 2진수
		int a2 = 02010; // 8진수
		int a3 = 0xFFFF; // 16진수
		
		
	}

}

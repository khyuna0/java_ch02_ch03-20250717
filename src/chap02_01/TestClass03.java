package chap02_01;

public class TestClass03 {
// 문자 변수 타입 char / 문자열 변수 타입 String / 실수 변수 타입 / 논리 타입
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ● char ( 문자 변수 )
		
		char ch1;
//		ch1 = 65; 숫자도 저장 가능한 타입 
		
		ch1 = 'A'; // 저장할 문자를 ' ' 로 묶어야 함
//		ch1 = "A"; ->  " " 안의 문자를 문자열로 인식해서 오류 발생
		
//		char -> 유니코드로 저장함 
		
		char ch2 = '가'; // 유니코드 44032
		System.out.println(ch2); // 가 출력
		
		char ch3 = 65;
		System.out.println(ch3); // 숫자 저장하면 유니코드에서 찾아 출력함
		System.out.println(ch1); // 값 A로 동일 
		
		// ● String ( 문자열 변수 / 예약어가 아닌 클래스타입 )
		
		String ch4 = "Kor";
		
		// ● 이스케이프 문자 ( \n -> 한 줄 내림 \t -> 탭 만큼 띄우기 )
		
		String str1 = "오늘은 비가 많이 옵니다.\n내일은 맑으면 좋곘습니다.";
		System.out.println(str1);
		
		// ● 실수 변수 타입 float , double ( 기본형 )
		
		//  float 의 경우 리터럴 뒤 f or F 붙여 타입 표시
		
		// ● 논리 타입 boolean - 초깃값 true or false 
		
		boolean b1 = true;
		boolean b2 = false;
		
//		boolean b3 = 100; -> 오류
		
		System.out.println(b1);
		
		
	}

}

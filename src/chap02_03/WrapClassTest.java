package chap02_03;

public class WrapClassTest {
// 문자열 기본 타입 강제 변환 wrapper class ★
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ● 문자열 숫자로 변환 
		
		String str = "100000"; // 문자열
//		int money = (int) str; -> 오류 : 문자열을 숫자로 강제 형 변환(casting) 불가
		
		// 문자열 숫자 -> 정수로 변환하는 방법  
		int money = Integer.parseInt(str); // Int + ( ctrl + space ) -> Integer 
		System.out.println(str);
		
		// 문자열 숫자 -> 실수로 변환하는 방법  
		double money2 = Double.parseDouble(str);
		System.out.println(money2); 
		
		// ● 숫자 문자열로 변환
		
		int score = 77;
		String str2 = String.valueOf(score); // 정수 -> 문자열로 변환
		
		System.out.println(str2);
		
		System.out.printf("내가 좋아하는 돈 액수는 %d원 입니다. 돈 액수를 실수로 바꾸면 %.2f원 입니다. 문자열 돈 액수는 %s원 입니다.", money, money2, str ); 
		// 정수 -> %d / 실수 -> %f / 문자열 -> %s
		// 실수 타입 %.nf -> 소수점 n번 자리까지만
	}

}

package chap02_03;

public class ChangeTypeTest01 {
// 타입 변환
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		byte -> int
//		int -> byte
//		double -> int
//		String -> int ★
		
		// ● 자동 타입 변환 ( 큰 허용 범위 타입 = 작은 허용 범위 타입 )
		
		byte byteVar1 = 50; // -128 ~ 127 정수 타입
		int intVar1; // 4바이트 정수 타입
		intVar1 = byteVar1;

		
		// 범위가 작은 타입이 범위가 큰 타입으로 저장될 때만 가능함
		short shortVar1;
//		shortVar1 = intVar1; -> 오류! 
		
		System.out.println(intVar1); 
		
		// ● 강제 형변환 (casting) ( 작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용 범위 타입 ) ★
		shortVar1 = (byte) intVar1; // 임시 형변환
		
		byte bv1;
		bv1 = (byte) shortVar1;
		
		char charVar1;
		charVar1 = (char) intVar1; // 50 
		
		System.out.println(charVar1); // 문자 2 출력 
		
		// 실수 -> 정수 / 정수 -> 실수 형변환
		
		double doubleVar1 = 3.14;
		double doubleVar2;
		int intVar2;
		int intVar3 = 100;
		
		// 실수 -> 정수 형변환 : 대입은 가능하지만 정수화 출력 (소수점 이하 내림)
		
		intVar2 = (int) doubleVar1; 
		System.out.println(intVar2); 
		
		// 정수 -> 실수 형변환 : 변수값.0 실수화 출력
		
		doubleVar2 = intVar3;
		System.out.println(doubleVar2); 
		
		// 정수 -> 실수
		
		double doubleVar3 = 314;
		System.out.println(doubleVar3); 
		
		// 실수 -> 정수
		
		int intVar4;
		//intVar4= 5.75; -> 에러 ( 저장하는 방법 / 용량이 다르기 때문 )
		intVar4= (int) 5.75; 
		System.out.println(intVar4); // 5출력
		
		// ● 연산 형 변환
		
		// 정수와 실수 연산 -> 무조건 실수
		
		double doubleVar4 = 100 + 3.14; // 103.14 저장 
		
		int intVar5 = (int) (100 + 3.14); // 103 저장 
		
		// 나눗셈 ★
		
		int intVar6 = 5 / 3; // 몫만 저장
		System.out.println(intVar6); // 1 출력
		
		double doubleVar5 = 5 / 3; 
		System.out.println(doubleVar5); // 1.0 출력 
		
		// 정수 대 정수 연산은 정수로만 출력
		
		double doubleVar6 = 5 / 3.0; // 정수 대 실수 연산으로 변환 
		System.out.println(doubleVar6); // 1.666...7 출력
		
		// ● 문자열 연산 형 변환 ( + 연산만 가능 )
		
		int intValue = 10;
		String str = "열하나";
		
		System.out.println(intValue + "11"); // 10 에 문자열 "11" 결합해서 출력 -> 1011
		String sum1 = intValue + str; // 10열하나 -> 문자열로 저장됨
		
		System.out.println(intValue + str); // 10열하나
		
		
		
		
	}

}

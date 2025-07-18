package chap03_02;

public class OperatorTest {
// 연산자 종류
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 80;
		score = score + 10;
		
		System.out.println(score);
		
		// ● 증감 연산자
		
		int a = 0;
		a = a + 1; // a++; -> 증가 연산자
		int b = 10;
		b = b - 1; // b--; -> 감소 연산자
		
		System.out.println(a);
		System.out.println(b);
		
		int x = 1; // 초깃값 설정 필수!
		int y = 1;
		int z = 2; // * 3개 까지는 잘 넣지 않음 - 가독성 
		
		int result1 = x++ + 10; // 연산 수행 후 변수 값 +1 -> 증감연산자 위치 변수 뒤 - 우선순위 매우 낮음
		int result2 = ++y + 10; // 연산 수행 전 변수 값 +1 -> 증감연산자 위치 변수 앞 - 우선순위 매우 높음
		
		System.out.println("result1 : " + result1); // 11
		System.out.println("result2 : " + result2);	// 12
		System.out.println("x : " + x); // 2 -> x++ == x = x + 1
		System.out.println("y : " + y); // 2 -> ++y == y = y + 1
		
		// ● 논리 부정 연산자 ! ( == ~ ) / true -> false , false -> true
		
		boolean n = true;
		System.out.println(!n); // false
		
		// ● 몫 , 나머지 연산자
		
		System.out.println(10 % 3); // 나머지 연산자 1
		System.out.println(10 / 3); // 몫 출력 3
		
		// ● 논리 연산자
		
		// 1. 논리곱 ( && ) -> 피연산자 모두가 true 일 때만 true
		// 2. 논리합 ( || ) -> 피연산자 중 하나라도 true 이면 true
		// 3. 배타적 논리합 ( ^ ) -> 피연산자가 하나만 true 이고 하나는 false 일 때 true
		// 4. 논리 부정 ( ! ) -> 피연산자의 논리값 바꿈 
		
		int kor = 90;
		int eng = 85;
		int math = 70;
		int sci = 50 ;
		
		// 국영수 세 과목의 점수 중 1 과목이라도 90점 이상이면 "우수"
		
		if(kor >= 90 || eng >= 90 || math >= 90) { // if ( 조건식 ) { 실행문 } 
			System.out.println("우수");  
		}
		
		// 네 과목 점수 중 1과목이라도 60점 미만이면 과락
		
		if(kor < 60 || eng < 60 || math < 60 || sci < 60) { 
			System.out.println("과락");  
		}
		
		if(!(kor > 60 && eng > 60 && math > 60 && sci > 60)) { 
			System.out.println("과락");  
		}
		
		// ● 대입 연산자의 종류 
		
		// 복합 대입 연산자
		
		// score = score + 10 == score += 10
		// -= , *=, /= ...
	}
}

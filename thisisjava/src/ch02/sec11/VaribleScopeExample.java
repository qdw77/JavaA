package ch02.sec11;

//import java.util.Scanner;

public class VaribleScopeExample {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int var11=100; //외부에 있어서 main 함수 내부 누구나 사용 가능

		// if문
//		if(var11>10) {
//			int var22;
//			//var11과 222사용
//		}

		// for문
//		for (~~~) {
//			
//			int var333;
//			//var11 var333은 사용가능
//			//var22 사용 불가능
//		}

		// 현재 외부로 외부에 선언된 var11만 사용가능
		// 22,333 사용 불가

//		int v1=15;
//		
//		if (v1>10) {
//			int v2=v1-10;
//			System.out.printf("이름: %s","자바"); // d(정수),f(실수),s(문자열)
//			// % crgind flag with . df
//		}

//		int v3= v1+v2+5; //v2변수 사용이 불가능하기 떄문에 에러 발생

		// 키보드 입력 데이터를 변수에 저장 (17장에 더 자세히)

		// 키워드=객체 생성
		// 타입 식별자 = 항수명

//		String xxx=scanner.nextLine();
//		String yyy=scanner.nextLine();

//		System.out.println("x값");
//		String strX=scanner.nextLine();
//		int x = Integer.parseInt(strX);
//
//		System.out.println("y값");
//		String strY=scanner.nextLine();
//		int y = Integer.parseInt(strY);
//		
//		int result = x+y;
//		System.out.println("x+y="+result);
//		System.out.println();
//		
//		while(true) {
//			System.out.println("입력 문자열");
//			String data = scanner.nextLine();
//			if(data.equals("q")) {
//				break;
//			}
//			System.out.println("출력문자열: "+data);
//			System.out.println();
//		}
//		
//		System.out.println("종료");

		// p75부터
		// 4 , byte short char int long float double boolean
		// int double age price 10 3.14
		// 2,1,6,4,1,2,
		// 두번쨰 if내부 v2,1번쨰 내부 v3,맨끝 v2

		// System.out.println();

		// 부호,증감 연산자
		// + > 피연산자 부호 유지
		// - > 피연산자 부호 변경 (정수의 경우 int타입)
		// ++ >1 증가
		// -- > 1 감소

		// ++a : a값 1증가
		// --a : a값 1감소

		// a++ : 다른 연산을 수행한 후 1 증가
		// a-- : 다른 연산을 수행한 후 1 감소

//		int tex=1;
//		int tex2=1;
//		int re1=++tex+10; //12
//		int re2=tex2++ +10; //11
//		
//		System.out.println(re1);
//		System.out.println(re2);
//		System.out.println(tex2); // 연산을 우선으로 해서 11 값이 나오고 피 연산자가 1증가 되어서 1이였던 값이 2가 되었다.
//		System.out.println(tex); // 우선적으로 1을 더했기 때문에 2가 나옴
//		
//		int x=10;
//		int y=10;
//		int z;
//		
//		x++; //아직 10 > 11(처음 연산이 없기 때문에 바로 더해져서 11)
//		System.out.println("첫 x++"+x);
//		++x; //11 >그러므로 12
//		System.out.println("x= "+x);
//		
//		System.out.println("-------------------------------");
//		
//		y--; // 아직 10 >9 (처음 연산이 없기 때문에 바로 뺴져서 9)
//		System.out.println("첫 y--"+y);
//		--y; // 9 > 그러므로 8
//		System.out.println("y= "+y);
//		
//		System.out.println("-------------------------------");
//		
//		z=x++; //12 > 위의 값이 이미 12이므로 13
//		System.out.println("z= "+z);
//		System.out.println("x= "+x);
//		
//		System.out.println("-------------------------------");
//		
//		z=++x; //13 >  14
//		System.out.println("z= "+z);
//		System.out.println("x= "+x);
//		
//		System.out.println("-------------------------------");
//		z=++x + y++; // z=22/x=13/y=9 >  식을 헷갈려서 z=23  x는 15이고 y는 9이였기에 23
//		System.out.println("z="+z);
//		System.out.println("x="+x);
//		System.out.println("y="+y);
//		
//		System.out.println("-------------------------------");

		// 산술 연산자

		// 피연산자가 정수면 int
		// 정수타입이고 그중 하나가 long이라면 연산 결과도 long
		// 하나가 실수면 결과는 실수타입

		// 오버플로우,언더플로우
		// 최대값에서 1을 더하면 최소값이 되는 데 그걸 오버플로우 그 반대는 언더플로우
//		
//		int count= 0;
//		byte var1=125;
//		for(int i=0; i<5; i++) { //0부터 4까지
//			var1++;
//			count++;
//			System.out.println(var1);
//			System.out.println(count+"번째");
//			System.out.println();
//		}
//		
//		System.out.println("-------------------------------");
//		
//		int count2=0;
//		byte var2=-125;
//		for(int i=0; i<5; i++) { //0부터 4까지
//			var1--;
//			count2++;
//			System.out.println(var2);
//			System.out.println(count2+"번째");
//			System.out.println();
//		}

		// 정확한 계산은 정수 연산으로

//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//
//		double result = apple - number * pieceUnit;
//		System.out.println("사과 1개에서 남은 양: " + result);
//		System.out.println("잘못된 값 > 정수 연산식으로 변환");
//		// 부동 소수점 방식을 사용하면 실수타입에서 흔하게 일어나므로 정수 연산식으로 변환해서 계산
//
//		int totalPieces = apple * 10;
//		int result1 = totalPieces - number;
//		System.out.println("10조각에서 남은 조각: " + result1);
//		System.out.println("사과 1개에서 남은 양: " + result1 / 10.0);

		// 나눗셈 연산 후 NaN과Infinity 처리
		// NaN : Naot a Number
		// Infinity:무한
//		int x=5;
//		double y = 0.0;
//		double z = x/y;
//		System.out.println(z+2);
//		
//		if (Double.isFinite(z) || Double.isNaN(z)) {
//			System.out.println("값 산출 불가");
//		}else {
//			System.out.println(z+2);
//			System.out.println("값 산출 성공");
//		}
		
		
		
		
		
		// 비교 연산자
		//타입 일치 필수
		
		//비트 논리 연산자
		
//		00101101(45)
//		00044001(25)
//			bit or
//			
//		0001001(9) and 결과
//		00111101(61) or 결과
//		00110100(52) xor 결과
//		11010010 ~ 결과
//		-128~127
		
//		10001000 (c언어 uint8 부호가 없는)
//		10001000 (java b 부호 최상위)
		
//		01110111 +
//		       1
//		----------
//		01111000 => 120
		
//		11001100 =>204
//		11001100 => byte -부호 (byte로 받으면 )

//		00110011
//			   1
//		00110100
		
		
		
//		10001000
//		11111111 이 둘을 논리곱 and 연산
//		10001000 = unsigned 결과 136
		
//		Byte.toUnsignedInt(0) //논리곱 안해도 되고 C언어가 뭘 보내는 가 복원
		
		
		//p99
//		System.out.println("45 & 25 = "+ (45 & 25));
//		System.out.println("45 | 25 = "+ (45 | 25));
//		System.out.println("45 ^ 25 = "+ (45 ^ 25));
//		System.out.println("~45 = "+ (~45));
//		System.out.println("-----------------------");
//		
//		byte receiveData = -120;
//		
//		// 방법1. 비트 논리곱 연산으로 Unsigned 정수 얻기
//		int unsignedInt1=receiveData & 255;
//		System.out.println(unsignedInt1);
//		
//		// 방법2. 자바 API를 이용해서 Unsigned 정수 얻기
//		int unsignedInt2=Byte.toUnsignedInt(receiveData);
//		System.out.println(unsignedInt2);
//		
//		
//		int test = 136;
//		byte btest = (byte) test;
//		System.out.println(btest);
//		// and or ~
		
		
		// 비트 이동 연산자 
		// a << b : 오른쪽 빈자리 0으로 채움 
		// a >> b : 왼쪽 빈자리는 최상위 부호비트와 같은 값으로 채움
		// a >>> b : 왼쪽 빈자리는 0으로 채운다
		
//		111111          1000 = -8
//		11111111111111111111 = -1
//		         3칸
		// < n
		// *2ⁿ
		// < n
		// /2ⁿ
		
//		int num1 = 1;
//		int result1=num1 << 3;
//		int result2 = num1*(int) Math.pow(2, 3);
//		System.out.println("result1: "+result1);
//		System.out.println("result2: "+result2);
//		System.out.println("-----------------------");
//		System.out.println();
//		
//		int num2 = -8;
//		int result3 = num2 >> 3;
//		int result4 = num2 / (int) Math.pow(2, 3);
//		System.out.println("result3: "+result3);
//		System.out.println("result4: "+result4);
		
//		int 4바이트
//		8	8	8	8
		
//		int value=772;  // [00000000] [00000000] [00000011] [00000100]
		
//		// 우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음: [00000000]
//		byte byte1=(byte) (value >>> 24);
//		int int1 = byte1 &255;
//		System.out.println("첫 번째 바이트 부호 없는 값: "+int1);
		
//		// 우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음: [00000000]
//		byte byte2=(byte) (value >>> 16);
//		int int2 = Byte.toUnsignedInt(byte2);
//		System.out.println("두 번째 바이트 부호 없는 값: "+int2);
//
//		// 우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음: [00000011]
//		byte byte3=(byte) (value >>> 8);
//		int int3 = byte3 &255;
//		System.out.println("세 번째 바이트 부호 없는 값: "+int3);

//		// 끝 1바이트만 읽음: [00000100]
//		byte byte4=(byte) value;
//		int int4 = Byte.toUnsignedInt(byte4);
//		System.out.println("네 번째 바이트 부호 없는 값: "+int4);
		
		
		// 대입 연산자
		
		// 단순 대입 연산자
		
		// 복합 대입 연산자
		
		
		//삼항(조건) 연산자
		// (피연산자 ? 피연산자 : 피연산자) 
		//값이 true면 앞에 연산자가 선택되고 아니라면 뒤에 연산자가 선택된다
//		int score = 85 ;
//		char grade = (score>90)?'A':((score>80)?'B':'C');
//		System.out.println(score+"점은 "+grade+"등급입니다.");
		
		// 연산자 중 우선순위 증감,부호,비트,논리
		
		//109p
		//31,나
//		int score=85;
//		String result =(!(score>90))? "가":"나"; // > !아닌 것이니 내뇽 계산 후 아니라면 가이기 떄문에 답은 가
//		System.out.println(result);

//		int value = 365;
//		System.out.println(value-65);
		
//		int lenfth1=5;
//		int lengthB=10;
//		int he=7;
//		double e=(lenfth1+lengthB)*he*1.0/2;
//		System.out.println(e);
		
//		int x = 10;
//		int y = 5;
		
//		System.out.println((x>7) && (y<=5)); //true
//		System.out.println((x%3==2)||(y%2 != 1)); //false
		
//		double x = 5.0;
//		double y = 0.0;
//		double z = 5 % y;
//		if (Double.isInfinite(z)) {
//			System.out.println("0.0으로 나눌 수 없습니다.");
//		}else {
//			double re=z+10;
//			System.out.println("결과: "+re);
//		}
		
		
	}

}

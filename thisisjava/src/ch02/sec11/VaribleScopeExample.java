package ch02.sec11;

import java.util.Scanner;

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
		// 타입 일치 필수

		// 비트 논리 연산자

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

		// p99
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

		// 삼항(조건) 연산자
		// (피연산자 ? 피연산자 : 피연산자)
		// 값이 true면 앞에 연산자가 선택되고 아니라면 뒤에 연산자가 선택된다
//		int score = 85 ;
//		char grade = (score>90)?'A':((score>80)?'B':'C');
//		System.out.println(score+"점은 "+grade+"등급입니다.");

		// 연산자 중 우선순위 증감,부호,비트,논리

		// 109p
		// 31,나
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
//		switch(변수) {
//		case 값1:
//			실행문
//			break;
//		
//		case 값2:
//			실행문
//			break;
//			
//			default:	
//				실행문
//			
//		}

//		int a=20;
//		switch(a) {
//		
//		case 10:
//			System.out.println("a는 10");
//			break;
//			
//		case 20:
//			System.out.println("a는 20");
//			break;
//		
//		default:
//			System.out.println("a값 모름");
//		
//		}

//		int num2=(int)(Math.random()*6)+1;
//		
//		switch (num2) {
//		case 1: {
//			
//			System.out.println("1번이 나왔습니다.");
//			break;
//		}
//		case 2: {
//			
//			System.out.println("2번이 나왔습니다.");
//			break;
//		}
//		case 3: {
//			
//			System.out.println("3번이 나왔습니다.");
//			break;
//		}
//		case 4: {
//			
//			System.out.println("4번이 나왔습니다.");
//			break;
//		}
//		case 5: {
//			
//			System.out.println("5번이 나왔습니다.");
//			break;
//		}
//		default:
//			System.out.println("6번이 나왔습니다."); 
//		}

		// 주사위 2개 던져서 같은 게 나오면 두수의 합 출력 "12"
		// 같지 않은게 나오면 각 주사위 숫자를 출력 "1번 주사위는 4, 2번 주사위는 5"
		// 위 요구를 if문을 사용해서 출력

//		int a = (int) (Math.random() * 6) + 1;
//		int b = (int) (Math.random() * 6) + 1;
//
////		if (a==b) {
////			System.out.println("똑같은 주사위가 나왔다. 1번 주사위+2번 주사위는 "+(a+b)+"이다.");
////		} else {
////			System.out.println("1번 주사위는 "+a+", 2번 주사위는 "+b);
////		}
//		int di = a + b;
//		switch (di) {
//			case 2:
//				System.out.println("첫번째 주사위와 두번째 주사위는 1입니다.");
//				break;
//			case 4:
//				System.out.println("첫번째 주사위와 두번째 주사위는 2입니다.");
//				break;
//			case 6:
//				System.out.println("첫번째 주사위와 두번째 주사위는 3입니다.");
//				break;
//			case 8:
//				System.out.println("첫번째 주사위와 두번째 주사위는 4입니다.");
//				break;
//			case 10:
//				System.out.println("첫번째 주사위와 두번째 주사위는 5입니다.");
//				break;
//			case 12:
//				System.out.println("첫번째 주사위와 두번째 주사위는 6입니다.");
//				break;
//			default:
//				System.out.println("첫번째 주사위는 " + a + "두번째 주사위는 " + b);
//		}

		// 알려주신 방법1
//		boolean x=(a==b); //기본 내장 데이터 타입
//		String xx= String.valueOf(x); //p67

//		switch(xx) {
//			case "true":
//				System.out.println(a+b);
//			default:
//				System.out.println(a);
//				System.out.println(b);
//		
//		}
		

		// 알려주신 방법2
//		switch(a-b) {
//			case 0:
//				System.out.println(a+b);
//			default:
//				System.out.println(a);
//				System.out.println(b);
//		}

//		int time = (int) (Math.random() * 4) + 8;
//		System.out.println("[현재 시간: " + time + "시]");
//
//		switch (time) {
//			//break;가 없으면 계속 돌아가서 전부 출력
//		case 8:
//			System.out.println("출근합니다.");
//			// break;
//		case 9:
//			System.out.println("출근합니다.");
//			// break;
//		case 10:
//			System.out.println("출근합니다.");
//			// break;
//		default:
//			System.out.println("외근을 나갑니다.");
//		}

//		String grade = "B";
//
//		// java 11 이전 문법
//		int score0 = 0;
//		switch (grade) {
//		case "A":
//			score0 = 100;
//			break;
//		case "B":
//			int result = 100 - 20;
//			score0 = result;
//			break;
//		default:
//			score0 = 60;
//		}
//
//		System.out.println("score0: " + score0);
//
//		// java 13부터 가능
//		int score1 = switch (grade) {
//		case "A" -> 100;
//		case "B" -> {
//			int result = 100 - 20;
//			yield result;
//		}
//		default -> 60;
//
//		};
//
//		System.out.println("score1: " + score1);
//		
//		
//		String g="A";
//		int score2=switch(g){case "A"->100;case "B"->{int r=100-20;yield r;}default->60;};
//		System.out.println(score2);

		// yield 키워드 : 값의 반환
		// -> 표현 switch 표현식
		// case B에 {}로 묶은 이유? 여러 실행문이 들어가기 때문

//		for (int i=1; i<=3; i++) {
//			//1부터 3포함까지 1씩 반복 i++ 선태입 후 연산
////			int x= i++;
////			System.out.println(x); //x에 1이 먼저 들어가서 1인 상태
//			System.out.println(i); //그 후 대입되어서 2~4
//		}

//		for (int i=100; i>=3; i--) {
//			System.out.println(i);
//		}

//		for (int i=3; i<1000; i*=2) {
//			System.out.println(i);
//		}
//		for (int i=3; i<1000; i+=10) {
//			System.out.println(i);
//		}

//		for (int i=0,j=100; i<=50&&j>=50; i++,j--) {
//			
//			System.out.println("i는 "+i+" j는 "+j);
//			
//		}

//		int aa;
//		//1번 구역
//		for (aa=1;aa<=100;aa++) {
//			// 2번구역
//		}
//		//3번 구역

//		int sum=0; // 합계 변수 
//		int i; // < 카운터 변수> (i-1)
//		
//		for (i=1; i<=100; i++) {
//			sum+=i;
//		}
//		System.out.println("1~"+(i-1)+" 합 "+sum);
		// float은 오류 많음
		// 2증 for문

		// while문
//		while () {
//			~~~~~
//		}
//		while [] {
//			~~~~~
//		}
		// 둘다 빈값을 넣었음으로 false

//		int c=0;
//		int sum2=0;
//		while(c<100) {
//			//1 증가전  0
//			c++;
//			sum2+=c;
//			//2 증가 후 1
//
//		}
//		
//		System.out.println(sum2);

//		Scanner scanner = new Scanner(System.in);
//		boolean run =true;
//		int speed=0;
//		
//		while (run) {
//			System.out.println("----------------------------");
//			System.out.println("1. 종속 | 2. 감속 | 3. 중지");
//			System.out.println("----------------------------");
//			System.out.println();
//			System.out.print("선택");
//		
//			String strNum = scanner.nextLine();
//			if (strNum.equals("1")) {
//				speed++;
//				System.out.println("현재 속도 = "+ speed);
//			}else if(strNum.equals("2")){
//				System.out.println("현재 속도 = "+speed);
//			}else if(strNum.equals("3")){
//				run=false;
//			}
//		
//		}
//		
//		System.out.println("프로그램 종료");

		// do-while문
		// 조건 없이 처음 들어올 수 있음
//		do {
//			실행문~~
//		} while (조건식);

//		System.out.println("메세지를 입력하세요.");
//		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
//
//		Scanner scanner = new Scanner(System.in);
//		String inputString;
////		inputString < str
//		
//		
//		do {
//
//			System.out.print(">");
//			inputString = scanner.nextLine();
//			System.out.println(inputString);
//
//		} while (!inputString.equals("q"));
//		//a.eqquals("b") < a와 b가 같은지 확인
//		
//		System.out.println();
//		System.out.println("프로그램 종료");
//		
//		String str1="안녕";
//		String str2="hello";
//		
//		data.equals("문자열");

//		str1.equals(str2);
//		str1.equals("안녕");
//		str1.equals(str1+str2);
//		"안녕".equals(str1);
		// . 은 객체 타입
		// list 관련 함수 . 문자열 관련 함수 확인ㄴ

//		lista=[]
//				lista.append(4)
//				[].append(4)
//				[1,2,3].append(4)
//				
//				x=10
//				[].append([1,2,3])
//				[].append(x)

//		String exitKey="q";
//		inputString.equals(exitKey);
//		System.out.println();

		// break문

		// 이름을 지어주면 break 이름; 으로 한번에 나갈 수 있다.
//		Outter: for(char upper='A'; upper<='Z'; upper++) {
//			for(char lower='a'; lower<='z'; lower++) {
//				System.out.println(upper+"-"+lower);
//				if(lower=='g') {
//					break Outter;
//				}
//			}
//		}
//		System.out.println("프로그램 종료");
//		

//		//continue 문
//		for (int aa=1; aa<=10;aa++) {
//			
//			if(aa%2!=0) { //홀수
//			
//				continue; //처음으로 돌아간다
//			
//			}
//			
//			System.out.println(aa); //짝수만 출력
//		}
//		
//		int aa2;
//		for (aa2=9;aa2<10;aa2++) {
//			if(aa2%2!=0) {
//				continue;
//			}
//		}
//		System.out.println(aa2);

//		int aa;
//		for(aa=9;aa<20;) {
//			if(aa%2!=0) {
//				aa++;
//				continue;
//			}
//			System.out.println(aa);
//			aa++;
//		}
//		
//		for (;;) { //이러면 무한 루프 /for 문을 비워놔도 무한 루프
//			
//		}

//		for(int xx=9;;xx++) {
//			if(xx%2!=0) {
//				continue;
//			}
//			System.out.println(xx);
//			if(xx>=20) {
//				break;
//			}
//			
//		}

		// 확인문제

		// 4,
//		//2.
//		String grade="B";
//		int score1=0;
//		switch(grade) {
//		case "A" ->score1=100;
//		case "B" ->{int result=100-20; score1=result;}
//		default -> score1=60;
//		}
////		System.out.println(score1);

		//3.
//		int sum = 0;
//		int ii;
//		for (ii = 1; ii <= 100; ii++) {
//			if (ii % 3 != 0) {
//				continue;
//			}
//
//			sum += ii;
//
//		}
//		
//		System.out.println("3의 배수 합"+sum);
		
		//4.
//		while(true) {
//			int a= (int)(Math.random()*6)+1;
//			int b= (int)(Math.random()*6)+1;
//			if (a+b!=5) {
//				
//				continue;
//			}
//			System.out.println("둘의 합은 5입니다.");
//			System.out.println(a);
//			System.out.println(b);
//			break;
//		}
		//5.
		//x=5/y=8
		//4x+5y=60
		int x;
		int y;
		// 우선 for문을 사용하라 했으니 
		for (x=1; x<=10;) {
			x++;
			for (y=1; y<=10;) {
				y++;
				if ((4*x)+(5*y)==60) {
					System.out.println(x);
					System.out.println(y);
					break;
				}
			}
		}
		
		
		
		
		
		
		
		// 6.
//		for(char aa='*'; aa<=5; aa++) {
//			System.out.println(aa);
//			}
		
		
		//7.
		
		
		
		
		//146p
		
		
		
		
		
		
		
		
		
	}
}
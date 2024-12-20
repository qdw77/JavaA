package ch04.sec02;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// if문/switch문까지는 조건문이고 while문/for문/do-while문은 반복문
		// p112
//			if (조건식) {
//				System.out.println("123");
//			}
//		int score=93;
//		if(score>=90) {
//			System.out.println("90보다 크거나 같음");
//		}else {
//			System.out.println("작음");
//		}

//		Math.random(); //0.0~1.0
//		Math.random()*10; //0.0~10.0
//		Math.random()*17; //0.0~17.0
//		(int)(Math.random()*6)+10 > 0.0~5.9999(각각 +10)>10.0~15.9999>int로 소수점 날림

//		int num1=(int)(Math.random()*45)+1;
//		System.out.println(num1);

//		int num=(int)(Math.random()*51)+50;
//		System.out.println(num);

//		int score =(int)(Math.random()*20)+81;
//		System.out.println("점수: "+score);
//		
//		String grade;
//		
//		if(score>=90) {
//			if(score>95) {
//				grade="A+";
//			}else {
//				grade="A";
//			}
//		}else {
//			if (score>=85) {
//				grade="B+";
//			}else {
//				grade="B";
//			}
//		}
//		
//		System.out.println("학점: "+grade);

		// switch > if보다 많은 조건이 있을 때 사용
		//

		// 146p

		// 자바의 데이터 타입 분류
		// 1. 기본 데이터 타입
		// 2. (ref)참조 타입
		// 위 두가지로 크게 분류

		// 참조:배열/열거/클래스/인터페이스(string?)
		// 기본:정수/실수/논리

		// 객체 object란?
		// 데이터와 메소드로 구성된 덩어리
		// 클래스에서 정의한 것을 토대로 메모리(실제 저장공간)에 할당된
		// 것으로 프로그램에서 사용되는 데이터 또는 식별자에 의해 참조되는 공간

		//

		// 149p

		// array string
//		int[] arr1; // 정수 배열 타입의 arr1선언
//		int[] arr2;
//		int[] arr3;
//		
//		arr1= new int[] {1,2,3};//arr1변수에 정수배열 객체를 생성해서 {1,2,3}값을 초기화
//		arr2= new int[] {1,2,3};
//		arr3=arr2; //arr3의 번지수를 arr2와 같게 함
//		
//		System.out.println(arr1==arr2);
//		System.out.println(arr2==arr3);

//		NullPointerException //nulll상태에서 접근하면 나타나는 오류
//		String reVar1="자바";
//		String reVar2=null;
//		int[] intar=null;
////		intar[0]=10;
//		String str =null;
//		System.out.println("총 문자 수: "+str.length());

//		String name; //선언 
//		name="홍길동";
//		String k="ㅓ";

		// 자바는 문자열 리터링이 동알하다면 String객체를 공유하도록 설계
//		String str1="ddd";
//		String str2="ddd";
//		
//		//객체 scanner new
//		String name1=new String("aa");
//		//new 키워드를 사용한 String 객체 생성
//		String name2=new String("aaa");
//		//문자열 리터럴 생성: 합에 같은 객체가 있으면 재활용
//		// new 키워드 생성: 같은 객체가 있어도 무조껀 새롭게
//		
//		String strVar1="홍길동";
//		String strVar2="홍길동";
//		
//		if(strVar1==strVar2) {
//			System.out.println("strVar1과 strVar2는 참조가 같음");
//		}else {
//			System.out.println("strVar1과 strVar2는 참조가 다름");
//		}
//		
//		if(strVar1.equals(strVar2)) {
//			System.out.println("strVar1과 strVar2는 문자열이 같음");
//		}
//		
//		String strVar3 = new String("홍길동");
//		String strVar4 = new String("홍길동");
//		
//		if(strVar3==strVar4) {
//			System.out.println("strVar3과 strVar4는 참조가 같음");
//		}else {
//			System.out.println("strVar3과 strVar4는 참조가 다름");
//		}
//		
//		if(strVar3.equals(strVar4)) {
//			System.out.println("strVar3과 strVar4는 문자열이 같음");
//		}

		// 문자열 추출
		//

		// 문자열 길이
		//

		// 문자열 대체
//		"hello".replace("h", "H");

		// 문자얄 객체 변경 함수: replace()
		// 문자열 잘라내기:substring(시작,까지) //함수로
		// 문자열 잘라내기:substring(시작)

		// String s="abcd";
		// s.substring(시작)

//		String ssn ="880815-1234567";
//		
//		String firstNum=ssn.substring(0,6);
//		System.out.println(firstNum);
//		
//		String secondNum=ssn.substring(7);
//		System.out.println(secondNum);
//		

		// 문자열 찾기

		String aa = """
				String subject="자바 프로그래밍";

				int location = subject.indexOf("프로그래밍");
				System.out.println(location);

				String substring = subject.substring(location);
				System.out.println(substring);

				location = subject.indexOf("자바");
				if(location != -1) {
					System.out.println("자바와 관련 있는 책이군요.");
				}else {
					System.out.println("자바와 관련 없는 책이군요.");
				}

				boolean result = subject.contains("자바");
				if (result) {
					System.out.println("자바와 관련 있는 책이군요.");
				}else {
					System.out.println("자바와 관련 없는 책이군요.");
				}
				""";

//		System.out.println(aa);

		// 위 문자열에서 중간번째 이후에 나타나는 "out"문자열의 수를 출력
		// +3개의 단어를 받아서 가장 많이 나온 키워드 추출 ex)out,system,자바 입력
		Scanner scanner = new Scanner(System.in);
		int aale = aa.length();
		String xx = aa.substring(aale / 2);
//		String target = "out";
		int count = 0;
		boolean key = true;

//			int pos=xx.indexOf(target);
		// .splt
		// string [] arr

		// 우선 문자열 하나 입력 받아서 갯수
		// 최종은 문자열 세가지 입력 받아서 갯수 비교 후 가장 많은 단어 출력
		// split(,) > array 리턴
		// string[] A = x.split(,);
		// >A[0]="A"
		// >A[1]="A"

//		String AAA="out,System,print";
//		String[] res=AAA.split(",");
//		res[0] //out 들어있음
//		res[1] //System 들어있음
//		res[2] // print 들어있음

		// 우선 문자열 하나씩 총 세가지를 입력을 받고 ex) String AAA="out,System,print";
		// 그 세가지 입력받은 값을 한 곳에 넣고 그 값을 분리한 후 ex) string[] A = x.split(,);
		// 값들의 갯수를 비교하여서 가장 많은 값 출력 
		
		// 반복문 후 switch로 돌아와서 다시 입력 혹은 case 1로 돌아오는 것
		
		// for문, while문, switch문 등의 반복문에 약함

		System.out.println("1.찾으려는 문자열 입력 2.종료");
		int menu = Integer.parseInt(scanner.nextLine());
		one: switch (menu) {
		case 1: {
			//
			System.out.println("찾으려는 문자열 입력");
			String c = scanner.nextLine();
			kk: while(key) {
				int pos = xx.indexOf(c);
				if (pos != -1) {
					count++;
					xx = xx.substring(pos + c.length());
					System.out.println(count); 
				}
			}

			break;
			
		}
		case 2:
			key = false;
			break;
		}

//		while(key) {
//			int pos=xx.indexOf(target);
//				
//			if(pos==-1) {
//				//out 못찾음
//	
//				System.out.println("더 없음");
//				break;
//			}else {
//				//out 찾음
//				count++;
//				xx=xx.substring(pos+target.length());
//				System.out.println(count);
//				
//			}
//		}

//		int aale=aa.length();		
//		int aal=aale/2;
////		System.out.println(aal);
//		String rle=aa.substring(aal);
////		System.out.println(rle);
//		int re = rle.indexOf("out");
////		System.out.println(re);
//		int count=0;
//		boolean key=true;
//		
////		>원하는 문자열 찾고 (inedxOf)찾으면 찾은 곳 (indexOf리턴값)부터 단어를 차고(indexOf)
////		또 나오면 찾은 수 체크(count++) 해놓고 또 그위치 찾다가(indexOf리턴값)반복하다가(for,while)
////		끝까지 읽었다(반복문 탈출)
//		
//		while(key) {
//			if(re!=-1) {
//				String ree = rle.substring(re);
//				re = ree.indexOf("out");
//				count+=1;
//				re-=1;	
//			}else {
//				key=false;
//				break;
//			}
//		}
//		System.out.println(count);

	}

}

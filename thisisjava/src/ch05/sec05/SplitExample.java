package ch05.sec05;

//import java.util.Calendar;
//import java.util.Scanner;

public class SplitExample {

	public static void main(String[] args) {
		// 2번 문제
		// 문자열에서 사용자입력을 통해 입력 받은 키워드 3가지 중
		// 가장 많이 나온 키워드 출력

		// 배열
		// 보통 변수는 하나의 값만 저장 가능
		// 저장하려는 값이 여러 개>배열을 사용한다
		// 배열 데이터 타입 String 처럼 객체 타입이다

		// 리스트의 공통점
		// 배열의 각 요소는 인덱스를 통해 조회가능
		// 인덱스는 []대괄호 사용

		// 차이점
		// 배열은 연속된 메모리 공간에 값을 나열시킨다
		// 배열은 같은 타입의 값만 저장 가능
		// 배열의 길이는 늘리거나 줄일 수 없음 //같은 값만 저장 가능해서 용량이 전부 같다

		// 리스트 배열 순차적으로 요소에 접근 가능
		// 내부적으로 메모리를 차지하는 방식이 다르다

		// 자바 배열 연속적인 메모리 공간을 차지
		// 파이썬 리스트는 연속적일수도 아닐수도

		// 파이썬 리스트는 도적 크기 배열
		// 리스트 + 라이브러리(모듈 등의 확장 패키지)

		// 자바의 배열은 실질적으로 연속 데이터이고 리스트는 그럴때도 있고 아닐 때도 있다(리스트는 동적)

		// 배열 변수의 선언

		// 타입[] 변수명;
		// 타입 변수[];

		// int[] intArray;
		// String[] strArray;

		// int intArray[];
		// String strArray[];

		// int x={1,2,3,4,5};
		// 배열 변수 선언과 배열 생성

//		String[] season = { "String", "summer", "Fall", "Winter" };
////		season[1]="여름"; //인덱스 통한 값 변경
//
//		// 배열의 항목값 읽기
//		System.out.println("season[0]: " + season[0]);
//		System.out.println("season[1]: " + season[1]);
//		System.out.println("season[2]: " + season[2]);
//		System.out.println("season[3]: " + season[3]);
//
//		// 인덱스 1번 항목의 값 변경
//		season[1] = "여름";
//		System.out.println("season[1]: " + season[1]);
//		System.out.println();
//
//		// 배열 변수 선언과 배열 생성
//		int[] scores = { 83, 90, 87 };
//
//		// 총합과 평균 구하기
//		int sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총합: " + sum);
//		double avg = (double) sum / 3;
//		System.out.println("평균: " + avg);
//
//		// p172
////		x=new[] {1,2,3,4,5};
////		public static void printItem(int[] scores) {
////		
////		~~~~~
////		~~~~~
////
////		}//사용자 함수의 선언 정리 //void는 변환 값이 없는 함수라는 의미
////		printItem();//함수의 호출
////		printItem({95,85,90); //컴파일 에러
////		printItem(new int[] {95,58,90}); //에러x

//		//배열 변수 선언
//		int[] scores;
//		
//		//배열 변수에 배열을 대입
//		scores=new int[] {83,90,87};
//		
//		//배열 항목의 총합을 구하고 출력
//		int sum1=0;
//		for (int i=0; i<3; i++) {
//			sum1+=scores[i];
//		}
//		System.out.println("총합: "+sum1);
//		
//		//배열을 매개값으로 주고, printItem() 매소드 호출
//		printItem( new int[] {83,90,87});
		// 배열에 값 전달은 리터럴이 아닌 객체 상태로 할당해야함

		// []타입 식별자 = null
		// 식별자 = new 타입[길이]
//		int[] intArray= new int [5];
//		
//		//초기 값(리터럴) 지정이 안되면 각 테이터 타입의 기본값으로
//		//초기화된다
//		//기본 데이터 타입들은 전부 0,0,0,false
//		//참조 타입의 기본값은 null
//
////		int[] intArray2=new int[30]; //기본값이 0으로 채워짐
////		String[] names = new String[30]; //기본 값이 null로 채워짐
//		
//		int[] arr1 = new int[3];
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr1["+i+"] : "+arr1[i]+", ");
//		}
//		System.out.println();
//		
//		arr1[0]=10;
//		arr1[1]=20;
//		arr1[2]=30;
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr1["+i+"] : "+arr1[i]+", ");
//		}
//		System.out.println("\n");
//		
//		
//		
//		double[] arr2 = new double[3];
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr2["+i+"] : "+arr2[i]+", ");
//		}
//		System.out.println();
//		
//		arr2[0]=0.1;
//		arr2[1]=0.2;
//		arr2[2]=0.3;
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr2["+i+"] : "+arr2[i]+", ");
//		}
//		System.out.println("\n");
//		
//		String[] arr3 = new String[3];
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr3["+i+"] : "+arr3[i]+", ");
//		}
//		System.out.println();
//		
//		arr3[0]="1월";
//		arr3[1]="2월";
//		arr3[2]="3월";
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr3["+i+"] : "+arr3[i]+", ");
//		}
//		System.out.println("\n");

//		int[] intArray2=new int[30]; //기본값이 0으로 채워짐
//		String[] names = new String[30]; //기본 값이 null로 채워짐

//		// 배열의 길이는 저장할 수 있는 항목의 수
//		// 배열함수.length; 읽기만 가능
//		intArray2.length=100;
//		~~~~=intArray2.length;
//		
//		for(int i=0; i<scores.length; i++) {
//			
//			
//		}

//		int[] scores= {84,90,96};
//		int sum = 0;
//		for (int i = 0; i<scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총합: " + sum); 
//		
//		double avg =(double) sum/scores.length;
//		System.out.println("평균: "+avg);

//		// 다차원 배열
//		// p178
//		// 변수[1차원 인덱스][2차원 인덱스]....[n차원 인덱스]
//		// 변수[0][0][0]

//		// 타입[][] 변수 = {
//			//	{값1,값2....},
//			//	{값3,값4....}
//			//	...... 	
//	//	};

//		int[][] x= {{1,2,3,4,5},{6,7,8,9,10}};
//		x[0][2]
//		x[0].length=>5
//		x[0].length=>5
//		int[][] scores= {
//				{80,90,96},{76,88}
//		};
//		
//		System.out.println("1차원 배열의 길이(반의 수): "+scores.length);
//		System.out.println("2차원 배열의 길이(첫 번쨰 반의 학생 수): "+scores[0].length);
//		System.out.println("2차원 배열의 길이(두 번쨰 반의 학생 수): "+scores[1].length);
//		
//		System.out.println("scores[0][2]: "+scores[0][2]);
//		
//		System.out.println("scores[0][2]: "+scores[1][1]);
//		
//		int Class1Sum=0;
//		for(int i=0; i<scores[0].length; i++) {
//			Class1Sum+=scores[0][i];
//		}
//		double class1Avg=(double) Class1Sum/scores[0].length;
//		System.out.println("첫 번째 반의 평균 점수: "+class1Avg);
//		
//		
//		int class2Sum=0;
//		for(int i=0; i<scores[1].length; i++) {
//			class2Sum +=scores[1][i];
//		}
//		double class2Avg=(double) class2Sum/scores[1].length;
//		System.out.println("첫 번째 반의 평균 점수: "+class2Avg);
//		
//		int totalStudent=0;
//		int totalSum=0;
//		for(int i=0; i<scores.length; i++) {
//			totalStudent+=scores[i].length;
//			for(int k=0; k<scores[i].length; k++) {
//				totalSum+=scores[i][k];
//			}
//		}
//		double totalAvg=(double)totalSum/totalStudent;
//		System.out.println("전체 학생의 평균 점수: "+totalAvg);

//		// new 연산자로 다차원 배열 생성
		// int[][] x =new int[2][3];
		// String[][] y=new String[3][5];

//		int[][] x=new int[2][3];
//		
//		int[][] x=new int[2][];
//		
//		x[0]=new int[3];
//		x[1]=new int[2];

//		int[][] mathScores=new int[2][3];
//		
//		for(int i=0; i<mathScores.length; i++) {
//			for (int k=0; k<mathScores[i].length; k++) {
//				System.out.println("mathScores["+i+"]["+k+"]: "+mathScores[i][k]);
//			}
//		}
//		
//		System.out.println();
//		
//		mathScores[0][0]=80;
//		mathScores[0][1]=83;
//		mathScores[0][2]=85;
//		mathScores[1][0]=86;
//		mathScores[1][1]=90;
//		mathScores[1][2]=92;
//		
//		int totalStudent=0;
//		int totalMathSum=0;
//		for(int i=0; i<mathScores.length; i++) {
//			totalStudent+=mathScores[i].length;
//			for(int k=0; k<mathScores[i].length; k++) {
//				totalMathSum+=mathScores[i][k];
//			}
//		}
//		
//		double totalMathAvg=(double) totalMathSum/totalStudent;
//		System.out.println("전체 학생의 수학 평균: "+totalMathAvg);
//		System.out.println();
//		
//		int[][] englishScores= new int[2][];
//		englishScores[0]=new int[2];
//		englishScores[1]=new int[3];
//		
//		for (int i=0; i<englishScores.length; i++) {
//			for(int k=0; k<englishScores[i].length; k++) {
//				System.out.println("englishScores["+i+"]["+k+"]: "+englishScores[i][k]);
//			}
//		}
//		System.out.println();
//		
//		englishScores[0][0]=90;
//		englishScores[0][1]=91;
//		englishScores[1][0]=92;
//		englishScores[1][1]=93;
//		englishScores[1][2]=94;
//		
//		totalStudent=0;
//		int totalEnglishSum=0;
//		for(int i=0; i<englishScores.length; i++) {
//			totalStudent+=englishScores[i].length;
//			for(int k=0; k<englishScores[i].length; k++) {
//				totalEnglishSum+=englishScores[i][k];
//			}
//		}

//		double totalEnglishAvg=(double) totalEnglishSum/totalStudent;
//		System.out.println("전체 학생의 수학 평균: "+totalEnglishAvg);
//		System.out.println();

//		// 객체를 참조하는 배열

//		String[] strArray=new String[3];
//		strArray[0]="java";
//		strArray[1]="java"; //있던 것에 덮어쓰기?
//		strArray[2]=new String("java"); //새롭게
//		
//		
//		System.out.println(strArray[0]==strArray[1]);
//		System.out.println(strArray[0]==strArray[2]);
//		System.out.println(strArray[0].equals(strArray[2]));

//		// 배열복사
		// System.arraycopy(원본, 원본 시작 idx, 복사배열, 복사배열 시작 위치, 항목 수);

//		// 길이 3인 원본 배열 생성
//		String[] oldStrArray = { "java", "array", "cope" };
//		// 길이 5인 복사 배열 생성
//		String[] newStrArray = new String[5];
//		// 배열 항목 복사(주소 복사)
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		// 배열 항목 출력
//		for (int i = 0; i < newStrArray.length; i++) {
//			System.out.println(newStrArray[i] + ", ");
//		}

//		// 향상된 for문

//		for(변수: 배열)
//		int[] scores= {95,71,84,93,87};
//		int sum=0;
//		for(int score : scores) {
//			sum=sum+score;
//		}
//		System.out.println("점수 총합: "+sum);

		// 열거형
		// 요일 계절 외 한정된 값을 갖는 타입
		// Enum 파일로 제작
//		Week today = null;
//
//		Calendar cal = Calendar.getInstance();
//
//		int week = cal.get(Calendar.DAY_OF_WEEK);
//
//		switch (week) {
//		case 1:
//			today = Week.SUNDAY; break;
//		case 2:
//			today = Week.MONDAY; break;
//		case 3:
//			today = Week.TUESDAY; break;
//		case 4:
//			today = Week.WEDNESDAY; break;
//		case 5:
//			today = Week.THURSDAY; break;
//		case 6:
//			today = Week.FRIDAY; break;
//		case 7:
//			today = Week.SATURDAY; break;
//		}
//
//		
//		if (today == Week.SUNDAY) {
//			System.out.println("일요일에는 축구를 합니다.");
//		} else {
//			System.out.println("열심히 자바를 공부합니다.");
//		}
		
		//클래스부터 중급이라고 표현
		
		
		//2,3,1,2,3,3&5,
		
		
//		int[] array = {1,5,3,8,2}; //최대값 20일날 했었음
		
		
		
		
		
//		int[][] array= {
//				{95,86},
//				{83,92,96},
//				{78,83,93,87,88}
//		}; //합과 평균
//		
//		for (int i =0; i<array.length; i++) {
//			for(int k=0; k<array[i].length; k++) {
//				System.out.println("array["+i+"]["+k+"l: "+array[i][k]);
//			}
//		}
//		
//		int totalA=0;
//		int totalSum=0;
//		
//		for(int i=0; i<array.length; i++) {
//			totalA+=array[i].length;
//			for (int k=0; k<array[i].length; k++) {
//				totalSum+=array[i][k];
//			}
//		}
//		double totalAvg=(double)totalSum/totalA;
//		
//		System.out.println(totalA);
//		System.out.println("전체 합: "+totalSum);
//		System.out.println("전체 평균: "+totalAvg);
		
		
		
		
		//학생 수와 점수를 입력받고 while문과 nextLine매소드를 이용해서 최고 점수 및 평균점수를 출력
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
//		int st=
//		
//		while(st) {
//			
//			
//			
//			
//			
//		}
		
		
		
		
		
		
		
		
		
		
		

	}

//	//printItem() 매소드 선언
//	public static void printItem(int [] scores) {
//		

//		//매개변수가 참조하는 배열의 항목을 출력
//		for(int i=0; i<3; i++) {
//			System.out.println("score["+i+"]:"+scores[i]);
//		}
//	}

}

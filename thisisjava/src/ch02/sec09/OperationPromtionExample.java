package ch02.sec09;

public class OperationPromtionExample {

	public static void main(String[] args) {
		

		//문자열에서 다른 기본 데이터 타입으로 변화
		String st="100";
		Byte.parseByte(st);
		Short.parseShort(st);
		Integer.parseInt(st);
		Long.parseLong(st);
		
		//기본 데이터 타입 --> 문자열 변환
		String str = String.valueOf("기본타입값");
				
		byte result1=10+20;
		System.out.println("reslut1: "+result1);
		
		byte v1 =10;
		byte v2 =20;
		int result2 = v1+v2;
		System.out.println("result2: "+result2);

		byte v3 = 10;
		int v4 =100;
		long v5 = 1000L;
		long result3= v3+v4+v5;
		System.out.println("result3: "+result3);
		
		char v6 = 'A';
		char v7 =1;
		int result4 = v6+v7;
		System.out.println("result4: "+ result4);
		System.out.println("result4: "+ (char)result4);
		
		int v8 = 10;
		int result5=v8/4;
		System.out.println("result5: "+ result5);
		
		int v9 = 10;
		double result6= v9 / 4.0;
	}

}

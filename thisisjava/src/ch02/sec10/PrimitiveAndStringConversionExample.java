package ch02.sec10;

import java.awt.Window.Type;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
		//문자열에서 다른 기본 데이터 타입으로 변화
		String st="100";
		Byte.parseByte(st);
		Short.parseShort(st);
		Integer.parseInt(st);
		Long.parseLong(st);
		
		//기본 데이터 타입 --> 문자열 변환
		String str = String.valueOf("기본타입값");
		
		int value1=Integer.parseInt("10");
		double value2=Double.parseDouble("3.14");
		boolean value3=Boolean.parseBoolean("True");
		
		
		
		System.out.println("value1: "+value1);
		System.out.println("value1 Type=");
		System.out.println("value2: "+value2);
		System.out.println("value3: "+value3);
		
		String str1=String.valueOf(10);
		String str2=String.valueOf(3.14);
		String str3=String.valueOf(true);

		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
	}

}

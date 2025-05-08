package com.Sample.classpreview;

public class Main5 {
	public static void main(String [] args) {
		Bicycle.changeCadenceStaticVersion(0);
		
		// println 메서드는 system 클래스의 static 필드만 out의 인스터스 메서드입니다.
//		System.out.println("aaaaaaaaaa helloword !!!!!!!!!! ");
		
		System.out.println(" 후후후   "  + Math.abs(-3));
		System.out.println(Bicycle.count);
	}
}

package com.Sample.classpreview;

public class Main3 {
	public static void main(String [] args) {
		// Reference Data type... Bicycle 클래스 객체가 아님
		Bicycle bicycle = 
				// new : C++에서 처음 소개되었음
				//       클래스 객체를 인스턴스화 하는 키워드
				new Bicycle();
	}
}

package com.Sample.variables;

public class JVariables {
	int first; 
	
	public static int func(int x, int b) {
		int ret = x+ b;
		return ret;
	}
 
	// 실행 가능한 jar 파일은 최소 한개 이상의 main 메서드가 정의되어야 한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 특정 데이터 타입의 값을 저장하기 위한 용도로 사용
		// 지역변수 : local variable
		// data type : variables name
		// 다음 5를 literal [코드로 작성한 값] 이라고 한다.
		  // statement
        
		// 자바의 대입연산자(=) 기준으로 left/right side에 올 수 있는 것을 정리해줘
		// first가 어떻ㄷ게 생성하느냐
		//int second = first;
        
        //int third = first + second;        
        
		//System.out.println(">>>>>>>>>>>>>>>>>>>>>>> " + third);
		
		//main이 func의 호출자 [caller]
		//다음 메서드 호출식에서 first와 second는 argument[parameter의 값]
		//int ret = func(first, second);
		
		//System.out.println(">>>>>>>>>>>>>>>>>>>>>>> " + ret);\
		
		JVariables ref = new JVariables();
		
		ref.first = 1;
		
		return;
	}
}

package outofpackage;

public class HelloMain {

	// HelloMain 클래스의 멤버로,
	// static main 메소드에서 호출할 수 있는 메서드를 정의한다면,
	// 어떤 메서드 타입을 정의해야 할까요?
	// 1. Instance Method ( non-static method )
	// 2. static Method
	
	public void hello() {
		
	}
	
	public static int staticHello() {
		int ret;
		ret = 1;
		
		return ret; // ret 변수에 저장되어 있는 값을 staticHello 메서드 호출자에게 리턴함
	}
	
	
	public static void main(String[] args) {
		int helloWorld = 0;
		helloWorld = helloWorld + 3;
		staticHello();       // static main 메서드는 non-static method를 호출할 수 없음
		
		HelloMain.staticHello();
	}

}

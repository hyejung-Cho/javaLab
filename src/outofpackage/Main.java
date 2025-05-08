package outofpackage; // Main 클래스가 어떤 패키지 소속인지를 밝힌다.

public class Main {

	// 시작점 : 엔트리포인트(우리가 작성한 코드 중에 처음으로 싱행되는 코드
	public static void main(String[] args) { // VM이 호출하는 메서드임
		// TODO Auto-generated method stub
		
		// Circle 클래스는 객체참조 변수 : Circle mycircle
		// Circle 클래스 객체를 생성한느 코드 :  new Circle(20,20,60.0)
		// 참조 변수는 값으로 클래스 객체 인스턴스 대한 참조 값
		Exam test = new Exam(1,30,"TEST");
		
		System.out.println("TEST : icar = " + test.getIcar());
		System.out.println("TEST : age = " + test.getAge());
		System.out.println("TEST : " + test.getName());
		
		test.setIcar(3000);
		test.setAge(25);
		test.setName("토끼");
		
		System.out.println("TEST : icar = " + test.getIcar());
		System.out.println("TEST : age = " + test.getAge());
		System.out.println("TEST : " + test.getName());

	}

}

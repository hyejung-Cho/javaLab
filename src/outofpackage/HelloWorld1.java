package outofpackage;

//import quiz.Hello;
//import quiz.World;

public class HelloWorld1 {

	public static void main(String[] args) {
	     Animals animals = new Animals(); // Animals 클랙스 객체 인스턴스를 만들어 달람고함
	                                      // 정상적으로 Animals 클래스 객체 인스턴스가 만들어진다
	                                      // 인스턴스를 참조할 수 있는 값이 animals 참조변수에
	                                      // 대입된다
	     
	     // animal 참조 변수에 멤버 액세스 연산자(.)르 사용해서 Animals 클래스의 인스턴스 메서드인
	     // hello 메서드를 아래와 같이 호출(사용)할 수 있다 
	     animals.hello();
		
	}
}

package outofpackage;

public class Exam {
	//  멤버
	// - 필드
	// - 컨슽럭트
	// - 메서드
	private int icar = 0;
	private int age = 1;
	private String name = "A";
	
	public Exam() {}
	
	public Exam(int icar) {
		this.icar = icar;
	}
	
	public Exam(int icar, int age, String name) {
		// this 키워드는 클래스 객체 자기 자신을 나타낸다.
		//'.'의 의미는 맴버 액세스 연산자
		this(icar);
		this.age = age;
		this.name = name;
	}
		

	public int getIcar() {
		return icar;
	}

	public void setIcar(int icar) {
		this.icar = icar;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

}

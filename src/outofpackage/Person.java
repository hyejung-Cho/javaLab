
package outofpackage;

//import quiz.Hello;

public class Person {
	// 현실세계의 사람이라는 객체를 클래스로 구현함
	// Person 클래스 객체 인스탄스들은 서로 다른 상태{필드]를 가질 수 있다
	private int gender = 0; //0:여자, 1:남자
	private int age = 0;
	private int address = 0;
	private int phoneNumber = 0;
	
	Hello hello; // outofpackage Hello를 가져온다
	
	public Person() {}

	// 일반적으로 컨스트럭터의 파리미터는 클래스의 필드 값을 설정하기 위함이다
	// 쿨론 이 파라미터의 아규먼트[인자: 값] 호출하는 호출자의 
	public Person(int gender, int age, int address, int phoneNumber) {
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public int getGender() {
		return this.gender;
	}
	
	// this 참조를 사용하는 또 다른 이유는 다음 세터 메서드처럼,
	// 파라미터 이름과 필드 이름이 동일할 때,
	// 필드 이름이 shadowing 되는 것을 해결해 준다. ( shadowing 객체 변수를 가림 => this.age에서 age)
	// : 자바는 상위 범위에 이미 선언된 변수[여기서는 필드]와 동일한 이름으로 변수[여기선느 파라미터 이름]을 다시 선언하면,
	//   상위 범위의 변수[필드]가 보이지 않게 된다.
	//   -> 예를 들어, setGender 블럭 내에서 보이지 않는다.
	public void setGender(int gener) {
		this.gender = gener;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAddress() {
		return this.address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public static void main(String[] args) {
		Person A = new Person(1,2,3,4);
		Person B = new Person(4,5,6,7);
		Person C = new Person(8,9,10,11);
		
		// 아래 코드는 각각의 Person 클래스 객체 인스턴스 참조변수에 멤버 액세스 연산자를 적용하여
		// setAge라는 동일한 Person 클래스 객체 인스턴스를 사용한다
		A.setAge(9);
		B.setAge(10);
		C.setAge(11);
		
		Animals.helloWorld(); // Utility or Helper 성격의 static method
		                      // 
	}
}

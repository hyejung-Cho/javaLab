package outofpackage;

public class Animal {
	
	private int dog = 0;
	private int cat = 0;
	private int pig = 0;
	private int bear = 0;
	
	public Animal() {}
	
	public Animal(int dog) {
		this.dog = dog;
	}
	
	public Animal(int dog, int cat ) {
		this(dog);
		this.cat = cat;
	}
	
	public Animal(int dog, int cat, int pig) {
		this(dog, cat);
		this.pig = pig;
	}
	public Animal(int dog, int cat, int pig, int bear) {
		this(dog, cat, pig);
		this.bear = bear;
	}
	
	public static void helloWorld() {
		System.out.println("Hello Word!!!!!!");
	}
	
	public int getDog() {
		return dog;
	}

	public void setDog(int dog) {
		this.dog = dog;
	}

	public int getCat() {
		return cat;
	}

	public void setCat(int cat) {
		this.cat = cat;
	}

	public int getPig() {
		return pig;
	}

	public void setPig(int pig) {
		this.pig = pig;
	}

	public int getBear() {
		return bear;
	}

	public void setBear(int bear) {
		this.bear = bear;
	}

	// VM이 Program 클랫 객체를 생성[인스턴스]하지 않아도
	// main 메서드를 호출할 수 있다.
	// main 메서드 modifier 중에  static 키워드가 적용되었기 때문에
	public static void main(String [] args) {
		int dog = 1;
		int cat = 2;
		int pig = 3;
		int bear = 4;
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal(dog);
		Animal animal3 = new Animal(dog, cat);
		Animal animal4 = new Animal(dog, cat, pig);
		Animal animal5 = new Animal(dog, cat, pig, bear);
		
		int xxx = animal1.getDog();
		
		animal1.getCat();
		// 클래스 이름 다음에 멤버 액세스 연산자
		Animal.helloWorld();  // Animals 클래스 객체를 인스턴스하지 않아도 사용할 수 있는 코드...
		
		animal1.setDog(9000); // 참조 변수를 통해 helloWorld라는 스태틱 메서드를 호출하고 있다...
		                      // 컴파일 에러는 발생하지 않았지만, 이런식으로 사용하지 마라고 경고가 발생함.	       
		
		System.out.println(">>>>>>>>>>>>>>>>>>>> " + animal1.getDog());
	}
}

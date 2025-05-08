package outofpackage;

class Animals {
	
	// 현실세계의 동일한 타입의 객체는 서로 다른 상태로 가지고 있을 수 있다.
	private int dog = 1;
	private int cat = 1;
	private int pig = 1;
	private int bear = 1;
	
	public Animals(){}

	public Animals(int dog) {
		// this pointer(지시자: 자바는 극도로 C/C++ pointer 개념을 싫어 함
		// 인스턴스 자신을 참조
	    this.dog = dog;
	}

	public Animals(int dog, int cat) {
		this(dog);
		this.cat = cat;
	}
	
	public Animals(int dog, int cat, int pig) {
		this(dog, cat);
		this.pig = pig;
	}
	
	public Animals(int dog, int cat, int pig, int bear) {
		this(dog, cat, pig);
		this.bear = bear;
	}
	
	public void animalsOverloadingMethod() {
		
	}
	
	public void animalsOverloadingMethod(int a) {
		
	}
	
	public void animalsOverloadingMethod(int a, int b) {
		
	}
	
	public void hello() {
		Animals.helloWorld();
	}
	
	public static void helloWorld() {
		System.out.println("hello world");
	}
	
	public int getDog() {
		return dog;
	}

	public void setDog(int dog) {
		this.dog = dog;
		return;
	}

	public int getCat() {
		return this.cat;
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
}
package outofpackage;

public class Hello {
    private int ret = 0;
    private int age = 10;


	public Hello() {}
     
    public static int staticHello(int ret) {
		return ret;
	}
    
    public void printHelloWorld(int age) {    	
    	System.out.println("callWorld::age = " + age);
    } 
	
	public int getRet() {
		return ret;
	}

	public void setRet(int ret) {
		this.ret = ret;
	}
	
    
    public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void callWorld() {		
		setAge(10);
	    ret = Hello.staticHello(getAge());
	    printHelloWorld(getAge());
	    
	    setAge(30);
		printHelloWorld(getAge());	
	}
	
	public static void main(String[] args) {
		Hello helloWorld = new Hello();
    	helloWorld.callWorld();
	
	}

}

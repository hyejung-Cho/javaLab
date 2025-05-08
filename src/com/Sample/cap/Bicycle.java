package com.Sample.cap;

// 암시적으로 Object 클래스를 상속...extends 보이지 않지만,
// 디폴트로 Object 클래스가 생성
public class Bicycle {

	// 다음 필드들은 외부에서 엑세스할 수 없도록, private 키워드르 적용
	// 데이터 캡슐화(외부로부터...)
    private int cadence = 0; 
    private int speed = 0;
    private int gear = 1;
    
    // 파라미터 리스트가 정의하지 않은 컨스프럭터를 보통 디폴드 컨스트럭터
    public Bicycle() {
    	System.out.println("***** Constructor Bicycle *****");
    }
    
    public Bicycle(int cadence) {
    	this.cadence = cadence;
    }
    
    public Bicycle(int cadence, int speed) {
    	this(cadence);
    	this.speed = speed;
    }
    
    public Bicycle(int cadence, int speed, int gear) {
    	this(cadence, speed);
    	this.gear = gear;
    }
    
    // 외부에서 사용하는 목적에 따라
    // getter
	public int getCadence() {
		return cadence;
	}
	
	// 외부에서 사용하는 목적에 따라
    // setter
	public void setCadence(int cadence) {
		this.cadence = cadence;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
    
}
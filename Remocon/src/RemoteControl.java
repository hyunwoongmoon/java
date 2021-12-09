
public interface RemoteControl {
	// 인터페이스는 클래스가 아니라 다 밖에서 쓰인다.(public일 수 밖에 없음)
	
	// 필드가 없다.(변수 X, 상수선언(사실상 변수) O)
	static final double pi=3.141592; // 상수 필드 만들 때 public static final 변수 / final 값이 바뀌지 않는.
	int MAX_VOLUME=10; // 사실상 변수
	int MIN_VOLUME=0; // 상수선언
	// 생성자가 없다. -> new 연산자를 사용할 수 없다.
	// 메소드만 존재(추상메소드/디폴트메소드/정적메소드) ★
	
	// 추상메소드 (abstract 있어도 되고 없어도 됨.)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 - 일반 클래스의 일반 메소드
	default void setMute(boolean mute) { // default 써주어야 함.
		if(mute) {
			System.out.println("무음처리");
		} else {
			System.out.println("무음해제");
		}
	}
	
	// 정적(static) 메소드
	static void changeBattery() {
		System.out.println("건전지 교환");
	}

}

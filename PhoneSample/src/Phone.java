
public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}
		
//	public void turnOn() {
//		System.out.println("폰 전원을 켭니다.");
//	}
//	public void turnOff() {
//		System.out.println("폰 전원을 끕니다.");
//	}
	// 추상 - 오버라이딩 때문에 존재 / 안쓰는 코드를 부모 클래스에 만들어 놓을 필요가 없다. (자식 클래스에서 turnOn turnOff를 만든 상황)
	// 추상클래스는 추상 메소드 선언을 위해서 만든다. - 오버라이딩을 부담없이 하기 위해서.
	public void search() {
		System.out.println("검색합니다");
	}
	public abstract void turnOn();
	public abstract void turnOff();
	
}

	

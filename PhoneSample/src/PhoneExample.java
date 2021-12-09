
public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone("moon");
		// 추상클래스는 new 연산자 이용해서 인스턴스 변수 생성 불가능.
		SmartPhone smartPhone = new SmartPhone("moon");
		
		smartPhone.turnOn();
		smartPhone.search(); 
		smartPhone.turnOff();
		
		CellPhone cellPhone = new CellPhone("moon1");
		cellPhone.turnOn();
		cellPhone.YoutubeSearch();
		cellPhone.turnOff();
	}
}

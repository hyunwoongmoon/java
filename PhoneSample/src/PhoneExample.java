
public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone("moon");
		// �߻�Ŭ������ new ������ �̿��ؼ� �ν��Ͻ� ���� ���� �Ұ���.
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

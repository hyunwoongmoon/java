
public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}
		
//	public void turnOn() {
//		System.out.println("�� ������ �մϴ�.");
//	}
//	public void turnOff() {
//		System.out.println("�� ������ ���ϴ�.");
//	}
	// �߻� - �������̵� ������ ���� / �Ⱦ��� �ڵ带 �θ� Ŭ������ ����� ���� �ʿ䰡 ����. (�ڽ� Ŭ�������� turnOn turnOff�� ���� ��Ȳ)
	// �߻�Ŭ������ �߻� �޼ҵ� ������ ���ؼ� �����. - �������̵��� �δ���� �ϱ� ���ؼ�.
	public void search() {
		System.out.println("�˻��մϴ�");
	}
	public abstract void turnOn();
	public abstract void turnOff();
	
}

	

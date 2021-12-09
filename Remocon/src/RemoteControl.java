
public interface RemoteControl {
	// �������̽��� Ŭ������ �ƴ϶� �� �ۿ��� ���δ�.(public�� �� �ۿ� ����)
	
	// �ʵ尡 ����.(���� X, �������(��ǻ� ����) O)
	static final double pi=3.141592; // ��� �ʵ� ���� �� public static final ���� / final ���� �ٲ��� �ʴ�.
	int MAX_VOLUME=10; // ��ǻ� ����
	int MIN_VOLUME=0; // �������
	// �����ڰ� ����. -> new �����ڸ� ����� �� ����.
	// �޼ҵ常 ����(�߻�޼ҵ�/����Ʈ�޼ҵ�/�����޼ҵ�) ��
	
	// �߻�޼ҵ� (abstract �־ �ǰ� ��� ��.)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// ����Ʈ �޼ҵ� - �Ϲ� Ŭ������ �Ϲ� �޼ҵ�
	default void setMute(boolean mute) { // default ���־�� ��.
		if(mute) {
			System.out.println("����ó��");
		} else {
			System.out.println("��������");
		}
	}
	
	// ����(static) �޼ҵ�
	static void changeBattery() {
		System.out.println("������ ��ȯ");
	}

}

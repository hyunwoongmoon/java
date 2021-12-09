
public class RemoteControlSample {

	public static void main(String[] args) {
		RemoteControl tv = new RemoteControl() {
		private int volume;
		
		public void turnOn() {
			System.out.println("TV�� �մϴ�");
		}
		public void turnOff() {
			System.out.println("TV�� ���ϴ�");
		}
		public void setVolume(int v) {
			if(v>RemoteControl.MAX_VOLUME) {
				this.volume=RemoteControl.MAX_VOLUME;
			} else if(v<RemoteControl.MIN_VOLUME) {
				this.volume=RemoteControl.MIN_VOLUME;
			} else {
				this.volume=v;
			}
			System.out.println("����TV����: "+this.volume);
		}
		@Override
		public void setMute(boolean b) {
			System.out.println("boolean "+b);
		}
		};
		
		tv.turnOn();
		tv.setVolume(7);
		tv.turnOff();
		RemoteControl.changeBattery();
		
		RemoteControl audio=new RemoteControl() { // �ڽ�Ŭ������ �θ�Ŭ������ �ڵ�����ȯ
		// �θ�Ŭ������ ����(�ν��Ͻ�) = new �ڽ�Ŭ������();
		// �߻�Ŭ������ ����(�ν��Ͻ�) = new �ڽ�Ŭ������();
		// �������̽��� ����(�ν��Ͻ�) = new ����Ŭ������();
		private int volume;
			
		public void turnOn() {
			System.out.println("������� �մϴ�");
		}
		public void turnOff() {
			System.out.println("������� ���ϴ�");
		}
		public void setVolume(int v) {
			if(v>RemoteControl.MAX_VOLUME) {
				this.volume=RemoteControl.MAX_VOLUME;
			} else if(v<RemoteControl.MIN_VOLUME) {
				this.volume=RemoteControl.MIN_VOLUME;
			} else {
				this.volume=v;
			}
			System.out.println("������������: "+this.volume);
		}
		@Override
		public void setMute(boolean b) {
			System.out.println("boolean "+b);
		}
		};
		
		audio.turnOn();
		audio.setVolume(6);
		audio.setMute(true);
		audio.turnOff();
	}
}


public class RemoteControlSample {

	public static void main(String[] args) {
		RemoteControl tv = new RemoteControl() {
		private int volume;
		
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
		public void setVolume(int v) {
			if(v>RemoteControl.MAX_VOLUME) {
				this.volume=RemoteControl.MAX_VOLUME;
			} else if(v<RemoteControl.MIN_VOLUME) {
				this.volume=RemoteControl.MIN_VOLUME;
			} else {
				this.volume=v;
			}
			System.out.println("현재TV볼륨: "+this.volume);
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
		
		RemoteControl audio=new RemoteControl() { // 자식클래스는 부모클래스로 자동형변환
		// 부모클래스명 변수(인스턴스) = new 자식클래스명();
		// 추상클래스명 변수(인스턴스) = new 자식클래스명();
		// 인터페이스명 변수(인스턴스) = new 구현클래스명();
		private int volume;
			
		public void turnOn() {
			System.out.println("오디오를 켭니다");
		}
		public void turnOff() {
			System.out.println("오디오를 끕니다");
		}
		public void setVolume(int v) {
			if(v>RemoteControl.MAX_VOLUME) {
				this.volume=RemoteControl.MAX_VOLUME;
			} else if(v<RemoteControl.MIN_VOLUME) {
				this.volume=RemoteControl.MIN_VOLUME;
			} else {
				this.volume=v;
			}
			System.out.println("현재오디오볼륨: "+this.volume);
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

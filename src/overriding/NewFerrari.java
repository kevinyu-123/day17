package overriding;

public class NewFerrari extends Ferrari {
	
	public NewFerrari(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드 시작");
	}
	public void speed() {
		System.out.println(getYe()+"년식의 속도는 500km 이다.");
		System.out.println("속도가 업그레이드 되었다.");
	}
}

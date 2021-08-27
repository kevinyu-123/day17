package overriding;

public class Ferrari {
	private int y;
	
	public Ferrari(int y) {
		this.y =y;
	}
	public int getYe() {
		return y;
	}
	
	public void speed(){
		System.out.println(y+"년식 페라리의 속도 : 300km");
	}
	
}

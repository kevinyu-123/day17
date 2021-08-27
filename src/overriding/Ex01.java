package overriding;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 상속의 개념
		 */
		Ferrari fe = new Ferrari(2021);
		fe.speed();

		System.out.println("=========");

		NewFerrari nf = new NewFerrari(2022);
		nf.speed();
		nf.autoSystem();
	}
}

package animal;

public class AnimalBean {
	//フィールド宣言

	// 名前
	private  String name;

	//体長
	private double height;

	//速度
	private int speed;

	// 名前を設定するメソッド
	public void setName(String na) {
		this.name = na;
	}

	// 名前を取得するメソッド
	public String getName() {
		return this.name;
	}

	// 体長を設定するメソッド
	public void setHeight(double he) {
		this.height = he;
	}

	// 体長を取得するメソッド
	public double getHeight() {
		return this.height;	
	}

	// 速度を設定するメソッド
	public void setSpeed(int sp) {
		this.speed = sp;
	}

	// 速度を取得するメソッド
	public int getSpeed() {
		return this.speed;
	}

}

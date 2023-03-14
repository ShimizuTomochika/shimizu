package japanSub;

public class JapanBean {
	
	private String name;//都道府県名
	private double width;//都道府県の幅
	private String prefecturalCapital;//県庁所在地
	
	//名前を取得するメソッド
	public String getName() {
		return this.name;
	}

	//名前を設定するメソッド
	public void setName(String na) {
		this.name = na;
	}

	//サイズを取得するメソッド
	public double getWidth() {
		return this.width;
	}

	//サイズを設定するメソッド
	public void setWidth(double wi) {
		this.width = wi;
	}

	//県庁所在地を取得するメソッド
	public String getPrefecturalCapital() {
		return this.prefecturalCapital;
	}

	//県庁所在地を設定するメソッド
	public void setPrefecturalCapital(String pr) {
		this.prefecturalCapital = pr;
	}
}

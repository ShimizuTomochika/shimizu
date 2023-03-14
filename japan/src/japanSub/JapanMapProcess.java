package japanSub;

import java.util.Map;

public class JapanMapProcess extends JapanBean{
	public void japan(Map<Integer, String> map) {
		JapanBean jp = new JapanBean();
		for(int i = 0;i < map.size();i++) {
			int in = 0;
			String[] txt = map.get(i).split(":");
			jp.setName(txt[in++]);
			jp.setPrefecturalCapital(txt[in++]);
			jp.setWidth(Double.parseDouble(txt[in]));
			speak(jp);
		}
	}
	public void speak(JapanBean jp) {
		System.out.println("都道府県名：" + jp.getName());
		System.out.println("県庁所在地：" + jp.getPrefecturalCapital());
		System.out.println("面積：" + jp.getWidth() + "km2");
		System.out.println();
	}
}

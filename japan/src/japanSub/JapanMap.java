package japanSub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JapanMap {
	protected Map<Integer,String> nameInfo(List<Integer> key) {

		Map<Integer,String> name = new HashMap<>();
		Map<Integer,String> names = new HashMap<>();
		int intId = 0;
		//key 数字 value 都道府県:県庁所在地:面積
		name.put(intId++, "北海道:札幌市:83424");
		name.put(intId++, "青森県:青森市:9646");
		name.put(intId++, "岩手県:盛岡市:15275");
		name.put(intId++, "宮城県:仙台市:7282");
		name.put(intId++, "秋田県:秋田市:11638");
		name.put(intId++, "山形県:山形市:9323");
		name.put(intId++, "福島県:福島市:13784");
		name.put(intId++, "茨城県:水戸市:6097");
		name.put(intId++, "栃木県:宇都宮市:6408");
		name.put(intId++, "群馬県:前橋市:6362");
		name.put(intId++, "埼玉県:さいたま市:3798");
		name.put(intId++, "a:a市:5555");

		Iterator<Integer> it = key.iterator();
		for(int i = 0;i < key.size();i++) {
			names.put(i, name.get(it.next()));
		}
		return names;
	} 
}

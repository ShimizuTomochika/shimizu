package japanSub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JapanSub {

	public static void main() {
		Scanner scan  = new Scanner(System.in);
		JapanProgress japanProgress = new JapanProgress();
		JapanMapProcess japanMapProcess = new JapanMapProcess();
		JapanMap japanMap = new JapanMap();
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,String> map = new HashMap<Integer,String>();
		list = japanProgress.info(scan);
		map = japanMap.nameInfo(list);
		japanMapProcess.japan(map);
	}
}

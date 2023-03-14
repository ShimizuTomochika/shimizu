package japanSub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JapanProgress {
	public List<Integer> info(Scanner scan) {
		String line = scan.nextLine();
		String[] txt = line.split(",");
		List<Integer> list = new ArrayList<>();
		
			int flag = -1;//昇順-1：降順0
			int scLen = 0;//何回入力する
			//何回入力するか,ソートflag
			//flag
			if(Integer.parseInt(txt[1]) == 0) {
				flag = 0;
			}
			scLen = Integer.parseInt(txt[0]);
			for(int i = 0; i < scLen; i++) {
				line = scan.nextLine();
				list.add(Integer.parseInt(line));
			}
			if(flag == -1 ) {
				Collections.sort(list);
			}else {
				Collections.sort(list,Collections.reverseOrder());
			}
			return list;
		
	}
}

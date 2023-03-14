package animal;

import java.util.Scanner;

public class AnimalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			AnimalProgress.animal(sc);
		} catch (Exception e) {
			System.out.println("不正な文字が入力されました");
		}
		//ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	}

}

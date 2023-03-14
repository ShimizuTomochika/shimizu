package animal;

import java.io.IOException;
import java.util.Scanner;

public class AnimalProgress extends AnimalBean{
	public static void animal(Scanner sc) throws IOException,Exception {

		String line = sc.nextLine();
		String[] txt = line.split(",");

		String[] names = new String[txt.length];
		double[] heights = new double[txt.length];
		int[] speeds = new int[txt.length];

		// コンソール出力メソッド

		for(int i = 0;i < txt.length;i++) {
			String[] ani = txt[i].split(":");

			names[i] = ani[0];
			heights[i] = Double.parseDouble(ani[1]);
			speeds[i] = Integer.parseInt(ani[2]);

			// インスタンスの生成
			AnimalBean animal = new AnimalBean();

			// インスタンスフィールドの「name」に値を設定する。
			animal.setName(names[i]);
			// インスタンスフィールドの「speed」に値を設定する。
			animal.setSpeed(speeds[i]);
			// インスタンスフィールドの「height」に値を設定する。
			animal.setHeight(heights[i]);
			// インスタンスメソッドの呼び出し
			write(animal);  
			//switch文を使う
			switch(names[i]) {
			case "ライオン":
				System.out.println("学名：パンテラ レオ");
				System.out.println();
				break;

			case "ゾウ":
				System.out.println("学名：ロキソドンタ・サイクロティス");
				System.out.println();
				break;

			case "パンダ":
				System.out.println("学名：アイルロポダ・メラノレウカ");
				System.out.println();
				break;

			case "チンパンジー":
				System.out.println("学名：パン・トゥログロディテス");
				System.out.println();
				break;

			case "シマウマ":
				System.out.println("学名：チャップマンシマウマ");
				System.out.println();
				break;

			default:
				System.out.println("学名：不明");
				break;
			}
		}
	}
	public static void write(AnimalBean animal) {

		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getHeight() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}
}




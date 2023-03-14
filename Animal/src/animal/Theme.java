package animal;

public class Theme {

}
/*
・Packageを1つ作ってください
	Package名：Animal
	
	Package：Animalの中にクラスファイルを3つ作ってください
	・AnimalMain
	・AnimalBean
	・AnimalProgress 継承 AnimalBean
	
・クラス：AnimalMainでmainメソッドを作成してください
	①②の順番で書いてください
	①インスタンスの宣言：Scanner
	②AnimalProgressのanimal(引数：Scanner)を読み込んでください
	③②をtry、catchで囲んでください
	catchの中にはコンソールで下記の文字列が出るようにしてください
	「不正な文字が入力されました」
	
	入力する文字列↓
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
・クラス：AnimalBeanでフィールドを3つ作成してください
	条件 アクセス修飾子：private String型 フィールド名：name
	条件 アクセス修飾子：private double型 フィールド名：height
	条件 アクセス修飾子：private int型 フィールド名：speed

	各フィールドのsetterとgetterを作成してください
	条件 アクセス修飾子：public メソッド名：set○○
	条件 アクセス修飾子：public メソッド名：get○○
	○○の先頭文字は大文字で命名すること
	例：sushi→Sushi
	thisを使うこと

・クラス：AnimalProgressでメソッドを作成してください
	条件 アクセス修飾子：public クラス変数：static 戻り値無し 引数(Scanner)クラス名：Animal
	
	①受け取ったScannerをString型に入れた後、「,」区切りでString[]に入れてください

	②String、double、intの3つの配列を作ってください
	大きさはScannerの値を入れているString配列の大きさです

	③for文を使いScannerを入れた大きさ未満回るようにしてください
	受け取ったScannerをString配列に入れた後、さらに「：」区切りでString[]に入れてください

	②で分けた値を③で作った配列に入れていってください
		動物名：ライオン
		体長：2.1m
		速度：80km/h
		学名：パンテラ レオ	Beanで作ったセット使いAnimalBeanに継承されている値を各配列にセットしてください
	※改行を入れる
	
	メソッド名：writeの(引数：animal)を作成してください; 
	条件 アクセス修飾子：public クラス変数：static 戻り値無し 引数(引数：animal)クラス名：write
	switch文を②で作ったString型をkeyにして作ってください
	下記がコンソールに出力されるようにしてください

	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

	↓これがコンソールに入力されます
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
*/
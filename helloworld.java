public class helloworld {
  public static void main(String[] args) {    //javaプログラムを実行するために必要な形式的なもの

// //文字を出力するプログラム
//     System.out.println("hello world");
//     System.out.println("私の名前は〇〇です");
//     System.out.println("よろしくお願いします");

// //演算を行うプログラム
//     System.out.println(3*5);

// //課題１
//     String name = "tanaka";
//     System.out.println("私の名前は" + name + "です");

//     int score = 4/2;
//     System.out.println("１たす１は" + score + "です");
//     System.out.println("４わる２は" + score + "です");

// //算術演算
//     int year;
//     year = 2020;

//     int next_year;
//     next_year = year +1;
//     year = next_year -2;

//     year = next_year *2;
//     year = year /2;

// //doubleを使用した計算
//     double num = 5.0/2.0;

//     System.out.println(num);

// //文字列結合演算子
//     int year;
//     year = 2020;

//     System.out.println("今年は" + year + "です");

// //代入演算子
//     int year;
//     year = 2020;
//     year += year;

//     System.out.println("今年は" + year + "です");

// //インクリメント、デクリメント演算子
//     int year;
//     year = 2020;

//     //year++;
//     year--;

//     System.out.println(year);

// //命令実行文
//     int year;
//     int next_year;

//     year = 2020;
//     next_year = year +1;

//     // int m = Math.max(year, next_year);
//     int m = Math.min(year, next_year);

//     System.out.println("小さいほうは" + m + "です");

//キーボードからの入力を受け付ける
    System.out.println("あなたの名前は？");
    String input1 = new java.util.Scanner(System.in).nextLine();

    System.out.println("あなたの年齢は？");
    int input2 = new java.util.Scanner(System.in).nextInt();
    
    System.out.println("こんにちは" + input2 + "歳の" + input1 + "さんです");
  }
}
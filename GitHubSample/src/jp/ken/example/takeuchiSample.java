package jp.ken.example;

public class takeuchiSample {

	public static void main(String[] args) {
		String msg = "GitHubを使ってみよう";
		double member = 5 * (Math.random() * 10);
		if(member >= 5) {
			System.out.println(msg);
		} else {
			System.out.println("メンバー足りません");
		}
	}

}

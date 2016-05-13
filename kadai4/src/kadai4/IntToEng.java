package kadai4;

import java.util.Scanner;

public class IntToEng {

	// メインメソッド
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		System.out.println(translateEng(input));

	}

	// 数値を英訳する変換するメソッド
	static String translateEng(int n) {
		String answer = "";

		String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String exactly[] = { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "ninety",
				"hundred" };
		String teen[] = { "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };

		
		if (0 <= n && n < 10)
			answer = digit[n];
		else if (n % 10 == 0)
			answer = exactly[n / 10];
		else if (10 < n && n < 20)
			answer = teen[n - 10];
		else if(0 < n && n < 100)
			answer = exactly[n/10] +"-" + digit[n%10];
		else if(n > 100 && n < 1000)
			answer = digit[n/100] +" hundred and "+ exactly[(n - (n/100) * 100) / 10] +"-"+digit[(n%100)%10];
		

		return answer;
	}
}

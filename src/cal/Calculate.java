package cal;

public class Calculate {
	public long solution(int price, int money, int count) {
		long answer = 0;
		long temp = 0;
		for (int i = 1; i <= count; i++) {
			temp += price * i;
		}
		answer = temp - money;
		
		if (answer > 0) {
			answer = temp - money;
		} else {
			answer = 0;
		}
		return answer;
	}
}

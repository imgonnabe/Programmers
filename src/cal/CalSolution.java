package cal;

public class CalSolution {
	public long solution(long price, long money, long count) {
		return Math.max(price * (count * (count + 1) / 2) - money, 0);
	}

	public long solution(int price, int money, int count) {
		long answer = -1;
		answer = price * count * (count + 1) / 2 - money;
		return answer <= 0 ? 0 : answer;
	}
}

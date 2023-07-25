package ac;

public class AC1 {
	public int solution(int temperature, int t1, int t2, int a, int b, int[] onboard) {
		int answer = temperature;
		int answer2 = 0;
		for (int i = 0; i < onboard.length && t1 <= answer && answer <= t2; i++) {
			if (onboard[i] == 1) {
				int coinFlip = (int) (Math.random() * 3);
				if (coinFlip == 0) {
					answer += 1;
					if (temperature == answer) {
						answer2 += answer * b;
					} else {
						answer2 += answer * a;
					}
				} else if (coinFlip == 1) {
					answer -= 1;
					if (temperature == answer) {
						answer2 += answer * b;
					} else {
						answer2 += answer * a;
					}
				} else {
					if (temperature == answer) {
						answer2 += answer * b;
					} else {
						answer2 += answer * a;
					}
				}
			}
		}
		return answer2;
	}
}
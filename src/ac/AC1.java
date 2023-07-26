package ac;

public class AC1 {
	public int solution(int temperature, int t1, int t2, int a, int b, int[] onboard, int hope) {
		int answer = 0;
		int[] num = new int[onboard.length];
		for (int i = 0; i < onboard.length && t1 <= temperature && temperature <= t2 && t1 < t2; i++) {
			if (onboard[i] == 1) {
				if (temperature > hope) {
					temperature -= 1;
					answer += a; 
				} else if (temperature < hope) {
					temperature += 1;
					answer += a;
				} else {
					answer += b;
				}
			} else {
				if (temperature > hope) {
					temperature -= 1;
				} else if (temperature < hope) {
					temperature += 1;
				} else {
					
				}
			}
			num[i] = answer;
		}
		
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		return min;
	}
}
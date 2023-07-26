package nearWord;

public class NearWord {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		char[] a = new char[s.length()];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.charAt(i);
		}

		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = i - 1; j < i && j >= 0; j--) {
				if (a[i] == a[j]) {
					answer[i] = i - j;
					break;
				} else {
					answer[i] = -1;
				}
			}
		}
		answer[0] = -1;
		return answer;
	}
}

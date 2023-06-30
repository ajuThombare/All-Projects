package AssessmentQuestions;

public class InifinitStringCheck {
	public static void main(String[] args) {

		System.out.println(isPresent("abcde eabceab"));
	}

	public static String isPresent(String S) {
		int counter = 0;
		String ax = S.split(" ")[0];
		String ay = S.split(" ")[1];
		int ind = ay.indexOf(ax);
		if (ind != -1) {
			for (int i = ind; i < ay.length(); i++) {

				if (ay.charAt(i) != ax.charAt(counter)) {
					return "NO";
				} else {
					counter++;
				}
				if (i % (ax.length()) == 0 && i != 0) {
					counter = 0;
				}
			}
			return "YES";
		} else {
			return "NO";
		}
	}

}

public class Main {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm.";
		// String new_id = "=.=";
		solution(new_id);
	}

	/**
	 * 
	 * @param new_id
	 * @return bat.y.abcdefghi
	 */
	public static String solution(String new_id) {
		System.out.println("0단계 " + new_id);

		// 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		new_id = new_id.toLowerCase();
		System.out.println("1단계 " + new_id);

		StringBuilder sb = new StringBuilder();

		for (char c : new_id.toCharArray()) {
			String str = new Character(c).toString();

			if (Character.isLowerCase(c) || Character.isDigit(c) || str.equals("-") || str.equals(".")
					|| str.equals("_")) {
				sb.append(c);
			}
		}

		// 2단계 new_id에서 알파벳소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		new_id = sb.toString();
		System.out.println("2단계 " + new_id);

		// 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		new_id = new_id.replaceAll("\\.{2,}", ".");
		System.out.println("3단계 " + new_id);

		char[] c = new_id.toCharArray();
		String fst = new Character(c[0]).toString();
		String lst = new Character(c[c.length - 1]).toString();

		if (fst.equals(".")) {
			new_id = new_id.substring(1, new_id.length());
		}
		if (new_id.length() > 0 && lst.equals(".")) {
			new_id = new_id.substring(0, new_id.length() - 1);
		}
		// 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		System.out.println("4단계 " + new_id);

		if ("".equals(new_id)) {
			new_id = "a";
		}
		// 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		System.out.println("5단계 " + new_id);

		if (new_id.length() > 16) {
			new_id = new_id.substring(0, 15);
		}
		if (".".equals(new_id.substring(new_id.length() - 1, new_id.length()))) {
			new_id = new_id.substring(0, new_id.length() - 1);
		}

		// 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
		// 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		System.out.println("6단계 " + new_id);

		// 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		if (new_id.length() <= 2) {
			StringBuilder sb1 = new StringBuilder();
			sb1.append(new_id);

			String lastStr = new_id.substring(new_id.length() - 1, new_id.length());

			while(sb1.length() < 3) {
				sb1.append(lastStr);
			}
			new_id = sb1.toString();
		}
		System.out.println("7단계 " + new_id);

		String answer = new_id;
		return answer;
	}

}
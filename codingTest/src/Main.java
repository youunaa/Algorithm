public class Main {

	public static void main(String[] args) {
		String new_id = "abcdefghijklmn.p";
		// String new_id = "=.=";
		solution(new_id);
	}

	/**
	 * 
	 * @param new_id
	 * @return bat.y.abcdefghi
	 */
	public static String solution(String new_id) {
		new_id = new_id.toLowerCase(); // 1단계

		new_id = new_id.replaceAll("[^-_.a-z0-9]",""); // 2단계
		new_id = new_id.replaceAll("\\.{2,}", "."); // 3단계
		new_id = new_id.replaceAll("^[.]|[.]$",""); // 4단계

		if ("".equals(new_id)) {
			new_id = "a";
		}
		// 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("[.]$","");
		}

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

	public String solution2(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase();

        temp = temp.replaceAll("[^-_.a-z0-9]","");
        System.out.println(temp);
        temp = temp.replaceAll("[.]{2,}",".");

        temp = temp.replaceAll("^[.]|[.]$","");
        System.out.println(temp.length());
        
		if(temp.equals(""))
            temp+="a";
        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");
        }
        if(temp.length()<=2)
            while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);

        answer=temp;
        return answer;
    }
}
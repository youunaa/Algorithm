package study;

public class Equals {
    
    public void execute() {
        StringCompare();
    }

    // String 비교 방법
    public void StringCompare() {
        String a = "aa";
		byte[] bb = new byte[] {'l','e'};
		String b = new String(bb);

		// 01. == : String 간의 비교에는 사용할 수 있으나, byte[]를 기반으로 생성된 String 등의 비교에는 적절하지 않다.
		System.out.println(a == b);	// false
        // 02. equals : 순수하게 문자열을 비교한다.
        System.out.println(a.equals(b)); // true	
        // 03. intern() + == : 주소값을 동일하게 변경해 준다. case 1과 같은 상황에서도 주소값 비교가 아닌, 문자열 비교를 가능하게 한다.
        System.out.println(a == b.intern()); // true	
    }

}

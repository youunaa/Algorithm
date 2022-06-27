package coding.test.hash.resolve;

import java.util.HashMap;
import java.util.Map;

public class Resolve003 {

    public void execute() {
        String[] phone_book = { "119", "97674223", "1195524421" }; //false
        // String[] phone_book = { "123","456","789" }; //true
        // String[] phone_book = { "12","123","1235","567","88" }; //false

        solution(phone_book);
    }

    /**
     * 해시 - 전화번호 목록
     * @param phone_book
     * @return
     */
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();

        for (String phoneNum : phone_book) {
            map.put(phoneNum, 1);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {

                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return false;
    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 현재 카드
        List<Integer> temp = IntStream.rangeClosed(1, n)
                .boxed()
                .collect(Collectors.toList());

        // 버리는 카드
        List<Integer> gc = new ArrayList<>();

        while (temp.size() > 1) {
            gc.add(temp.get(0)); // 버릴카드 담기
            temp.remove(0); // 첫번째 카드 제거 후 게임 시작

            int lastCard = temp.get(0);
            temp.remove(0); // 뒤로보낼 카드 제거
            temp.add(lastCard); // 카드 맨뒤로 보내기
        }
        gc.add(temp.get(0)); // 마지막 카드 출력을 위해

        String result = "";
        for (Integer cardNo : gc) {
            result += cardNo + " ";
        }
        result.trim();

        System.out.println(result);
    }

}
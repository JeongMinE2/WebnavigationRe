package WebRefactoring.View;

import java.util.Scanner;

public class InputView {        // 페이지 입력 받기
    Scanner sc = new Scanner(System.in);

    public String callsc() {
        String call = sc.nextLine().trim();
        return call;
    }
}

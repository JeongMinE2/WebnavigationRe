package WebRefactoring.DAO;

import java.util.Stack;

public class DAO {
    String current = "http://www.acm.org/";
    Stack<String> back = new Stack<>();       // 뒤로가기 페이지 선언
    Stack<String> forward = new Stack<>();    // 앞으로 가기 페이지 스택 선언

    public String visit(String url) {
        back.push(current);
        current = url;
        forward.clear();

        return current;
    }

    public String back() {
        if (back.empty()) {
            return "Ignored";
        }
        forward.push(current);
        current = back.pop();

        return current;
    }

    public String forward() {
        if (forward.empty()) {
            return "Ignored";
        }
        back.push(current);
        current = forward.pop();

        return current;
    }
}

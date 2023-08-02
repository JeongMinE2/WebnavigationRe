package WebRefactoring.Controller;

import WebRefactoring.Service.Service;
import WebRefactoring.View.InputView;
import WebRefactoring.View.OutputView;

public class Controller {     //
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    Service service = new Service();

    boolean run = true;

    public void run() {
        while (run) {
            String calling = inputView.callsc();
            String url = null;
            if (calling.contains("VISIT")) {
                url = calling.substring(5);
                calling = calling.substring(0, 5);
            }
            switch (calling) {
                case "VISIT":
                    outputView.print(service.visit(url));
                    break;
                case "BACK":
                    outputView.print(service.back());
                    break;
                case "FORWARD":
                    outputView.print(service.forward());
                    break;
                case "QUIT":
                    run = false;
                    break;
            }
        }
    }
}

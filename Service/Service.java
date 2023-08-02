package WebRefactoring.Service;

import WebRefactoring.DAO.DAO;

public class Service {
    DAO dao = new DAO();

    public String visit(String url) {
        url = url.trim();

        return dao.visit(url);
    }

    public String back() {

        return dao.back();
    }

    public String forward() {

        return dao.forward();
    }
}

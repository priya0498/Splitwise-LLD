import Model.Expense;
import Model.User;

public class Controller {

    Service service;

    public Controller() {

        this.service = new Service();
    }

    public User createUser(String name, String email , String number) {
        return service.createUser(name, email, number);
    }

    public Expense createExpenses()
}

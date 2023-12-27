import Model.User;

import java.util.UUID;

public class Service {

    Storage storage;

    public Service(){
        this.storage = new Storage();
    }
    public User createUser(String name, String email, String number) {
        String id = UUID.randomUUID().toString();
        User user = new User(name, email , number, id);
        return storage.insertUser(user);

    }
}

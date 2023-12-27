import Model.User;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    List<User>userList;
    User user;

    public Storage(){
        this.userList = new ArrayList<>();
    }
    public User insertUser(User user) {
        userList.add(user);
        return  user;
    }
}

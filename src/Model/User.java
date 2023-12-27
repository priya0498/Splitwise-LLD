package Model;

public class User {
        String name;
        String email;
        String number;

        String id;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public User(String name, String email, String number, String id){
            this.name = name;
            this.email = email;
            this.number = number;
            this.id = id;
        }

    }



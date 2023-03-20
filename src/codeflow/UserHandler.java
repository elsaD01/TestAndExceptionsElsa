package codeflow;

import java.util.ArrayList;

public class UserHandler {
    private ArrayList<User> users = new ArrayList<>();

    public boolean createUser(String name, String password) {
        //name og pass checks if its valid if not = false
        //Checks if exists runs arrayList and getName if = name
        if (!DataValidator.isPasswordValid(password) || !DataValidator.isUserNameValid(name)) {
            return false;
        } else {
            for (User user : users) {
                if (user.getName().equals(name)) {
                    return false;
                }
            }
        }
        users.add(new User(name, password));
        return true;
    }

    public boolean addUser(User u) {
        //Checks again if getName = name if we have the user or if already exists
        for (User user : users) {
            if (user.getName().equals(u.getName())) {
                return false;
            }
        }
        users.add(u);
        return true;
    }

    public boolean login(String name, String password) {
        //correct user and correct password
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }


}
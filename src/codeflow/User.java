package codeflow;



public class User {

    String name;
    String password;

    public User(String name, String password) {
        setName(name);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(DataValidator.isUserNameValid(name)){
            this.name = name;
        }
        else{
            this.name = null;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(DataValidator.isPasswordValid(password)){
            this.password = password;
        }
        else{
            this.password = "N/A";
        }
    }
}
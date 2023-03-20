package codeflow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserHandlerTest2 {

        UserHandler userHandler;

    @BeforeEach
    void setUp() {
        userHandler = new UserHandler();
        userHandler.addUser(new User("Signe", "1234"));
        userHandler.addUser(new User("Sally", "3456"));
        userHandler.addUser(new User("Tess", "root"));
    }

    @Test
    void createUser() {

        assertTrue(userHandler.createUser("Henning", "Kaffekop"));

    }

    @Test
    void addUser() {

        assertTrue(userHandler.addUser(new User("Henning", "kaffekop")));

    }

    @Test
    void login() {
    }
}
package codeflow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserHandlerTest {

    UserHandler userHandler;

    @BeforeEach
    void setUp(){
        userHandler = new UserHandler();
        userHandler.createUser("Signe", "1234");
        userHandler.createUser("Sally", "3446");
        userHandler.createUser("Tess", "ditdat");
    }

    @Test
    void createUser() {
        assertTrue(userHandler.createUser("Marley", "hundekiks"));
        assertTrue(userHandler.createUser("Henning", "1234"));
        assertFalse(userHandler.createUser("Signe", "1234"));
        assertFalse(userHandler.createUser("Signe", "kaktus"));
        assertFalse(userHandler.createUser("","1224"));

    }

    @Test
    void login() {
        assertFalse(userHandler.login("Signe", "23345"));
        assertFalse(userHandler.login("Marley", "hundekiks"));
        assertTrue(userHandler.login("Signe", "1234"));
    }

    @Test
    void addUser() {
        User u1 = new User("Signe", "1234");
        User u2 = new User("Hans", "Kaffekop");
        User u3 = new User("", "triatlon");
        assertFalse(userHandler.addUser(u1));
        assertTrue(userHandler.addUser(u2));
        assertTrue(userHandler.addUser(u3));
        assertTrue(userHandler.addUser(new User("Henning", "Halløjsa")));
    }
}
package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        util.getConnection();

        UserServiceImpl user = new UserServiceImpl();

        user.createUsersTable();
        user.saveUser("Andrew", "Latyshev", (byte) 35);
        user.saveUser("Svetlana", "Latysheva", (byte) 29);
        user.saveUser("Leonid", "Podsohin", (byte) 32);
        user.saveUser("Mikhail", "Karasev", (byte) 34);

        user.removeUserById(1);
        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();
    }

}

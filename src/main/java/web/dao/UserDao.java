package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

   List<User> getAllUsers();

   User getUserById(int id);

   void addUser(User user);

   void updateUser( User user);

   void deleteUserById(int id);
}

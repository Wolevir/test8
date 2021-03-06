package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import javax.persistence.TypedQuery;
import java.util.List;

public interface UserDao {
   void addCar(Car car);
   void add(User user);
   List<User> listUsers();

   User getUser(String model,int sereas);

}

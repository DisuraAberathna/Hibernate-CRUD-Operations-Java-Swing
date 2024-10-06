/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entity.User;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

/**
 *
 * @author SINGER
 */
public class UserModel {

    static Session session = HibernateUtil.getSessionFactory().openSession();

    public static List<User> searchUsers() {
        Criteria userCriteria = session.createCriteria(User.class);
        userCriteria.addOrder(Order.asc("id"));
        return userCriteria.list();
    }

    public static void saveUser(User user) {
        session.save(user);
        session.beginTransaction().commit();
    }

    public static void updateUser(User user, int id) {
        User u = (User) session.get(User.class, id);
        u.setF_name(user.getF_name());
        u.setL_name(user.getL_name());
        u.setUsername(user.getUsername());
        u.setDob(user.getDob());

        session.update(u);
        session.beginTransaction().commit();
    }

    public static void deleteUser(int id) {
        User user = (User) session.get(User.class, id);

        session.delete(user);
        session.beginTransaction().commit();
    }
}

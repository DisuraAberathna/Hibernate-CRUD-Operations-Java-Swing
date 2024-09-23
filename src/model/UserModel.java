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
}

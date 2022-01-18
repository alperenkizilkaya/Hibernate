package com001.hibernatetest;

import com001.entity.Personel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDeneme {

    public static void main(String[] args) {

        Personel personel1 = new Personel();

        personel1.setPersonelId(1);
        personel1.setPersonelAdi("alperen");
        personel1.setPersonelSoyadi("kizilkaya");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(personel1);

        session.getTransaction().commit();
    }
}

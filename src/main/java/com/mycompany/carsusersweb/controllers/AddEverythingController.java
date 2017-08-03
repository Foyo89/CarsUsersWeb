/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carsusersweb.controllers;

import com.mycompany.carsusersweb.ConfigHibernate;
import com.mycompany.carsusersweb.model.Country;
import com.mycompany.carsusersweb.model.User;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author RENT
 */
@ManagedBean(name = "addEverythingController")
@ApplicationScoped
public class AddEverythingController {
    
    public String getText() {
        Country country = new Country();
        country.setName("Polska");
        SessionFactory instance = ConfigHibernate.getInstance();
        Session session = instance.openSession();
        
        Transaction beginTransaction = session.beginTransaction();
        
        session.save(country);
        beginTransaction.commit();
        return "Test";
    }
    
    
    
}

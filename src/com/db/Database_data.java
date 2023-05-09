/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import visite.model.Medecin_Model;

/**
 *
 * @author Rojo
 */
public class Database_data {
    
    public List<Medecin_Model> getAllMedecin_Models(){
        
        List<Medecin_Model> medecin_Models = new ArrayList<>();
        
        Database_connection db_con = new Database_connection();
        Session session = db_con.getSessionFactory().openSession();
        
        Query query = session.createQuery("from Medecin_model med");
        medecin_Models = query.list();
        
        return medecin_Models;
    }
}

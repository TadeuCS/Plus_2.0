/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Suporte4
 */
public class Manager {

    public Manager() {
    emf=Persistence.createEntityManagerFactory("PlusPU");
    em=emf.createEntityManager();
    }

    
    public EntityManager em;
    public EntityManagerFactory emf;
    public Query query;
    
    
}

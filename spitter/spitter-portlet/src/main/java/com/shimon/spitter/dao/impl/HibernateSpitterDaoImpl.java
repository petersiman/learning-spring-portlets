package com.shimon.spitter.dao.impl;

import com.shimon.spitter.dao.SpitterDao;
import com.shimon.spitter.dto.Spitter;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Peter Siman <peter.siman@ibacz.eu>
 */
@Repository
public class HibernateSpitterDaoImpl implements SpitterDao {
    private SessionFactory sessionFactory;

    @Autowired
    public HibernateSpitterDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    public void addSpitter(Spitter spitter) {
        currentSession().save(spitter);
    }

    public Spitter getSpitterById(long id) {
        return (Spitter) currentSession().get(Spitter.class,id);
    }

    public void saveSpitter(Spitter spitter) {
        currentSession().update(spitter);
    }
}

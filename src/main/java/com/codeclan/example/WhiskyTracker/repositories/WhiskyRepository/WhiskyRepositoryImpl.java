package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;


import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

    @Autowired
    EntityManager entityManager;

//TODO:get all whiskies for a particular year

    @Transactional
    public List<Whisky> getAllWhiskiesForYear(int year){
        List<Whisky> results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Whisky.class);
        cr.add(Restrictions.eq("year", year));
        results = cr.list();
        return results;
    }

////TODO:get all whisky from a particular region
//
//    @Transactional
//    public List<Whisky> getAllWhiskiesForRegion(String region){
//        List<Whisky> results = null;
//        Session session = entityManager.unwrap(Session.class);
//        Criteria cr = session.createCriteria(Whisky.class);
//        cr.createAlias()
//        cr.add(Restrictions.eq("region", region));
//        results = cr.list();
//        return results;
//    }


}

package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

    @Autowired
    EntityManager entityManager;

//TODO:get all distilleries for a region
    @Transactional
    public List<Distillery> getAllDistilleriesForRegion(String region){
        List<Distillery> results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Distillery.class);
        cr.add(Restrictions.eq("region", region));
        results = cr.list();
        return results;
    }

//TODO:get all distilleries with whiskies that are 12yearsold


//TODO:get all whiskies from a specific distillery of a specific age


////TODO:get all whisky from a particular region
//
//    @Transactional
//    public List<Whisky> getAllWhiskiesForRegion(String region){
//        List<Whisky> results = null;
//        Session session = entityManager.unwrap(Session.class);
//        Criteria cr = session.createCriteria(Distillery.class);
//        cr.createAlias("whiskies")
//    }

}

package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

    @Autowired
    EntityManager entityManager;

//TODO:get all distilleries for a region



//TODO:get all distilleries with whiskies that are 12yearsold


//TODO:get all whiskies from a specific distillery of a specific age

}

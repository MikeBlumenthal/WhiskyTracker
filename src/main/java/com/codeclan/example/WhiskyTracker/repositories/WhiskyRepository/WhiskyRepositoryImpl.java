package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

    @Autowired
    EntityManager entityManager;
//TODO:get all whiskies for a particular year


//TODO:get all whisky from a particular region

}

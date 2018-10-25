package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {
    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "{region}")
    public List<Distillery> getDistilleriesByRegion(@PathVariable String region){
        String regionUpper = region.substring(0,1).toUpperCase() + region.substring(1).toLowerCase();
        return distilleryRepository.getAllDistilleriesForRegion(regionUpper);
    }

    @GetMapping(value = "withwhisky/{age}")
    public List<Distillery> getDistilleriesWithWhiskyOfAge(@PathVariable int age){
        return distilleryRepository.getAllDistilleriesWithWhiskyAged(age);
    }

}

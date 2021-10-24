package com.alikmndlu.busticketing.service.impl;

import com.alikmndlu.busticketing.repository.CityRepository;
import com.alikmndlu.busticketing.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository customerRepository;
}

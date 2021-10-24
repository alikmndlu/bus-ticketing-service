package com.alikmndlu.busticketing.service.impl;

import com.alikmndlu.busticketing.repository.TravelRepository;
import com.alikmndlu.busticketing.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravelServiceImpl implements TravelService {

    @Autowired
    private TravelRepository customerRepository;
}

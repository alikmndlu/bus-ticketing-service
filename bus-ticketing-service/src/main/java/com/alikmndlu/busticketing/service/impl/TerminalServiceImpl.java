package com.alikmndlu.busticketing.service.impl;

import com.alikmndlu.busticketing.repository.TerminalRepository;
import com.alikmndlu.busticketing.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminalServiceImpl implements TerminalService {

    @Autowired
    private TerminalRepository customerRepository;
}

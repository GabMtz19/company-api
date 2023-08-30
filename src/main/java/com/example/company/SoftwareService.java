package com.example.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareService {
    @Autowired
    private SoftwareRepository softwareRepository;
    public List<Software> allSoftware() {
        return  softwareRepository.findAll();
    }
}

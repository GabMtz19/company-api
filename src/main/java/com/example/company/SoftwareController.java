package com.example.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/software")
public class SoftwareController {
    @Autowired
    private SoftwareService softwareService;
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping
    public ResponseEntity<List<Software>> getAllSoftware() {
        return new ResponseEntity<List<Software>>(softwareService.allSoftware(), HttpStatus.OK);
    }
}

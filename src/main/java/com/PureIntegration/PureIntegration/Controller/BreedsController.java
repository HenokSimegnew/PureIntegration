package com.PureIntegration.PureIntegration.Controller;

import com.PureIntegration.PureIntegration.Service.BreedsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//    link /api/breeds//list/all
@RestController
@RequestMapping("/api/breeds")
public class BreedsController {


    @Autowired
    BreedsService breedsService;

    @GetMapping("/list/all")
    public ResponseEntity<Object> getBreedsList() {
        Object resultList = breedsService.getBreedsJsonData();
        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }
}

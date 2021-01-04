package com.demo.springboot.rest;

import com.demo.springboot.csv_contlorel.CsvFileNotExistedException;
import com.demo.springboot.csv_contlorel.CsvOperationsComponentImpl;
import logic.CheckingPesel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class IdentificationNumberApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IdentificationNumberApiController.class);

    @CrossOrigin
    @GetMapping(value = "/check-identification-number")
    public ResponseEntity<String[]> checkIdentificationNumber() throws CsvFileNotExistedException, IOException {



        CsvOperationsComponentImpl csvreader = new CsvOperationsComponentImpl();
       if(CheckingPesel.itscorectPesel() == null){
           return new ResponseEntity<String[]>(HttpStatus.OK);
        }

        return new ResponseEntity<String[]>(CheckingPesel.itscorectPesel(),HttpStatus.OK);



    }

}

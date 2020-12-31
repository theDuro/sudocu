package com.demo.springboot.csv_contlorel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CsvOperationsComponentImpl implements CsvOperationsComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger(CsvOperationsComponentImpl.class);
    private List<String> lines;

    public CsvOperationsComponentImpl() {
        LOGGER.info("poprawne skonwertowanie pliku csv");// add to 2d array
        lines = new ArrayList<>();
    }

    @Override
    public   String[][] readCsvFile(String fileName, String divider) throws CsvFileNotExistedException{

        //dzaiala
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH + fileName));

            String thisLine;
            reader.readLine();

            List<String[]> lines = new ArrayList<String[]>();
            while ((thisLine = reader.readLine()) != null) {
                lines.add(thisLine.split(";"));
            }
            String[][] array = new String[lines.size()][0];
            lines.toArray(array);
           // return array;
            return new String[9][9];


        } catch (IOException e) { e.printStackTrace(); }


        throw new CsvFileNotExistedException();

    }
}

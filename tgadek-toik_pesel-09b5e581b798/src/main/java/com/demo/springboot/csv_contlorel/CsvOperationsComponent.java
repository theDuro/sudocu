package com.demo.springboot.csv_contlorel;

public interface CsvOperationsComponent {

    String PATH = "C:\\Users\\LENOVO\\Downloads";

     String[][] readCsvFile(String fileName, String divider) throws CsvFileNotExistedException;
}

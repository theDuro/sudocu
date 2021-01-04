package com.demo.springboot.csv_contlorel;

public class CsvFileNotExistedException extends Exception  {

    public CsvFileNotExistedException() {
        System.out.print("nie pliku csv");

    }
}

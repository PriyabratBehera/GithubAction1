package com.qa.utils;

import org.testng.Assert;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class terst {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate previousYearDate = today.minusYears(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        String formattedDate = previousYearDate.format(formatter);
        System.out.println(formattedDate);

    }
}

package com.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.entity.Student;

import java.io.File;

public class App {
    public static void main(String[] args) {

        try {

            // create object mapper
            ObjectMapper objectMapper = new ObjectMapper();

            // read json and convert
            Student student = objectMapper.readValue(new File("data/sample-lite.json"), Student.class);

            // print name and last name
            System.out.println(student.getFirstName());
            System.out.println(student.getLastName());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

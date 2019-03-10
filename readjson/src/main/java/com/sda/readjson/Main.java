package com.sda.readjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.json.Person;

import java.io.File;
import java.io.IOException;

/**
 * @author perczynski
 */
public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {


            File personFile = new File("personLst.json");
            Person[] personArray = mapper.readValue(personFile, Person[].class);
            System.out.println(personArray[0].toString());
        } catch (
                IOException e) {
        }


    }
}

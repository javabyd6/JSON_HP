package com.sda.savejson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author perczynski
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Bigos", 21);
        Person person2 = new Person("Lucyna", "Bigos", 65);
        Person person3 = new Person("Michał", "Bigos", 21);
        Person person4 = new Person("Malwina", "Bigos", 65);

        ObjectMapper mapper = new ObjectMapper();
        try {
            String personStr = mapper.writeValueAsString(person);
            System.out.println(personStr);
            Files.write(Paths.get("person.json"), personStr.getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }


        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        try {
            String personLst = mapper.writeValueAsString(personList);
            System.out.println(personLst);
            Files.write(Paths.get("personLst.json"), personLst.getBytes());


    } catch (IOException e) {
        e.printStackTrace();
    }

    List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jas", "1", new Address("Bdg", "Pierwsza")));
        studentList.add(new Student("Ola", "2", new Address("Bdg", "Druga")));
        studentList.add(new Student("kasia", "3", new Address("Gda", "Inna")));
        try {
        String studentLst = mapper.writeValueAsString(studentList);
        System.out.println(studentLst);
        Files.write(Paths.get("studentList.json"), studentLst.getBytes());


    } catch (IOException e) {
        e.printStackTrace();

    }


}
}


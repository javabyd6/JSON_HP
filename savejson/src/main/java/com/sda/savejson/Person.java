package com.sda.savejson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author perczynski
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private String lastname;
    private int age;


}

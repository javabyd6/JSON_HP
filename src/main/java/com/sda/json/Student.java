package com.sda.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author perczynski
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    private  String name;
    private  String lastname;
    private  Address addres;


}

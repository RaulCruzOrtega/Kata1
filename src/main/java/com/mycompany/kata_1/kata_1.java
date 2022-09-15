package com.mycompany.kata_1;

import java.util.Date;

public class kata_1 {
    
    public static void main(String[] args){
        Person person = new Person("Juaquin", new Date(102, 9, 5));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
    
    
}

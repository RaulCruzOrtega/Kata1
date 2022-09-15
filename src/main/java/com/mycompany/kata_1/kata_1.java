package com.mycompany.kata_1;

import java.time.LocalDate;


public class kata_1 {
    
    public static void main(String[] args){
        LocalDate date;
        date = LocalDate.of(2002, 6, 9);
        
        Person person = new Person("Joaquín", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }    
}

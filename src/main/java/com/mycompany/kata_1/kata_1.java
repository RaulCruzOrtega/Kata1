package com.mycompany.kata_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class kata_1 {
    
    public static void main(String[] args){
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2002, 6, 9);
        Person person = new Person("Juaquin", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
    
    
}

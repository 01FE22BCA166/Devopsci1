package Devopsci1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date dob;

    public Person(String name, String dob) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        this.dob = sdf.parse(dob);
    }

    public void displayName() {
        System.out.println("Person's name is: " + name);
    }

    public void displayAge(String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date today = new Date();
        long ageInMillis = today.getTime() - dob.getTime();
        long age = ageInMillis / (1000L * 60 * 60 * 24 * 365);
        System.out.println("Person's age is: " + age);
    }

    public static void main(String[] args) throws ParseException {
        Person person1 = new Person("Alice", "15-05-1990");
        person1.displayName();
        person1.displayAge("dd-MM-yyyy");
    }
}
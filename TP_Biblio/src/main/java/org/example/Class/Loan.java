package org.example.Class;

import java.time.LocalDate;


public class Loan {

    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now().plusDays(14);
    Person person;
    Book book;


    public String toString() {
        return
                "Profile : " + person.firstname + person.lastname + "\n" +
                        "Loan :" + book.title + "\n" +
                        "Date of loan : " + startDate + "\n" +
                        "End of loan : " + endDate +"\n"
                ;
    }


}

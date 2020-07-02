package com.example.codeclan.CourseBookingSystem.components;

import com.example.codeclan.CourseBookingSystem.models.Booking;
import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import com.example.codeclan.CourseBookingSystem.repositories.BookingRepository;
import com.example.codeclan.CourseBookingSystem.repositories.CourseRepository;
import com.example.codeclan.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course java = new Course("Java", "Dundee", 5);
        courseRepository.save(java);

        Course csharp = new Course("C Sharp", "Glasgow", 2);
        courseRepository.save(csharp);

        Course ruby = new Course("Ruby", "Edinburgh", 3);
        courseRepository.save(ruby);

        Course python = new Course("Python", "Perth", 4);
        courseRepository.save(python);

//        Course javascript = new Course("Javascript", "Glasgow", 4);
//        courseRepository.save(javascript);
//
//        Course sql = new Course("SQL", "Edinburgh", 3);
//        courseRepository.save(sql);

        Customer tony = new Customer("Tony", "Dundee", 24);
        customerRepository.save(tony);

        Customer billy = new Customer("Billy", "Edinburgh", 36);
        customerRepository.save(billy);

        Customer sandy = new Customer("Sandy", "Perth", 22);
        customerRepository.save(sandy);

        Customer mark = new Customer("Mark", "Glasgow", 39);
        customerRepository.save(mark);

        Customer jill = new Customer("Jill", "Edinburgh", 28);
        customerRepository.save(jill);

        Customer garry = new Customer("Garry", "Glasgow", 40);
        customerRepository.save(garry);

        Customer pauline = new Customer("Pauline", "Edinburgh", 53);
        customerRepository.save(pauline);

        Customer adam = new Customer("Adam", "Edinburgh", 28);
        customerRepository.save(adam);

        Customer calum = new Customer("Calum", "Glasgow", 22);
        customerRepository.save(calum);

        Customer zara = new Customer("Zara", "Dundee", 31);
        customerRepository.save(zara);

        Booking booking1 = new Booking("22-11-2020", python, sandy);
        python.addBooking(booking1);
        sandy.addBooking(booking1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("10-01-2020", java, zara);
        java.addBooking(booking2);
        zara.addBooking(booking2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("23-04-2020", ruby, adam);
        ruby.addBooking(booking3);
        adam.addBooking(booking3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("23-04-2020", ruby, pauline);
        ruby.addBooking(booking4);
        pauline.addBooking(booking4);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("10-01-2020", java, tony);
        java.addBooking(booking5);
        tony.addBooking(booking5);
        bookingRepository.save(booking5);
    }

}

package com.example.codeclan.CourseBookingSystem.repositories;

import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourse(Course course);

    Customer findByName(String name);

    List<Customer> findByBookingsCourseTown(String town);
}

//    Get all customers in a given town for a given course

//    Get all customers over a certain age in a given town for a given course

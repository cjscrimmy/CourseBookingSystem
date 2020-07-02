package com.example.codeclan.CourseBookingSystem.repositories;

import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourse(Course course);
}

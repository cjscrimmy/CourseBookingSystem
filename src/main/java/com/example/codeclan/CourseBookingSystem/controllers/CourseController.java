package com.example.codeclan.CourseBookingSystem.controllers;

import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import com.example.codeclan.CourseBookingSystem.repositories.CourseRepository;
import com.example.codeclan.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> findCoursesByRatingOrCustomer(
            @RequestParam(name = "rating", required = false) Integer rating,
            @RequestParam(name = "customer", required = false) String customerName){
        if (rating != null){
            return new ResponseEntity<>(courseRepository.findByRating(rating), HttpStatus.OK);
        }
        if (customerName != null){
            Customer customer = customerRepository.findByName(customerName);
            return new ResponseEntity<>(courseRepository.findByBookingsCustomer(customer), HttpStatus.OK);
        }
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/courses/{id}")
    public ResponseEntity getCourse(@PathVariable Long id){
        return new ResponseEntity(courseRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/courses")
    public ResponseEntity<Course> postCourse(@RequestBody Course course){
        courseRepository.save(course);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }
}

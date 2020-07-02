package com.example.codeclan.CourseBookingSystem.controllers;

import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import com.example.codeclan.CourseBookingSystem.repositories.CourseRepository;
import com.example.codeclan.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

//    @Autowired
//    CustomerRepository customerRepository;
//
//    @Autowired
//    CourseRepository courseRepository;
//
//    @GetMapping(value = "/customers")
//    public ResponseEntity<List<Customer>> findCustomersByCourseOrName(
//            @RequestParam(name = "course", required = false) String courseName,
//            @RequestParam(name = "name", required = false) String customerName){
//        if (courseName != null){
//            Course course = courseRepository.findByName(courseName);
//            return new ResponseEntity<>(customerRepository.findByBookingsCourse(course), HttpStatus.OK);
//        }
//        if (customerName != null){
//            return new ResponseEntity<>(customerRepository.findByName(customerName), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
//    }
}

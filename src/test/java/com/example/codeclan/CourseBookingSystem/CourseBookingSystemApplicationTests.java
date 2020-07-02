package com.example.codeclan.CourseBookingSystem;

import com.example.codeclan.CourseBookingSystem.models.Booking;
import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import com.example.codeclan.CourseBookingSystem.repositories.BookingRepository;
import com.example.codeclan.CourseBookingSystem.repositories.CourseRepository;
import com.example.codeclan.CourseBookingSystem.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindBookingByDate(){
		List<Booking> foundBookings = bookingRepository.findByDate("23-04-2020");
		assertTrue(foundBookings.size() > 0);
	}

	@Test
	public void canFindCoursesByRating(){
		List<Course> foundCourses = courseRepository.findByRating(5);
		assertTrue(foundCourses.size() > 0);
	}

	@Test
	public void canFindCoursesByCustomer(){
		Customer foundCustomer = customerRepository.getOne(1L);
		List<Course> foundCourses = courseRepository.findByBookingsCustomer(foundCustomer);
		assertTrue(foundCourses.size() > 0);
	}

	@Test
	public void canFindCustomersByCourse(){
		Course foundCourse = courseRepository.getOne(1L);
		List<Customer> foundCustomers = customerRepository.findByBookingsCourse(foundCourse);
		assertTrue(foundCustomers.size() > 0);
	}
}

package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Course;
import com.nit.service.ICourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    // GET ALL COURSES
    @GetMapping("/all")
    public ResponseEntity<List<Course>> findAll() {
        List<Course> coursesList = courseService.coursesList();
        return new ResponseEntity<>(coursesList, HttpStatus.OK);
    }

    // SAVE COURSE
    @PostMapping("/save")
    public ResponseEntity<String> saveCourse(@RequestBody Course course) {
        Course savedCourse = courseService.saveCustomer(course);
        return new ResponseEntity<>(
                "Course having id :: " + savedCourse.getId() + " saved successfully !!",
                HttpStatus.CREATED
        );
    }

    // GET COURSE BY ID
    @GetMapping("/fetchById/{id}")
    public ResponseEntity<Course> getById(@PathVariable Integer id) {
        Course course = courseService.getById(id);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    // UPDATE COURSE
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateCourse(@RequestBody Course course, @PathVariable Integer id) {
        Course updatedCourse = courseService.updateCourse(course, id);
        return new ResponseEntity<>(
                "Course having id :: " + updatedCourse.getId() + " updated successfully !!",
                HttpStatus.OK
        );
    }

    // DELETE COURSE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable Integer id) {
        courseService.deleteCourse(id);
        return new ResponseEntity<>(
                "Course having id :: " + id + " deleted successfully !!",
                HttpStatus.OK
        );
    }
}

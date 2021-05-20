package com.eve_coding.rest.service;

import com.eve_coding.rest.model.Course;
import com.eve_coding.rest.repository.CourseRepository;
import com.eve_coding.rest.repository.ICourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements ICourse {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }
    public void saveCourse(Course course){
        courseRepository.save(course);
    }
    public void updateCourse(Course course){
        courseRepository.save(course);
    }
    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }
    @Override
    public Optional<Course> findCourse(String id) {
        return courseRepository.findById(id);
    }
}

package com.eve_coding.rest.controller;

import com.eve_coding.rest.model.Course;
import com.eve_coding.rest.model.Topic;
import com.eve_coding.rest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getCourses(@PathVariable String id){
        return courseService.getCourses(id);
    }
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id){
        return courseService.findCourse(id);
    }
    @RequestMapping(value = "/topics/{topicId}/courses/{id}",method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable String id, @PathVariable String topicId){
        courseService.deleteCourse(id);
    }
    @RequestMapping(value = "/topics/{topicId}/courses",method = RequestMethod.POST)
    public void saveCourse(@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.saveCourse(course);
    }
    @RequestMapping(value = "/topics/{topicId}/courses/{id}",method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course,@PathVariable String id, @PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }
}

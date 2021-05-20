package com.eve_coding.rest.repository;

import com.eve_coding.rest.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {
    public List<Course> findByTopicId(String topicId);
    //public List<Course> findCoursesByTopic(String topicId);
}

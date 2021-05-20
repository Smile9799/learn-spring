package com.eve_coding.rest.repository;

import com.eve_coding.rest.model.Course;

import java.util.Optional;

public interface ICourse {

    Optional<Course> findCourse(String id);
}

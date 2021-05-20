package com.eve_coding.rest.repository;

import com.eve_coding.rest.model.Topic;

import java.util.Optional;

public interface ITopic {
    Optional<Topic> findTopic(String id);
}

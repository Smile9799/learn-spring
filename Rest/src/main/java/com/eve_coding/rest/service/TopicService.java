package com.eve_coding.rest.service;


import com.eve_coding.rest.model.Topic;
import com.eve_coding.rest.repository.ITopic;
import com.eve_coding.rest.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService implements ITopic {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }

    @Override
    public Optional<Topic> findTopic(String id) {
        return topicRepository.findById(id);
    }
}

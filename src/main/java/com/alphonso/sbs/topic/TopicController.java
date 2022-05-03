package com.alphonso.sbs.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topics")
	public List<Topic>getAllTopics(){
		return topicService.getAllTopics(); 
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

}

//GET 		/topics 			Get all topics
//GET 		/topics/id 			Gets a topic
//POST		/topics				Create a new topic
//PUT 		/topics/id			Updates the topic
//DELETE	/topics/id			Delete the topic

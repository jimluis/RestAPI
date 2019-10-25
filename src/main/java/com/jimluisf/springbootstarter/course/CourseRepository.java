package com.jimluisf.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jimluisf.springbootstarter.topic.Topic;

public interface CourseRepository extends CrudRepository<Course, String>
{

	public List<Course> findByTopicId(String topicId);
	
}

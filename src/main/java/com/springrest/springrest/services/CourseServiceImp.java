package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImp implements CourseService 
{

	List<Course> list;
	
	public CourseServiceImp()
	{
		list = new ArrayList<>();
		list.add(new Course(172,"java ","javaavava"));
		list.add(new Course(173,"php","ci"));
	}
	
	@Override
	public List<Course> getCourses() 
	{
		// TODO Auto-generated method stub
		return list;
	}

}

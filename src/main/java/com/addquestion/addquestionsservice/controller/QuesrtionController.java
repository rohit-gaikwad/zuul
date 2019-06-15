package com.addquestion.addquestionsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.addquestion.addquestionsservice.model.QuestionSet;
import com.addquestion.addquestionsservice.model.ResultDetails;
import com.addquestion.addquestionsservice.service.QuestionService;


@RestController
public class QuesrtionController {
	
	@Autowired
	private QuestionService questionService;
	
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/question/add" , method=RequestMethod.POST)  //to add questions
	public Boolean addQuestion(@RequestBody QuestionSet question)
	{
		
		return questionService.addNewQuestion(question);
	}
	
	
	@RequestMapping(value="/question/addAll")   //to add questionids and answers to another table
	public Boolean addAllQuestions()
	{
		return questionService.addKeysToAnswers();
		
	}
	@RequestMapping(value="/result/{sId}")	
	public ResultDetails getResult(@PathVariable("sId") Integer studentId)
	{
		ResultDetails result= restTemplate.getForObject("http://result-service/result"+studentId, ResultDetails.class);
		
		return result;
		
	}
}

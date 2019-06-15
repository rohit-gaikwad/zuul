package com.addquestion.addquestionsservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addquestion.addquestionsservice.model.AnswerKey;
import com.addquestion.addquestionsservice.model.QuestionSet;
import com.addquestion.addquestionsservice.repository.AnswerKeyRepository;
import com.addquestion.addquestionsservice.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerKeyRepository answerKeyRepository;
	
	@Autowired
	private QuestionSet questionSet;
	
	//private AnswerKey answerKeyObject;
	public Boolean addNewQuestion(QuestionSet question)
	{
		questionSet=questionRepository.save(question);
		
		if(questionSet!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean addKeysToAnswers()
	{
		
		List<QuestionSet> questions = new ArrayList<>();
		answerKeyRepository.deleteAll();
		questions= questionRepository.findAll();
		for(QuestionSet qSet: questions)
		{
			AnswerKey aKey = new AnswerKey(qSet.getQuestionId(), qSet.getAnswer());
			answerKeyRepository.save(aKey);
		}
		
		return false;
		
		
		
	}
	
}

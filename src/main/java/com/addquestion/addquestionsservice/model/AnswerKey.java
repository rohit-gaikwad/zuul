package com.addquestion.addquestionsservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnswerKey {

	@Id
	public Integer questionId;
	public String answer;
	
	public AnswerKey() {
		
	}
	
	
	public AnswerKey(Integer questionId, String answer) {
		super();
		this.questionId = questionId;
		this.answer = answer;
	}
	
	
}

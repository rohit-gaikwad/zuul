package com.addquestion.addquestionsservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class QuestionSet {
	
	@Id 
	@GeneratedValue
	public Integer questionId;
	public String question;
	public String option1;
	public String option2;
	public String option3;
	public String option4;
	public String answer;
	public Integer questionSet;
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
}

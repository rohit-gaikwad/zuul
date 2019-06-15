package com.addquestion.addquestionsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addquestion.addquestionsservice.model.QuestionSet;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionSet, Integer> {
	
	

}

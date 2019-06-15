package com.addquestion.addquestionsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addquestion.addquestionsservice.model.AnswerKey;

public interface AnswerKeyRepository extends JpaRepository<AnswerKey, Integer> {

}

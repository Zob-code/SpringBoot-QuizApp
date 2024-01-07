package com.zobCode.quizapp.QuizApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zobCode.quizapp.QuizApp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
package com.huongdanjava.questionservice.service;

import com.huongdanjava.questionservice.dto.Question;
import reactor.core.publisher.Flux;

import java.net.URI;

public interface QuestionService {

    String getServiceUrl();

    Flux<Question> findQuestionsByCategoryId(String categoryId);
}
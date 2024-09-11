package com.example.newsServiceApp.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface INewsService {
    List<String> searchNewsArticles(String searchTerm);
}

package com.example.newsServiceApp.controller;
import com.example.newsServiceApp.service.INewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {

    private final INewsService newsService;

    @GetMapping("/search")
    public ResponseEntity<List<String>> searchNews(@RequestParam("term") String searchTerm) {
        List<String> urls = newsService.searchNewsArticles(searchTerm);
        return ResponseEntity.ok(urls);
    }
}

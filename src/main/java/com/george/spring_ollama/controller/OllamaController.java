package com.george.spring_ollama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.george.spring_ollama.service.LlamaAIService;

@RestController
public class OllamaController {

	   @Autowired
	    private LlamaAIService aiService;

	    @GetMapping("/api/v1/generate")
	    public String generate(@RequestParam(value = "promptMessage") String promptMessage) {
	        return aiService.generateResult(promptMessage);
	    }
}

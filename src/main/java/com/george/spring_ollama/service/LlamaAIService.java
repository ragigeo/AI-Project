package com.george.spring_ollama.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LlamaAIService {
	
	 @Autowired
	    private OllamaChatModel chatModel;


	    public String generateResult(String prompt){
	        ChatResponse response = chatModel.call(
	                new Prompt(
	                        prompt,
	                        OllamaOptions.create()
	                                .withModel("llama2")
	                ));
	        return response.getResult().getOutput().getContent();
	    }

}

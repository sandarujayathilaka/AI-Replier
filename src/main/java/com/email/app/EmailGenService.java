package com.email.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EmailGenService {

    @Value("${gemini.api.url}")
    private String geminaiApiUrl;

    @Value("${gemini.api.key}")
    private String geminaiApiKey;


    public String generateEmailReply(EmailRequest emailRequest){
        //build the prompt
        String prompt = buildPrompt(emailRequest);
        //Craft a request
        Map<String,Object> requestBody = Map.of(
                "contents",new Object[]{
                        Map.of("parts",new Object[]{
                                Map.of("text",prompt)
                        })

                }
        );

        //Do request and get response and return that

        return null;




    }

    private String buildPrompt(EmailRequest emailRequest) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("Generate a Professional email reply for the following email content. Please don't generate a subject line ");
        if(emailRequest.getTone() != null && !emailRequest.getTone().isEmpty()){
            prompt.append("Use a").append(emailRequest.getTone()).append(" tone.");
        }
        prompt.append("\nOriginal email:\n").append(emailRequest.getEmailContent());

        return prompt.toString();
    }


}

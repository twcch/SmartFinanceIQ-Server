package com.smartfinanceiq.service.impl;

import com.smartfinanceiq.service.ChatGptService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Service
public class ChatGptServiceImpl implements ChatGptService {

    @Value("${chatgpt_api_url}")
    private String chatgpt_api_url;

    @Value("${chatgpt_api_key_dir}")
    private String chatgpt_api_key_dir;

    @Value("${chatgpt_api_model}")
    private String chatgpt_api_model;

    @Override
    public String getChatGptReply(String message, Object[] data) {

        String chatgpt_api_key = getChatGptApiKey().toString();

        String datas = String.join("", (String[]) data);
        String content = message + datas;

        RestTemplate restTemplate = new RestTemplate();

        // header 參數
        HttpHeaders httpHeaders = new HttpHeaders();
        // httpHeaders.set("Content-Type", "application/json");
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "Bearer " + chatgpt_api_key);

        String httpBody = "{\"model\": \"" + chatgpt_api_model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + content + "\"}]}";

        HttpEntity httpEntity = new HttpEntity(httpBody, httpHeaders);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                chatgpt_api_url,
                HttpMethod.POST,
                httpEntity,
                String.class);

        String results = responseEntity.getBody();

        return results;

    }

    private char[] getChatGptApiKey() {

        StringBuilder sb = null;

        try (FileReader fr = new FileReader(chatgpt_api_key_dir);
             BufferedReader br = new BufferedReader(fr);) {

            sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString().toCharArray();

    }

}

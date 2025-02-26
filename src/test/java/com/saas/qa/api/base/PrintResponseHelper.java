package com.saas.qa.api.base;

import io.qameta.allure.internal.shadowed.jackson.databind.JsonNode;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintResponseHelper{

//    public static String printResponse(Response response) {
//        // 解析响应体为 JSON
//        try {
//            String result = response.body().string();
//            return result;
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    /**
     * 打印响应体中的指定key的值
     * @param result
     * @param key
     * @return string
     */
    public String printResponseString(String result, String key) {
        // 解析响应体为 JSON
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode rootNode = objectMapper.readTree(result);
            return rootNode.get(key).asText();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 打印响应体中的指定key的值
     * @param result
     * @param key
     * @return int
     */
    public Integer printResponseInt(String result, String key) {
        // 解析响应体为 JSON
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode rootNode = objectMapper.readTree(result);
            return rootNode.get(key).asInt();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean printResponseBoolean(String result, String key) {
        // 解析响应体为 JSON
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode rootNode = objectMapper.readTree(result);
            return rootNode.get(key).asBoolean();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object> printResponseList(String jsonString, String key) {
        List<Object> result = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode rootNode = objectMapper.readTree(jsonString);
            JsonNode arrayNode = rootNode.get(key);

            if (arrayNode != null && arrayNode.isArray()) {
                for (JsonNode element : arrayNode) {
                    if (element.isInt()) {
                        result.add(element.asInt());
                    } else if (element.isBoolean()) {
                        result.add(element.asBoolean());
                    } else {
                        result.add(element.asText());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

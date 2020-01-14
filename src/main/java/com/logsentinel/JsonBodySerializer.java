package com.logsentinel;

import com.fasterxml.jackson.core.JsonProcessingException;

public class JsonBodySerializer implements BodySerializer {
    private JSON json;
    
    public JsonBodySerializer(JSON json) {
        this.json = json;
    }
    
    @Override
    public String serialize(Object object) {
        try {
            return json.getContext(null).writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getContentType() {
        return "application/json;charset=UTF-8";
    }

}

package com.logsentinel;

public class PlainTextSerializer implements BodySerializer {

    @Override
    public String serialize(Object object) {
        if (object == null) {
            return null;
        }
        return object.toString();
    }
    
    @Override
    public String getContentType() {
        return "text/plain;charset=UTF-8";
    }

}

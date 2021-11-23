package com.example.demo;

import java.util.List;

public class TypesDTO {
    private List<VideoTypes> types;
    private String message;
    
    public TypesDTO(List<VideoTypes> types, String message) {
        this.types = types;
        this.message = message;
    }
    public List<VideoTypes> getTypes() {
        return types;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setTypes(List<VideoTypes> types) {
        this.types = types;
    }
}

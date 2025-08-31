package com.example.demo.model;

public class ApiResponse {
    private boolean valid;
    private String formatted;

    public ApiResponse() {
    }

    public ApiResponse(CPFModel cpfModel){
        this.valid = cpfModel.getValid();
        this.formatted = cpfModel.getFormatted();
    }

    public boolean getValid() {
        return valid;
    }

    public String getFormatted() {
        return formatted;
    }
}

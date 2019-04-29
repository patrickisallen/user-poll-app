package com.example.polls.payload;

public class ApiResponse {
    private Boolean success;
    private String message;

    public ApiResponse(Boolean success, String mesage) {
        this.success = success;
        this.message = mesage;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

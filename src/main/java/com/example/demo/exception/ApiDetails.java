package com.example.demo.exception;

import java.time.LocalDateTime;

public record ApiDetails(
        String title,
        String message,
        int statusCode,
        boolean valid,
        LocalDateTime timestamp
) {}

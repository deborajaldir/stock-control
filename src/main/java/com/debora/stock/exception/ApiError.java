package com.debora.stock.exception;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Standard error response")
public class ApiError {

    @Schema(example = "404")
    private final int status;

    @Schema(example = "Resource Not Found")
    private final String error;

    @Schema(example = "Product not found with id: 1")
    private final String message;

    @Schema(example = "/products/1")
    private final String path;

    public ApiError(int status, String error, String message, String path) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }
}
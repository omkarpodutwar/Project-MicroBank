package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
@Schema(description = "Schema to hold error response information", name = "ErrorResponse")
public class ErrorResponseDto {

    @Schema(description = "API path invoked by client")
    private String apiPath;

    @Schema(description = "Code representing the error")
    private HttpStatus errorCode;

    @Schema(description = "Message representing the error")
    private String errorMessage;

    @Schema(description = "Time at which error took place")
    private LocalDateTime errorTime;
}

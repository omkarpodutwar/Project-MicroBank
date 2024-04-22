package com.eazybytes.cards.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor //so that constructor accepts all arguments as input parameter
public class ResponseDto {

    private String statusCode;

    private String statusMsg;
}

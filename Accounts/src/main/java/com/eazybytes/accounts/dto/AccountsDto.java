package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(name = "Accounts", description = "Schema to hold accounts information")
public class AccountsDto {

    @NotEmpty(message = "Account number cannot be null or empty.")
    @Schema(description = "Account number of the customer", example = "1234567890")
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be empty.")
    @Schema(description = "Account type of the customer", example = "Savings/ Current")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be empty.")
    @Schema(description = "Branch address of the account", example = "123, Pune")
    private String branchAddress;
}

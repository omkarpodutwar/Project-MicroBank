package com.eazybytes.loans.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

//Write the data which you need to pass to the endUser i.e clientApplication
@Data
public class LoansDto {

    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile Number must be 10 digits")
    private String mobileNumber;

    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{12})",message = "LoanNumber must be 12 digits")
    private String loanNumber;

    @NotEmpty(message = "Loan type cannot be null or empty")
    private String loanType;

    @Positive(message = "Total loan should be greater than zero")
    private int totalLoan;

    @PositiveOrZero(message = "Total loan amount paid should be equal or greater than zero")
    private int amountPaid;

    @PositiveOrZero(message = "Total outstanding amount should be equal or greater than zero")
    private int outstandingAmount;
}

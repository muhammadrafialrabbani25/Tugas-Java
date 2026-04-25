package com.p2p;

import com.p2p.domain.Borrower;
import com.p2p.domain.Loan;
import com.p2p.service.LoanService;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanServiceTest {

    @Test
    void shouldRejectLoanWhenAmountIsZeroOrNegative() {

        Borrower borrower = new Borrower(true, 700);
        LoanService loanService = new LoanService();

        assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(borrower, BigDecimal.ZERO);
        });
    }

    @Test
    void shouldApproveLoanWhenCreditScoreHigh() {

        Borrower borrower = new Borrower(true, 700);
        LoanService loanService = new LoanService();

        Loan loan = loanService.createLoan(
            borrower,
            BigDecimal.valueOf(1000)
        );

        assertEquals(Loan.Status.APPROVED, loan.getStatus());
    }

    @Test
    void shouldRejectLoanWhenCreditScoreLow() {

        Borrower borrower = new Borrower(true, 500);
        LoanService loanService = new LoanService();

        Loan loan = loanService.createLoan(
            borrower,
            BigDecimal.valueOf(1000)
        );

        assertEquals(Loan.Status.REJECTED, loan.getStatus());
    }
}
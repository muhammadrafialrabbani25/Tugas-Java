package com.p2p.service;

import com.p2p.domain.Borrower;
import com.p2p.domain.Loan;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoanService {

    private static final Logger logger =
            LogManager.getLogger(LoanService.class);

    public Loan createLoan(Borrower borrower, BigDecimal amount) {

        logger.info("Create loan started");

        if (!borrower.isVerified()) {
            logger.error("Borrower not verified");
            throw new IllegalArgumentException("Borrower not verified");
        }

        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            logger.error("Invalid loan amount");
            throw new IllegalArgumentException("Invalid loan amount");
        }

        Loan loan = new Loan();

        if (borrower.getCreditScore() >= 600) {
            loan.setStatus(Loan.Status.APPROVED);
            logger.info("Loan approved");
        } else {
            loan.setStatus(Loan.Status.REJECTED);
            logger.info("Loan rejected");
        }

        logger.info("Create loan finished");

        return loan;
    }
}
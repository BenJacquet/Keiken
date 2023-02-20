package com.codurance.srp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Collectors.toCollection;

public class AccountService {
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String AMOUNT_FORMAT = "#.00";

    private TransactionRepository transactionRepository;
    private Clock clock;
    private Console console;

    public AccountService(TransactionRepository transactionRepository, Clock clock, Console console) {
        this.transactionRepository = transactionRepository;
        this.clock = clock;
        this.console = console;
    }

    private String statementLine(Transaction transaction, int balance) {
        return MessageFormat.format("{0} | {1} | {2}", formatDate(transaction.date()), formatNumber(transaction.amount()), formatNumber(balance));
    }

    private String formatDate(LocalDate date) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return dateFormatter.format(date);
    }

    private String formatNumber(int amount) {
        DecimalFormat decimalFormat = new DecimalFormat(AMOUNT_FORMAT, DecimalFormatSymbols.getInstance(Locale.UK));
        return decimalFormat.format(amount);
    }
}
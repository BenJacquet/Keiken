package com.codurance.srp;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Collectors.toCollection;

public class Console {
    private static final String STATEMENT_HEADER = "DATE | AMOUNT | BALANCE";
    public void printLine(String line) {
        System.out.println(line);
    }

    public void printStatement() {
        printHeader();
        printTransactions();
    }

    private void printHeader() {
        printLine(STATEMENT_HEADER);
    }

    private void printTransactions() {
        List<Transaction> transactions = transactionRepository.all();
        final AtomicInteger balance = new AtomicInteger(0);
        transactions.stream()
                .map(transaction -> statementLine(transaction, balance.addAndGet(transaction.amount())))
                .collect(toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(this::printLine);
    }
}

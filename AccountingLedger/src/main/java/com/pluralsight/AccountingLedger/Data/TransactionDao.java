package com.pluralsight.AccountingLedger.Data;

import com.pluralsight.AccountingLedger.Model.Transaction;

public interface TransactionDao {
    public void addDeposit(Transaction transaction);
}

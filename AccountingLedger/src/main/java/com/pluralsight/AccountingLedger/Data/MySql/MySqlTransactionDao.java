package com.pluralsight.AccountingLedger.Data.MySql;

import com.pluralsight.AccountingLedger.Data.TransactionDao;
import com.pluralsight.AccountingLedger.Model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Component
public class MySqlTransactionDao implements TransactionDao {
    private DataSource dataSource;

    @Autowired
    public MySqlTransactionDao(DataSource dataSource){
        this.dataSource=dataSource;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        String sql = "INSERT INTO transactions (description, vendor, amount) VALUES (?, ?, ?)";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, transaction.getDescription());
            preparedStatement.setString(2, transaction.getVendor());
            preparedStatement.setDouble(3, transaction.getAmount());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Transaction> getAllEntries() {
        return null;
    }

    @Override
    public List<Transaction> getAllDeposits() {
        return null;
    }

    @Override
    public List<Transaction> getAllPayments() {
        return null;
    }

    @Override
    public List<Transaction> getMonthToDate() {
        return null;
    }

   @Override
    public List<Transaction> getLastMonth() {
        return null;
    }

    @Override
    public List<Transaction> getYearToDate() {
        return null;
    }

    @Override
    public List<Transaction> getLastYear() {
        return null;
    }

    @Override
    public List<Transaction> searchByVendor(String vendorName) {
        return null;
    }
}

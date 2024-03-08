package ru.komar.transactions;

import ru.komar.accounts.Account;
import ru.komar.exceptions.InsufficientFundsException;

public class Transaction {
  public static void transfer(Account from, Account to, double amount) throws InsufficientFundsException {
    if (from.getBalance() < amount) {
      throw new InsufficientFundsException();
    } else {
      to.setAmountDeposit(amount);
      from.setWithdrawalAmount(amount);
    }
  }
}



package ru.komar;

import ru.komar.accounts.CreditAccount;
import ru.komar.accounts.DebitAccount;
import ru.komar.exceptions.InsufficientFundsException;
import ru.komar.transactions.Transaction;

public class AppTask2 {

  public static void main(String[] args) {
    CreditAccount creditAccount = new CreditAccount(0,1000, 30);
    DebitAccount debitAccount = new DebitAccount(0,500, 40);

    try {
      System.out.println("Баланс перед транзакцией:");
      System.out.println("Credit Account: " + creditAccount.getBalance());
      System.out.println("Debit Account: " + debitAccount.getBalance());

      Transaction.transfer(creditAccount, debitAccount, 700);

      System.out.println("\nБаланс после транзакции:");
      System.out.println("Credit Account: " + creditAccount.getBalance());
      System.out.println("Debit Account: " + debitAccount.getBalance());
    } catch (InsufficientFundsException e) {
      System.out.println(e.getMessage());
    }
  }
}
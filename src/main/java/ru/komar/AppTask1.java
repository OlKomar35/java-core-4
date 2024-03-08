package ru.komar;

import java.util.Scanner;
import ru.geekbrains.core.lesson4.task2.Authentifier;
import ru.geekbrains.core.lesson4.task2.SignInService;
import ru.geekbrains.core.lesson4.task2.WrongLoginException;
import ru.geekbrains.core.lesson4.task2.WrongPasswordException;
import ru.komar.accounts.Account;
import ru.komar.exceptions.DepositWithNegativeAmountException;
import ru.komar.exceptions.InsufficientFundsOnBalanceException;
import ru.komar.exceptions.NegativeBalanceException;
import ru.komar.utils.AccountUtils;

public class AppTask1 {

  public static void main(String[] args) {
    Account[] accounts = {
        new Account(25, 10.5, 5),
        new Account(-25, 10.5, 5),
        new Account(0, -10.5, 5),
        new Account(25, 10.5, 105),
    };

    for (Account account : accounts) {
      try {
        System.out.println("id-" + account.getId() + ": " + AccountUtils.checkingInputData(account));
        System.out.println("Баланс: " + account.getBalance());
      } catch (NegativeBalanceException | DepositWithNegativeAmountException | InsufficientFundsOnBalanceException e) {
        System.out.print("id-" + account.getId() + ": ");
        System.out.println(e.getMessage());
      }
    }


  }
}
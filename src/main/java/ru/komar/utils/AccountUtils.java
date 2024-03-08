package ru.komar.utils;

import ru.komar.accounts.Account;
import ru.komar.exceptions.DepositWithNegativeAmountException;
import ru.komar.exceptions.InsufficientFundsOnBalanceException;
import ru.komar.exceptions.NegativeBalanceException;

public class AccountUtils {

  public static boolean checkingInputData(Account account)
      throws NegativeBalanceException, DepositWithNegativeAmountException, InsufficientFundsOnBalanceException {
    if (account.getInitialBalance() < 0) {
      throw new NegativeBalanceException();
    } else if (account.getAmountDeposit() < 0) {
      throw new DepositWithNegativeAmountException();
    } else if (account.getBalance() - account.getWithdrawalAmount() < 0) {
      throw new InsufficientFundsOnBalanceException();
    } else {
      return true;
    }
  }
}

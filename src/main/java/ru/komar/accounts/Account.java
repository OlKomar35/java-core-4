package ru.komar.accounts;

import ru.komar.exceptions.NegativeBalanceException;

public class Account {

  protected double initialBalance;
  protected double amountDeposit;
  protected double withdrawalAmount;
  protected int id;
  protected double balance;

  protected static Integer count;

  static {
    count = 0;
  }

  /**
   * Создание аккаунта
   *
   * @param initialBalance   начальный баланс, который не должен принимать отрицательное значение
   * @param amountDeposit    сумма депозита, который кладет клиент на счет
   * @param withdrawalAmount сумма, которую клиент запрашивает для снятия
   */


  public Account(double initialBalance,
                 double amountDeposit,
                 double withdrawalAmount) {
    count++;
    this.id = count;
    this.initialBalance = initialBalance;
    this.balance = initialBalance;
    this.setAmountDeposit(amountDeposit);
    this.setWithdrawalAmount(withdrawalAmount);
  }

  //region getters and setters
  public Integer getId() {
    return id;
  }

  public double getInitialBalance() {
    return initialBalance;
  }

  public double getAmountDeposit() {
    return amountDeposit;
  }

  public double getWithdrawalAmount() {
    return withdrawalAmount;
  }

  public void setInitialBalance(double initialBalance) {
    this.initialBalance = initialBalance;
  }

  public void setAmountDeposit(double amountDeposit) {
    this.amountDeposit = amountDeposit;
    this.setBalance(amountDeposit);
  }

  public void setWithdrawalAmount(double withdrawalAmount) {
    this.withdrawalAmount = withdrawalAmount;
    this.setBalance(-withdrawalAmount);
  }

  public double getBalance() {
    return balance;
  }

  protected void setBalance(double amountAdd) {
    this.balance += amountAdd;
  }

  //endregion


}

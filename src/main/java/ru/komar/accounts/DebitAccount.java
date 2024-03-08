package ru.komar.accounts;

public class DebitAccount extends Account{

  /**
   * Создание аккаунта
   *
   * @param initialBalance   начальный баланс, который не должен принимать отрицательное значение
   * @param amountDeposit    сумма депозита, который кладет клиент на счет
   * @param withdrawalAmount сумма, которую клиент запрашивает для снятия
   */
  public DebitAccount(double initialBalance,
                      double amountDeposit,
                      double withdrawalAmount) {
    super(initialBalance, amountDeposit, withdrawalAmount);
  }
}

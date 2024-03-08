package ru.komar.exceptions;


public class InsufficientFundsOnBalanceException extends Exception {

  public InsufficientFundsOnBalanceException() {
    super();
  }

  @Override
  public String getMessage() {
    StackTraceElement[] stackTrace = getStackTrace();
    String className = null;
    int lineNumber = 0;
    if (stackTrace.length > 0) {
      className = stackTrace[0].getClassName();
      lineNumber = stackTrace[0].getLineNumber();
    }
    return String.format("Пользовательская ошибка InsufficientFundsOnBalanceException: недостаточно средств на балансе\n "
                             + "     Исключение возникло в классе: %s, на строке: %d", className, lineNumber);
  }
}

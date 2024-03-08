package ru.komar.exceptions;

public class DepositWithNegativeAmountException extends IllegalArgumentException{

  public DepositWithNegativeAmountException() {
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
    return String.format("Пользовательская ошибка DepositWithNegativeAmountException: введен депозит с отрицательной суммой\n "
                             + "     Исключение возникло в классе: %s, на строке: %d", className, lineNumber);
  }
}

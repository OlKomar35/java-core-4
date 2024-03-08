package ru.komar.exceptions;

public class NegativeBalanceException extends IllegalArgumentException {

  public NegativeBalanceException() {
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
    return String.format("Пользовательская ошибка NegativeBalanceException: введен отрицательный баланс\n "
                             + "     Исключение возникло в классе: %s, на строке: %d", className, lineNumber);
  }
}

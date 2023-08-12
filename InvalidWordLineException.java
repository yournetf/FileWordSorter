//Exception type that is used to ensure that the WordLine objects are instantiated correctly.

public class InvalidWordLineException extends IllegalArgumentException {
public InvalidWordLineException(String message) {
throw new IllegalArgumentException(message);
}
}
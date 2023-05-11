package example;

public class TasksException extends RuntimeException {
    private static final String MESSAGE = "Ошибка!";

    public TasksException(String str) {
        super(MESSAGE + " " + str);
    }

    public TasksException(String str, Throwable e) {
        super(MESSAGE + " " + str, e);
    }
}

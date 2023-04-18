package example;

public class TasksException extends RuntimeException {
    private static final String MESSAGE = "Ошибка!";

    public TasksException() {
        super(MESSAGE);
    }

    public TasksException(String str) {
        super(MESSAGE + " " + str);
    }

    public TasksException(Throwable e) {
        super(MESSAGE, e);
    }

    public TasksException(String str, Throwable e) {
        super(MESSAGE + " " + str, e);
    }
}

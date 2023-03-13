package coursework_for_second_course;

public class IncorrectArgumentException extends  Exception {
    public IncorrectArgumentException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "IncorrectArgumentException{}";
    }
}

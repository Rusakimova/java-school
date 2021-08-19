package homework.lab4;

import lombok.Getter;

@Getter
public enum HttpCode {
    INFORMATIONAL("Informational error"),
    SUCCESS("Success error"),
    REDIRECTION("3xx Redirection"),
    CLIENT("4xx Client Error"),
    SERVERERROR("5xx Server Error");

    private final String errorType;
    //private int code;

    @Override
    public String toString() {
        return getErrorType();
    }
    HttpCode(String errorType) {
        this.errorType = errorType;
        //this.code = code;
    }
}

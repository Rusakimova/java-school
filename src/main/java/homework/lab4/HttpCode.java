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
    public static void findByCode(int code) {
        if (code >= 100) {
            if (code < 200) {
                System.out.println(INFORMATIONAL.toString());
            } else {
                if (code < 300) {
                    System.out.println(SUCCESS.toString());
                } else {
                    if (code < 400) {
                        System.out.println(REDIRECTION.toString());
                    } else {
                        if (code < 500) {
                            System.out.println(CLIENT.toString());
                        } else {
                            System.out.println(SERVERERROR.toString());
                        }
                    }
                }
            }
        } else {
            throw new IllegalStateException(code +" not supported");
        }
    }
}

package homework.lab4;

import lombok.Getter;

@Getter
public enum HttpCode {
    INFORMATIONAL(100, 199, "Informational error"),
    SUCCESS(200, 299, "Success error"),
    REDIRECTION(300, 399, "3xx Redirection"),
    CLIENT(400, 499, "4xx Client Error"),
    SERVERERROR(500, 599, "5xx Server Error");

    private final String errorType;
    private int min;
    private int max;

    @Override
    public String toString() {
        return getErrorType();
    }

    HttpCode(int min, int max, String errorType) {
        this.errorType = errorType;
        this.min = min;
        this.max = max;
    }

    public static void findByCode(int httpCode) {
        boolean isFound = false;
        HttpCode[] codes = HttpCode.values();
        for (HttpCode code : codes) {
            if (httpCode >= code.min && httpCode <= code.max) {
                System.out.println(code.getErrorType() + " occurred");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            throw new IllegalStateException(httpCode + " not supported");
        }
    }
}

package homework.lab4;

public class HttpService {
    private HttpCode httpCode;
    public void handleHttpCode(int code) {
        if (code >= 100) {
            if (code < 200) {
                System.out.println(httpCode.INFORMATIONAL.getErrorType());
            } else {
                if (code < 300) {
                    System.out.println(httpCode.SUCCESS.getErrorType());
                } else {
                    if (code < 400) {
                        System.out.println(httpCode.REDIRECTION.getErrorType());
                    } else {
                        if (code < 500) {
                            System.out.println(httpCode.CLIENT.getErrorType());
                        } else {
                            System.out.println(httpCode.SERVERERROR.getErrorType());
                        }
                    }
                }
            }
        } else {
            throw new IllegalStateException(httpCode +" not supported");
        }
    }
}

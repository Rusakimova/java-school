package homework.lab4;

public class HttpService {
    public void handleHttpCode(int code) {
        HttpCode.findByCode(code);
    }
}

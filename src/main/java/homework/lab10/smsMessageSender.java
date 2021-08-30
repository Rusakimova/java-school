package homework.lab10;

import org.springframework.stereotype.Component;

@Component("sms")
public class smsMessageSender implements MessageSender {

    @Override
    public void sendMessage(Message message) {
        System.out.println("sms was send" + message.getContent());
    }

    @Override
    public String getMyType() {
        return "sms";
    }
}

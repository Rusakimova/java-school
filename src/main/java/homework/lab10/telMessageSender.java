package homework.lab10;

import org.springframework.stereotype.Component;

@Component("tel")
public class telMessageSender implements MessageSender {
    @Override
    public void sendMessage(Message message) {
        System.out.println("tel was send" + message.getContent());
    }

    @Override
    public String getMyType() {
        return "tel";
    }
}

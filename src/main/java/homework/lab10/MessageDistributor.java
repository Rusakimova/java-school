package homework.lab10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MessageDistributor {
    @Autowired
    private Map<String, MessageSender> messages;

    public void distribute(Message message) {
        String channelName = message.getChannelName();
        MessageSender messageSender = messages.get(channelName);
        if (messageSender != null) {
            messageSender.sendMessage(message);
        }
    }
}

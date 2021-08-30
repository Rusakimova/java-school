package homework.lab10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MainWorker {
    @Autowired
    private DataProducer dataProducer;

    @Autowired
    private MessageDistributor messageDistributor;

    @Scheduled(fixedDelay = 500)
    public void work() {
        Message message = dataProducer.generateMessage();
        messageDistributor.distribute(message);
    }

}

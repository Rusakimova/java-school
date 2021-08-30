package homework.lab10;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;

@Configuration
@ComponentScan
@EnableScheduling
public class DistributionProjectConf {
    @Bean
    public Map<String, MessageSender> senderMap (List<MessageSender> messages) {
        return messages.stream().collect(Collectors.toMap(MessageSender::getMyType, identity()));
    }
    @Bean
    public Faker dataFaker() {
        return new Faker();
    }
}

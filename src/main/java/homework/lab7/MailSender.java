package homework.lab7;

public class MailSender {
    public void send(MailInfo mailInfo) {
        MailTypes.findByCode(mailInfo.getMailType());
    }
}

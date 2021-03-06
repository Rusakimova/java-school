package homework.lab7;

import homework.lab7.letters.BirthdayLetter;
import homework.lab7.letters.Letter;
import homework.lab7.letters.WelcomeLetter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MailTypes {
    WELCOME(1, new WelcomeLetter()),
    BIRTHDAY(2, new BirthdayLetter());

    private final int type;
    private final Letter letter;

    public static MailTypes findByCode(int type) {
        MailTypes[] types = MailTypes.values();
        for (MailTypes mailType : types) {
            if (type == mailType.type) {
                mailType.letter.sendContent();
                return mailType;
            }
        }
        throw new IllegalStateException(type + " not supported");
    }
}

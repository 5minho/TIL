package kr.co.hanbit.mastering.springmvc4.date;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2018. 9. 17..
 */
public class KRLocalDateFormatter implements Formatter<LocalDate> {

    private static final String KR_PATTERN = "yyyy/MM/dd";
    private static final String NORMAL_PATTERN = "dd/MM/yyyy";

    @Override
    public LocalDate parse(String text, Locale locale) throws ParseException {
        return LocalDate.parse(text, DateTimeFormatter.ofPattern(getPattern(locale)));
    }

    public static String getPattern(Locale locale) {
        return isKorea(locale) ? KR_PATTERN : NORMAL_PATTERN;
    }

    private static boolean isKorea(Locale locale) {
        return Locale.KOREA.getCountry().equals(locale.getCountry());
    }

    @Override
    public String print(LocalDate object, Locale locale) {
        return null;
    }
}

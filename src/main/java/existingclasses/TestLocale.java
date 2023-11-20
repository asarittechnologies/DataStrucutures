package existingclasses;

import java.util.List;
import java.util.Locale;
import java.util.Locale.*;

public class TestLocale {
    public static void main(String[] args) {
        System.out.println(toLanguageTag("zh_HANS_HK",true));
    }

    public static String toLanguageTag(String locale, boolean toggle) {
        String[] locales = locale.split("_");
        Locale locale1;
        if(locales.length == 3){
             locale1 = new Locale.Builder()
                    .setLanguage(locales[0])
                    .setRegion(locales[2])
                    .setScript(locales[1])
                    .build();
        }else{
            locale1 = new Locale.Builder()
                    .setLanguage(locales[0])
                    .setRegion(locales[1])
                    .build();
        }

        if (toggle) {
            return convertOldISOCodes(locale1);
        }
        return locale1.toLanguageTag();
    }
    private static String convertOldISOCodes(Locale locale) {
        String language = locale.getLanguage();
        switch (language) {
            case "iw":
                return locale.toLanguageTag().replace("he", "iw");
            case "ji":
                return locale.toLanguageTag().replace("yi", "ji");
            case "in":
                return locale.toLanguageTag().replace("id", "in");
            default:
                return locale.toLanguageTag();
        }
    }
}

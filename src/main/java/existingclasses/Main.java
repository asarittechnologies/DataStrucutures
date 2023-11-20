package existingclasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //String folderPath = "C:\\expedia\\renu\\ompMessages";
        String folderPath = "C:\\expedia\\renu\\";
        String filename = "68559905-d650-4940-9e47-02ffa63ec95d";
        Path start = Paths.get(folderPath+filename);
        String l= null;

        try (Stream<Path> stream = Files.walk(start, Integer.MAX_VALUE)) {
            l = stream
                    .map(String::valueOf)
                   // .filter(a -> (a.contains("ompMessages")))
                    .filter(f -> (f.matches(".*[0-9].*")))
                   // .limit(1)
                    .max(Comparator.comparingInt(String::length))
                    .get();
                    //.collect(Collectors.toList());

          //  collect.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //l.stream().forEach(System.out::println);
       // collect.stream().filter(a -> a.endsWith("[0-9]").forEach(System.out::println);
       // String substring = collect.get(0).substring(folderPath.length()+1, collect.get(0).lastIndexOf("\\"));
        System.out.println(l.substring(0,l.lastIndexOf(filename)+filename.length()));
        int i = l.lastIndexOf("68559905-d650-4940-9e47-02ffa63ec95d");

          System.out.println(l.substring(folderPath.length()+filename.length()+1,i));




    }

//0b476d10-d110-4485-b1c6-a1fcacf3bf80/ -- messageToLocalize
// 0c914e31-9d69-4db2-aa4e-a92d6d898ac1/ -- platform
//d0455f76-9f37-4ce9-84d5-e6a57e9e703b/ -- expedia
    public static boolean checkGUID(String s){
        String str = "ompMessages";
        final String OMP_PUSH_OR_SMS_REGEX_PATTERN = "\\w";
        Pattern pattern = Pattern.compile(OMP_PUSH_OR_SMS_REGEX_PATTERN);
        if(pattern.matcher(str).matches()){
            System.out.println(str);
        }
        return  pattern.matcher(s).matches();
    }
}
enum ABC{
    OMP("omp"),OMP_PUSH("omp/pushorsms"), OMP_SMS("sms");
    private String name;

    ABC(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public static Boolean isAllowedChannelId(final String channelId) {
        Boolean result = false;
        for (ABC channels : values()) {
            if (channels.getName().equalsIgnoreCase(channelId)) {
                return result = true;
            }
        }
        return result;
    }
}
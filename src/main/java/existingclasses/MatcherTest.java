package existingclasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

    public static void main(String[] args) {
         String omp = "ompMessages/pushOrSms/Expedia//c5c1e37a-be25-43b8-bbdb-9be4ecabec1d/CONTENT_TEMPLATE/";
         String locale = "messageToLocallie/c5c1e37a-be25-43b8-bbdb-9be4ecabec1d";

        String regex = "([^/]+)/([^/]+)/([^/]+)/(.*?([^/]+)/?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(omp);
        if (matcher.matches()) {

            System.out.println(matcher.group(1)+"/"+matcher.group(2)+"/"+matcher.group(3));
        }
        String ompMsg = "ompMessages/pushOrSms/Expedia";
        if(ompMsg.contains("ompMessages")){
            System.out.println("hi");
        }else{
            System.out.println("No");
        }

    }
}

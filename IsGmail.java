import java.util.regex.Pattern;

/**
 * Created by User on 07.06.2017.
 */
public class IsGmail {
    public static void main(String[] args) {
        String input = "email1@gmail.com, email2@gmail.com, email3@gmail.com," +
                " email4@gmail.com, email5@gmail.com, email6@gmail.com,";
        System.out.println(isGmail(input));
    }
    public static boolean isGmail(String input)
    {	boolean isMail=false;
        boolean email = Pattern.matches("^(?i)(?:[a-z0-9](?:[^@ ]{1,29})@(?:[a-z]{1,10}[a-z0-9\\-.]" +
                "[a-z0-9]{1,17})\\.(?:[a-z]{1,3})(?:, |$))+$",input);
       if  (email=true)
        {
            isMail= Pattern.matches("^(?i)(?:(?:[^@]+@(?:gmail|yandex|yahoo)\\.(?:com|ru))(?:,|$))+$", input);
        }
        return isMail;
    }
}
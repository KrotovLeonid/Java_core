package Lesson3;
//          1 Обязательно есть хоть 1 цифра
//          2 Не менее 8 символов и не более 20
//          3 Должны быть большие и маленькие буквы
//          4 Обязательно дожен быть спец символ
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println(size("grf"));
        System.out.println(number("9he9rf"));
    }
    private static boolean number(String str){
        Pattern n = Pattern.compile("^9he9rf$");
        Matcher m = n.matcher(str);
        return m.matches();
    }
    private static boolean size(String str){
        Pattern n = Pattern.compile("^*.{8,20}.*$");
        Matcher m = n.matcher(str);
        return m.matches();
    }
}

package HelloWorldApp.JavaInstance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTT {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(fmt.format(date));

        Long time = System.currentTimeMillis();
        System.out.println(time);
        System.out.println(fmt.format(new Date(Long.parseLong(String.valueOf(time)))));
    }
}

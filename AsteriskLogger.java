import java.util.Date;
import java.text.SimpleDateFormat;

public class AsteriskLogger implements Logger {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void log(String info) {
        String date = dateFormat.format(new Date());
        System.out.println(date + " - LOG:");
        System.out.println("***" + info + "***");
    }

    @Override
    public void error(String error) {
        String date = dateFormat.format(new Date());
        System.err.println(date + " - ERROR:");
        System.err.println("****************");
        System.err.println("***Error: " + error + "***");
        System.err.println("****************");
    }
}
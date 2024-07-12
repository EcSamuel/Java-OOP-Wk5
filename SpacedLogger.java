import java.util.Date;
import java.text.SimpleDateFormat;

public class SpacedLogger implements Logger {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void log(String info) {
        String date = dateFormat.format(new Date());
        String spacedInfo = String.join(" ", info.split(""));
        System.out.println(date + " - LOG: " + spacedInfo);
    }

    @Override
    public void error(String error) {
        String date = dateFormat.format(new Date());
        String spacedError = String.join(" ", error.split(""));
        System.err.println(date + " - ERROR: " + spacedError);
    }
}
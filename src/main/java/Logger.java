import java.util.Date;

public class Logger {
    private static Logger logger;
    protected int num = 1;

    private Logger() {}

    public void log(String msg) {
        System.out.printf("[%1$td.%1$tm.%1$tY %1$tT %2$d] %3$s\n", new Date(), num++, msg);
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}

package gr.aueb.cf.ch14;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Defines a Singleton class with lazy instantiation.
 *
 * Υλοποιήστε μία Singleton class με όνομα Logger
 * που κάνει log messages στο System.err. Θα
 * πρέπει να περιέχει και μία μέθοδο void
 * logMessage(String message) που εκτυπώνει ένα
 * μήνυμα ακολουθούμενο από ένα timestamp
 */
public class Logger {

    private static Logger log = null;

    private Logger () {

    }

    public static Logger getInstance() {
        if (log == null) {
            log = new Logger();
        }
        return log;
    }

    public void logMessage (String message) {
        String time  = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        System.err.println(time + " - " +message);
    }


}

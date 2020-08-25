import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {
    protected LocalDate by;

    public Deadline(String description, String by) {
        super(description);
        this.by = LocalDate.parse(by);
    }

    @Override
    public String getStoringFormat() {
        if (this.isDone) {
            return "D ~ 1 ~ " + this.description + " ~ " + this.by;
        } else {
            return "D ~ 0 ~ " + this.description + " ~ " + this.by;
        }
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " +
                by.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }
}

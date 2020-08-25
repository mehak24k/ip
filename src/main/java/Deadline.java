public class Deadline extends Task {
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
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
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}

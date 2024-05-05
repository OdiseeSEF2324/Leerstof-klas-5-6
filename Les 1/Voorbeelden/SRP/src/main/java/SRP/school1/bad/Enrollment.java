package SRP.school1.bad;

import java.util.Date;
/** POJO class voor inschrijving */
public class Enrollment {
    private final Student student;
    private final String course;
    private final Date date;
    private final String comment;
    private final boolean approved;
    private final boolean cancelled;
    private final boolean rejected;
    private final boolean deleted;

    public Enrollment(Student student, String course, Date date, String comment, boolean approved, boolean cancelled, boolean rejected, boolean deleted) {
        this.student = student;
        this.course = course;
        this.date = date;
        this.comment = comment;
        this.approved = approved;
        this.cancelled = cancelled;
        this.rejected = rejected;
        this.deleted = deleted;
    }
}

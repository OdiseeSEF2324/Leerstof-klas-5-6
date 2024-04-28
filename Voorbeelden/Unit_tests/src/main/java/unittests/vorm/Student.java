package unittests.vorm;

import java.util.Date;
import java.util.Objects;

/** stelt 1 student voor */
public class Student {
    private String name;
    private Date birthDate;
    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int leeftijdscategorie() {
        if (this.birthDate.after(new Date(100,0,1))) return 5;
        else return 7;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
    // Getters en setters voor 1 student
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(birthDate, student.birthDate);
    }


}

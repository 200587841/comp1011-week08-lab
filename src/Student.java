import java.util.Objects;

//From 1, Task 1
public class Student {
    int id;
    String name;
    String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //From 1, Task 2
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    //From 1, Task 2
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    //To make the system user-friendly when printing:
    public String toString() {
        return "Student id =" + id + ", Student name = " + name + ", Student email = " + email;
    }
}

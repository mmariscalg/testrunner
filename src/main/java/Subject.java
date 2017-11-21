import java.util.ArrayList;
import java.util.List;

/**
 * Created by mario.mariscal on 21/11/2017.
 */
public class Subject {
    int id;
    String name;
    List<Student> students;

    public Subject(int id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public Subject(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Boolean addStudent(Student newStudent) {
        if (getStudents().add(newStudent))
            return true;
        else
            return false;
    }

    public Boolean removeStudent(Student newStudent) {
        if (getStudents().remove(newStudent))
            return true;
        else
            return false;
    }
}

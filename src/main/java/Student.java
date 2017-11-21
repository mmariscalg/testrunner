/**
 * Created by mario.mariscal on 20/11/2017.
 */
public class Student {

    int id;
    String name;
    String surname;
    String age;
    float calification;

    public Student(int id, String name, String surname, String age, float calification) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.calification = calification;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public float getCalification() {
        return calification;
    }

    public void setCalification(float calification) {
        this.calification = calification;
    }
}

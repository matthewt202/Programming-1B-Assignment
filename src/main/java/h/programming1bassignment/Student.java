package h.programming1bassignment;

public class Student 
{
    private String name;
    private int id;
    private int age;
    private String email;
    private String course;

    public Student(String name, int id, int age, String email, String course) 
    {
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public String getName() 
    {
        return name;
    }

    public int getId() 
    {
        return id;
    }

    public int getAge() 
    {
        return age;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getCourse() 
    {
        return course;
    }

    @Override
    public String toString() 
    {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Email: " + email + ", Course: " + course;
    }
}

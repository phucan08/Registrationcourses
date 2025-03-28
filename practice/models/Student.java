package models;

public abstract class Student {
    protected String id;
    protected String name;
    protected int englishScore;

    public Student(String id, String name, int englishScore) {
        this.id = id;
        this.name = name;
        this.englishScore = englishScore;
    }

    public abstract String getGroupName();
    public abstract String getAllowedCourses();
}

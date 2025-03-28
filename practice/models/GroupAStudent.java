package models;

public class GroupAStudent extends Student {
    public GroupAStudent(String id, String name, int englishScore) {
        super(id, name, englishScore);
    }

    @Override
    public String getGroupName() {
        return "Group A";
    }

    @Override
    public String getAllowedCourses() {
        return "all courses";
    }
}

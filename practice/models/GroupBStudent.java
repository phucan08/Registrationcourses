package models;

import java.util.Arrays;
import java.util.List;

public class GroupBStudent extends Student {
    private static final List<String> ALLOWED_COURSES = Arrays.asList("IE1", "IE2", "PT1", "PT2");

    public GroupBStudent(String id, String name, int englishScore) {
        super(id, name, englishScore);
    }

    @Override
    public String getGroupName() {
        return "Group B";
    }

    @Override
    public String getAllowedCourses() {
        return String.join(", ", ALLOWED_COURSES);
    }
}   

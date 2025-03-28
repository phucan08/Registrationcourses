package models;

import java.util.Arrays;
import java.util.List;

public class GroupCStudent extends Student {
    private static final List<String> ALLOWED_COURSES = Arrays.asList("EE1", "EE2");

    public GroupCStudent(String id, String name, int englishScore) {
        super(id, name, englishScore);
    }

    @Override
    public String getGroupName() {
        return "Group C";
    }

    @Override
    public String getAllowedCourses() {
        return String.join(", ", ALLOWED_COURSES);
    }
}

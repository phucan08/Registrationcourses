package factory;

import models.*;

public class StudentFactory {
    public static Student createStudent(String id, String name, int englishScore) {
        if (englishScore >= 80) {
            return new GroupAStudent(id, name, englishScore);
        } else if (englishScore >= 60) {
            return new GroupBStudent(id, name, englishScore);
        } else {
            return new GroupCStudent(id, name, englishScore);
        }
    }
}

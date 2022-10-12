package oopWithNLayeredApp;

import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.core.logging.EmailLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateCourseDao;
import oopWithNLayeredApp.entities.Courses;

import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        Courses course1 = new Courses(1, "Java", "Programlama", "Engin Demiroğ", 50);
        Courses course2 = new Courses(1, "Java", "Programlama", "Engin Demiroğ", 50);
        Logger logger[] = {new EmailLogger(),new FileLogger()};
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), List.of(logger));
        courseManager.add(course1);
        courseManager.add(course2);
    }
}

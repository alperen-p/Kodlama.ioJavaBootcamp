package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.CourseDao;
import oopWithNLayeredApp.entities.Courses;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<String> courseCategoryList = new ArrayList<>();
    private List<String> courseNameList = new ArrayList<>();
    private List<Logger> loggers;


    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Courses course) throws Exception {

        if (courseCategoryList.contains(course.getCategory())) {
                throw new Exception("Aynı kategori ismini veremezsin.");
        }
        if (courseNameList.contains(course.getCourseName())) {
                throw new Exception("Aynı kurs ismi veremezsin.");
        }

        if (course.getUnitPrice() < 0) {
                throw new Exception("Kurs fiyatı 0dan küçük olamaz.");
        }

        courseCategoryList.add(course.getCategory());
        courseNameList.add(course.getCourseName());
        courseDao.add(course);
        for(Logger logger:loggers){
            logger.log();
        }
    }
}

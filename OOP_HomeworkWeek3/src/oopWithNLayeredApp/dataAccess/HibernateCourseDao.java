package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Courses;

public class HibernateCourseDao implements CourseDao {

    @Override
    public void add(Courses courses) {
        System.out.println("Hibernate ile veritabanına eklendi." + courses.getCourseName());
    }
}

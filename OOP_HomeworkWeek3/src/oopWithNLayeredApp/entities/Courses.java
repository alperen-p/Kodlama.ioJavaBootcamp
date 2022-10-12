package oopWithNLayeredApp.entities;

public class Courses {
    private int id;
    private String courseName;
    private String category;
    private String lecturerName;
    private int unitPrice;

    public Courses() {
    }

    public Courses(int id, String courseName, String category, String lecturerName, int unitPrice) {
        this.id = id;
        this.courseName =courseName;
        this.category = category;
        this. lecturerName = lecturerName;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}

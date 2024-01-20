public class StudentData {
    private double numberCourses;
    private double timeStudy;
    private double marks;

    public StudentData(double numberCourses, double timeStudy, double marks) {
        this.numberCourses = numberCourses;
        this.timeStudy = timeStudy;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "numberCourses=" + numberCourses +
                ", timeStudy=" + timeStudy +
                ", marks=" + marks +
                '}';
    }

    public double getNumberCourses() {
        return numberCourses;
    }

    public void setNumberCourses(double numberCourses) {
        this.numberCourses = numberCourses;
    }

    public double getTimeStudy() {
        return timeStudy;
    }

    public void setTimeStudy(double timeStudy) {
        this.timeStudy = timeStudy;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<StudentData> students = CSVStudentDataLoader.create("datos.csv").load();
        List<Double> data = new ArrayList<>();
        students.forEach(s -> data.add(s.getNumberCourses()));
        data.sort((i,j) -> {return (int)(i-j);});
        TreeMap<Double, Integer> courses = CSVStudentDataLoader.dataCount(data);
        for(Double key: courses.keySet()){
            System.out.println(key + " : " + courses.get(key));
        }
    }
}

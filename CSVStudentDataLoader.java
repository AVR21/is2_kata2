import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CSVStudentDataLoader implements StudentDataLoader{

    private File file;

    private CSVStudentDataLoader(File file){
        this.file = file;
    }

    public static CSVStudentDataLoader create(String file){
        return new CSVStudentDataLoader(new File(file));
    }

    @Override
    public List<StudentData> load() {
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            return load(br);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<StudentData> load(BufferedReader br) {
        return br.lines().skip(1L).map(this::StudentObject).collect(Collectors.toList());
    }

    private StudentData StudentObject(String line){
        double[] values = Arrays.stream(line.split(",")).mapToDouble(Double::parseDouble).toArray();
        return new StudentData(values);
    }

    public static TreeMap<Double, Integer> dataCount(List<Double> data) {
        TreeMap<Double, Integer> resumen = new TreeMap<>();
        data.forEach(i -> resumen.merge(i, 1, Integer::sum));
        return resumen;
    }

}

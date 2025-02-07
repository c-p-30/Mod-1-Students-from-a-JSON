import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src\\students.json"); //creating a reader instance

            Gson gson = new Gson();//creating a GSON instance

            Type studentListType = new TypeToken<List<Student>>() {}.getType();

            List<Student> students = gson.fromJson(reader, studentListType); //deserializing the data from the JSON file

            reader.close();//closing a reader instance

            for (Student student : students) { //print students details in a good format
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Grade: " + student.getGrade());
                System.out.println();
            }
        } catch (IOException e) { //error message for catching an error related to reading a JSON file
            System.err.println("Error reading JSON file: " + e.getMessage());
        }
    }
}

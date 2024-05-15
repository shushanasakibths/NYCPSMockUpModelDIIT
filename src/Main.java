import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SystemManager systemManager = new SystemManager();


        Student student1 = new Student("123456789", "LeandraFatouKristenHana Preston", new Date(2007, 4, 25), "123 Main St");
        systemManager.addStudent(student1);

        Record record1 = new Record("Transcript", new Date(), "Grade 9 Transcript");
        student1.addRecord(record1);

        RecordRequest request1 = new RecordRequest(
                student1,
                "Transcript",
                Arrays.asList("Grade 9 Transcript"),
                "wowowo@gmail.com"
        );
        systemManager.addRecordRequest(request1);

        systemManager.processAllRequests();

        System.out.println(request1.generateSummary());
    }
}

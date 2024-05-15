import java.util.ArrayList;
import java.util.List;

public class SystemManager {
    private List<Student> students;
    private List<RecordRequest> recordRequests;

    public SystemManager() {
        this.students = new ArrayList<>();
        this.recordRequests = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }


    public void addRecordRequest(RecordRequest request) {
        this.recordRequests.add(request);
    }

    public void processAllRequests() {
        for (RecordRequest request : recordRequests) {
            if (!request.isProcessed()) {
                request.processRequest();
            }
        }
    }

    public Student findStudentByOsis(String osisNumber) {
        for (Student student : students) {
            if (student.getOsisNumber().equals(osisNumber)) {
                return student;
            }
        }
        return null;
    }

    public List<RecordRequest> getAllRecordRequests() {
        return recordRequests;
    }
}

import java.util.Date;
import java.util.List;

public class RecordRequest {
    private Student student;
    private String requestType;
    private List<String> documentsRequested;
    private String requesterContactInfo;
    private Date requestDate;
    private boolean isProcessed;

    public RecordRequest(Student student, String requestType, List<String> documentsRequested, String requesterContactInfo) {
        this.student = student;
        this.requestType = requestType;
        this.documentsRequested = documentsRequested;
        this.requesterContactInfo = requesterContactInfo;
        this.requestDate = new Date(); // Current date
        this.isProcessed = false;
    }

    // Getters and Setters
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public List<String> getDocumentsRequested() {
        return documentsRequested;
    }

    public void setDocumentsRequested(List<String> documentsRequested) {
        this.documentsRequested = documentsRequested;
    }

    public String getRequesterContactInfo() {
        return requesterContactInfo;
    }

    public void setRequesterContactInfo(String requesterContactInfo) {
        this.requesterContactInfo = requesterContactInfo;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public void setProcessed(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }

    public void processRequest() {
        // Logic to process the request
        this.isProcessed = true;
    }

    public void addDocument(String document) {
        this.documentsRequested.add(document);
    }

    public String generateSummary() {
        return "Request Summary: " +
                "\nStudent: " + student.getName() +
                "\nOSIS Number: " + student.getOsisNumber() +
                "\nRequest Type: " + requestType +
                "\nDocuments Requested: " + String.join(", ", documentsRequested) +
                "\nRequest Date: " + requestDate +
                "\nProcessed: " + isProcessed;
    }
}

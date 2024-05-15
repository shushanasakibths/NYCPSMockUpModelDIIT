import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private String osisNumber;
    private String name;
    private Date dateOfBirth;
    private String address;
    private ArrayList<Record> records;

    public Student(String osisNumber, String name, Date dateOfBirth, String address) {
        this.osisNumber = osisNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        records = new ArrayList<>();
    }

    public String getOsisNumber() {
        return osisNumber;
    }

    public void setOsisNumber(String osisNumber) {
        this.osisNumber = osisNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Record> records) {
        this.records = records;
    }

    public void addRecord(Record record) {
        records.add(record);
    }
}

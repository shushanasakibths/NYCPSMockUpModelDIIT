import java.util.Date;

public class Record {
    private String recordType;
    private Date dateCreated;
    private String details;

    public Record(String recordType, Date dateCreated, String details) {
        this.recordType = recordType;
        this.dateCreated = dateCreated;
        this.details = details;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

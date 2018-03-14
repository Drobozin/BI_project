package ru.bellintegrator.practice.model;
import javax.persistence.*;


@Entity
@Table(name = "Worker")
public class Worker {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Basic (optional = false)
    @Column (name = "first_name", length = 140)
    private String firstName;

    @Basic (optional = false)
    @Column (name = "last_name", length = 140)
    private String lastName;

    @Basic (optional = false)
    @Column (name = "middle_name", length = 140)
    private String middleName;

    @Basic (optional = false)
    @Column (name = "position", length = 280)
    private String position;

    @Basic (optional = false)
    @Column (name = "phone", length = 16)
    private String phone;

    @Basic (optional = false)
    @Column (name = "doc_number", length = 140)
    private int docNumber;

    @Basic (optional = false)
    @Column (name = "doc_date")
    @Temporal(TemporalType.DATE)
    private java.util.Date docDate;

    @Basic (optional = false)
    @Column (name = "citizenship_name", length = 140)
    private String citizenshipName;

    @Basic (optional = false)
    @Column (name = "citizenship_code", length = 6)
    private int citizenshipCode;

    @Basic (optional = false)
    @Column (name = "is_identified")
    private boolean isIdentified;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "office_id")
    private Worker worker;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "doc_type", joinColumns = @JoinColumn(name = "name"), inverseJoinColumns = @JoinColumn(name = "code") )
    private DocType docType;

    public Worker(){

    }

    public Worker(long id, String firstName, String lastName, String middleName, String position, String phone,
                  int docNumber, java.util.Date docDate, String citizenshipName, int citizenshipCode, boolean isIdentified){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.phone = phone;
        this.docNumber = docNumber;
        this.docDate = docDate;
        this.citizenshipName = citizenshipName;
        this.citizenshipCode = citizenshipCode;
        this.isIdentified = isIdentified;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("{id:");
        builder.append(getId());
        builder.append(";firstName:");
        builder.append(getFirstName());
        builder.append(";lastName:");
        builder.append(getLastName());
        builder.append(";middleName:");
        builder.append(getMiddleName());
        builder.append(";position:");
        builder.append(getPosition());
        builder.append(";phone:");
        builder.append(getPhone());
        builder.append(";docNumber:");
        builder.append(getDocNumber());
        builder.append(";docDate:");
        builder.append(getDocDate());
        builder.append(";citizenshipName:");
        builder.append(getCitizenshipName());
        builder.append(";citizenshipCode:");
        builder.append(getCitizenshipCode());
        builder.append(";isIdentified:");
        builder.append(getIsIdentified());
        builder.append("} ");

        return builder.toString();
    }
    public long getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getMiddleName(){
        return middleName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public int getDocNumber(){
        return docNumber;
    }
    private void setDocNumber(int docNumber){
        this.docNumber = docNumber;
    }

    public java.util.Date getDocDate() {
        return docDate;
    }
    public void setDocDate(java.util.Date docDate) {
        this.docDate = docDate;
    }

    public String getCitizenshipName() {
        return citizenshipName;
    }
    public void setCitizenshipName(String citizenshipName) {
        this.citizenshipName = citizenshipName;
    }

    public int getCitizenshipCode() {
        return citizenshipCode;
    }
    public void setCitizenshipCode(int citizenshipCode) {
        this.citizenshipCode = citizenshipCode;
    }

    public boolean getIsIdentified() {
        return isIdentified;
    }
    public void setIdentified(boolean isIdentified) {
        this.isIdentified = isIdentified;
    }
}

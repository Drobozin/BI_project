package ru.bellintegrator.practice.model;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Worker")
public class Worker {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "officeId")
    private Worker worker;

    @Basic (optional = false)
    @Column (name = "firstName")
    private String firstName;

    @Basic (optional = false)
    @Column (name = "lastName")
    private String lastName;

    @Basic (optional = false)
    @Column (name = "middleName")
    private String middleName;

    @Basic (optional = false)
    @Column (name = "position")
    private String position;

    @Basic (optional = false)
    @Column (name = "phone")
    private int phone;

    @Basic (optional = false)
    @Column (name = "docName")
    private String docName;

    @Basic (optional = false)
    @Column (name = "docNumber")
    private int docNumber;

    @Basic (optional = false)
    @Column (name = "docDate")
    private String docDate;

    @Basic (optional = false)
    @Column (name = "docCode")
    private int docCode;

    @Basic (optional = false)
    @Column (name = "citizenshipName")
    private String citizenshipName;

    @Basic (optional = false)
    @Column (name = "citizenshipCode")
    private int citizenshipCode;

    @Basic (optional = false)
    @Column (name = "isIdentified")
    private boolean isIdentified;

    public Worker(){

    }

    public Worker(long id, String firstName, String lastName, String middleName, String position, int phone, String docName,
                  int docNumber, String docDate, String citizenshipName, int citizenshipCode, boolean isIdentified){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.phone = phone;
        this.docName = docName;
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
        builder.append(";docName:");
        builder.append(getDocName());
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

    public int getPhone(){
        return phone;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }

    public String getDocName(){
        return docName;
    }

    public int getDocNumber(){
        return docNumber;
    }
    private void setDocNumber(int docNumber){
        this.docNumber = docNumber;
    }

    public String getDocDate() {
        return docDate;
    }
    public void setDocDate(String docDate) {
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

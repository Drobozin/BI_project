package ru.bellintegrator.practice.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "Office")
public class Office {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Long id;

    @Version
    private Integer version;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "orgid")
    private Organization organization;

    @Basic (optional = false)
    @Column (name = "name")
    private String name;

    @Basic (optional = false)
    @Column (name = "address")
    private String address;

    @Basic (optional = false)
    @Column (name = "phone")
    private int phone;

    @Column (name = "isActive")
    private boolean isActive;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "worker", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Worker> workers;

    public Office(){

    }
    public Office (long id, String name, String address, int phone, boolean isActive){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.isActive = isActive;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("{id:");
        builder.append(getId());
        builder.append(";name:");
        builder.append(getName());
        builder.append(";address:");
        builder.append(getAddress());
        builder.append(";phone:");
        builder.append(getPhone());
        builder.append(";isActive:");
        builder.append(getIsActive());
        builder.append("} ");

        return builder.toString();
    }
    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getPhone(){
        return phone;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }

    public boolean getIsActive(){
        return isActive;
    }
    public void setIsActive (boolean isActive){
        this.isActive = isActive;
    }

}

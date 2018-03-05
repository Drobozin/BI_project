package ru.bellintegrator.practice.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "Organization")
public class Organization {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Long id;

    @Version
    private Integer version;

    @Basic (optional = false)
    @Column (name = "name")
    private String name;

    @Basic (optional = false)
    @Column (name = "fullName")
    private String fulleName;

    @Basic(optional = false)
    @Column(name = "inn")
    private int inn;

    @Basic(optional = false)
    @Column(name = "kpp")
    private int kpp;

    @Basic (optional = false)
    @Column (name = "address")
    private String address;

    @Basic (optional = false)
    @Column (name = "phone")
    private int phone;

    @Column (name = "isActive")
    private boolean isActive;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Office> offices;

    public Organization(){

    }
    public Organization(String name, String fullName, int inn, int kpp, String address, int phone, boolean isActive){
        this.name = name;
        this.fulleName = fullName;
        this.inn = inn;
        this.kpp = kpp;
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
        builder.append(";fullName:");
        builder.append(getFullName());
        builder.append(";inn:");
        builder.append(getInn());
        builder.append(";kpp:");
        builder.append(getKpp());
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

    public String getFullName(){
        return fulleName;
    }
    public void setFulleName(String fulleName){
        this.fulleName = fulleName;
    }

    public int getInn (){
        return inn;
    }
    public void setInn(int inn){
        this.inn = inn;
    }

    public int getKpp(){
        return kpp;
    }
    public void setKpp(int kpp){
        this.kpp = kpp;
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

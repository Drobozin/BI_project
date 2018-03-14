package ru.bellintegrator.practice.model;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
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
    @Column (name = "name", length = 140)
    private String name;

    @Basic (optional = false)
    @Column (name = "full_name", length = 600)
    private String fulleName;
    /**
     * у юр лиц 10 знаков в инн; у ип 12
     */
    @Basic(optional = false)
    @Column(name = "inn", length = 12)
    private String inn;

    @Basic(optional = false)
    @Column(name = "kpp", length = 9)
    private String kpp;

    @Basic (optional = false)
    @Column (name = "address", length = 1000)
    private String address;

    @Basic (optional = false)
    @Column (name = "phone", length = 16)
    private String phone;

    @Column (name = "is_active")
    private boolean isActive;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Office> offices;

    public Organization(){

    }
    public Organization(String name, String fullName, String inn, String kpp, String address, String phone, boolean isActive){
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

    public String getInn (){
        return inn;
    }
    public void setInn(String inn){
        this.inn = inn;
    }

    public String getKpp(){
        return kpp;
    }
    public void setKpp(String kpp){
        this.kpp = kpp;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public boolean getIsActive(){
        return isActive;
    }
    public void setIsActive (boolean isActive){
        this.isActive = isActive;
    }
}

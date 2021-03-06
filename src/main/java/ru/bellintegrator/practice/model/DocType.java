package ru.bellintegrator.practice.model;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table (name = "doc_type")
public class DocType {
    @Id
    @GeneratedValue
    @Column (name = "id")
    private Long id;

    @Basic(optional = false)
    @Column (name = "name", length = 240)
    private String name;

    @Basic (optional = false)
    @Column (name = "code", length = 2)
    private int code;

    public DocType(){

    }
    public DocType(long id, String name, int code){
        this.id = id;
        this.name = name;
        this.code = code;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("{name:");
        builder.append(getName());
        builder.append(";code:");
        builder.append(getCode());
        builder.append("} ");
        return builder.toString();
    }
    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    /**
     * методов Set не устанавливал, т.к. информация в справочниках носит статичный характер
     */

}

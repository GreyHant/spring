package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "developer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Developer {
    @XmlElement(name = "id")
    private int id;
    @XmlElement(name = "firstName")
    private String firstName;
    @XmlElement(name = "secondName")
    private String secondName;

    public Developer(int id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public Developer() {
    }
}

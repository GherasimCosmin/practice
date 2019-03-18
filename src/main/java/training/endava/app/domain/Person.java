package training.endava.app.domain;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.util.Objects;


//@Entity
//@Table(name = "persons")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "entry_type", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue(value = "person")

public class Person extends YellowPageEntry {
    @NonNull
    private Date birthday;
    @NotBlank
    private String birthplace;
    @NonNull
    private Integer address_id;

    public Person(Integer person_id, @NotBlank String name, Date birthday, @NotBlank String birthplace, Integer address_id) {
        super(person_id, name);
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.address_id = address_id;
    }

    public Person() {
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return super.getPerson_id().equals(super.getPerson_id());
    }

}

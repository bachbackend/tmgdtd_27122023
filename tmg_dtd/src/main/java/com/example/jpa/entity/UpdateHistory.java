package com.example.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UPDATE_HISTORY")
@Getter
@Setter
public class UpdateHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;

    @Column(name = "UPDATE_NAME")
    private String updateName;

    @Column(name = "UPDATE_AGE")
    private int updateAge;

    @Column(name = "UPDATE_PHONE")
    private String updatePhone;

    @Column(name = "UPDATE_EMAIL")
    private String updateEmail;

    @Column(name = "UPDATE_DOB")
    private LocalDate updateDob;

//    @Column(name = "update_id")
//    private long updateId;

    @ManyToOne
    @JoinColumn(name = "PERSON_ID")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "UpdateHistory{" +
                "id=" + id +
                ", updateDate=" + updateDate +
                ", updateName='" + updateName + '\'' +
                ", updateAge=" + updateAge +
                ", updatePhone='" + updatePhone + '\'' +
                ", updateEmail='" + updateEmail + '\'' +
//                ", updateId=" + updateId +
                ", person=" + person +
                '}';
    }
}

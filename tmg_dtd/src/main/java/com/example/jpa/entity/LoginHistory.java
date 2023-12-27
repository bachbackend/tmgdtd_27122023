package com.example.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "LOGIN_HISTORY")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "LOGIN_DATE")
    private LocalDateTime loginDate;

    @Column(name = "LOGIN_NAME")
    private String userNameHis;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;

    @Override
    public String toString() {
        return "LoginHistory{" +
                "id=" + id +
                ", loginDate=" + loginDate +
                ", account=" + account +
                '}';
    }
}

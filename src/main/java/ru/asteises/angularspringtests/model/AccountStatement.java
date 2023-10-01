package ru.asteises.angularspringtests.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account_statement")
public class AccountStatement {

    @Id
    private UUID id;
    private Date date;
    private String type;
    private float incomeFunds;
    private float refund;
    private float credits;
    private float outstandingRefunds;
    private float outstandingCredits;
    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountStatement that = (AccountStatement) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AccountStatement{" +
                "id=" + id +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", incomeFunds=" + incomeFunds +
                ", refund=" + refund +
                ", credits=" + credits +
                ", outstandingRefunds=" + outstandingRefunds +
                ", outstandingCredits=" + outstandingCredits +
                '}';
    }
}

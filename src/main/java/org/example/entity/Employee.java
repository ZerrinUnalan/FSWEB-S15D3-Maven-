package org.example.entity;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastname;

    public Employee(int id, String firstName, String lastname) {
        this.id=id;
        this.firstName=firstName;
        this.lastname=firstName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastname, employee.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastname);
    }
}
}

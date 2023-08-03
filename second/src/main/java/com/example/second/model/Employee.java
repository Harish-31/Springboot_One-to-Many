package com.example.second.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
// import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_details")

public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empId")
    private Long empId;

    @Column(name = "empName")
    private String empName;

    @Column(name = "empAge")
    private Long empAge;

    public Employee() {
    }

    public Employee(Long empId, String empName, Long empAge, List<Address> address) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.address = address;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Long empAge) {
        this.empAge = empAge;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", address=" + address
                + "]";
    }

    //ONE TO ONE
    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "add_id")

    //ONE TO MANY
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "empId", referencedColumnName = "empId")
    private List<Address> address;

}

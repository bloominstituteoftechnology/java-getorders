package com.lambdaschool.orders.orders.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
//    ORDNUM primary key, not null Long
//    ORDAMOUNT double
//    ADVANCEAMOUNT double
//    CUSTCODE Ler tong foreign key (one customer to many orders) not null
//    ORDERDESCRIPTION String

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long ordnum;


    private double ordamount;
    private double advanceamount;

    //    Many orders to one customers
    @ManyToOne
    @JoinColumn( name = "custcode", nullable = false)
    private Customer customer;

    @ManyToMany()
    @JoinTable(name = "orderpayments", joinColumns = @JoinColumn(name = "ordnum"), inverseJoinColumns =     @JoinColumn(name = "paymentid"))
    Set<Payment> payments = new HashSet<>();


    private String oderdescription;

    public Order() {
        //default
    }

    public Order(double ordamount, double advanceamount,Customer customer, String oderdescription) {

        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.oderdescription = oderdescription;
        this.customer = customer;

    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOderdescription() {
        return oderdescription;
    }

    public void setOderdescription(String oderdescription) {
        this.oderdescription = oderdescription;
    }

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

}


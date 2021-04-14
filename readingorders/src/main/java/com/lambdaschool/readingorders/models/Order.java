package com.lambdaschool.readingorders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ordnum;

  private double ordamount;
  private double advanceamount;

  @ManyToMany()
  @JoinTable(name="orderspayments",
      joinColumns = @JoinColumn(name="ordnum"),
      inverseJoinColumns = @JoinColumn(name="paymentid"))
    @JsonIgnoreProperties(value = "orders", allowSetters = true)
   Set<Payment> payments = new HashSet<>();

  private String orderdescription;

  @ManyToOne
  @JoinColumn(name ="custcode", nullable = false)
  @JsonIgnoreProperties(value = "orders", allowSetters = true)
  private Customer customer;

  public Order() {
  }

  public Order(
      double ordamount,
      double advanceamount,
      Customer customers,
      String orderdescription)
  {
    this.ordamount = ordamount;
    this.advanceamount = advanceamount;
    this.orderdescription = orderdescription;
    this.customer = customers;
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

  public Set<Payment> getPayments() {
    return payments;
  }

  public void setPayments(Set<Payment> payments) {
    this.payments = payments;
  }

  public Customer getCustomers() {
    return customer;
  }

  public void setCustomers(Customer customers) {
    this.customer = customers;
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carsusersweb.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author RENT
 */
@Entity
@Table(name = "cars")
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String registration;
    @Column
    private Integer vin;
    @Column (name = "registration_date")
    private Date registrationDate;
    @Column(name = "engine_number")
    private String engineNumner;
    @Column(name = "engine_capacity")
    private Integer engineCapacity;
    @Column
    private Integer power;
    @Column(name = "engine_production")
    private Integer engineProduction;
    @Column(name = "car_production")
    private Integer carProduction;
    @OneToOne
    @JoinColumn(name = "model_id")
    private Model model;
    @OneToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    @ManyToMany(mappedBy = "cars", fetch = FetchType.EAGER)
    private Collection<User> users;
    

    public String getRegistration() {
        return registration;
    }

    public Integer getVin() {
        return vin;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public String getEngineNumner() {
        return engineNumner;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getEngineProduction() {
        return engineProduction;
    }

    public Integer getCarProduction() {
        return carProduction;
    }

    public Model getModel() {
        return model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setVin(Integer vin) {
        this.vin = vin;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setEngineNumner(String engineNumner) {
        this.engineNumner = engineNumner;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setEngineProduction(Integer engineProduction) {
        this.engineProduction = engineProduction;
    }

    public void setCarProduction(Integer carProduction) {
        this.carProduction = carProduction;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Car)) {
            return false;
        }
        Car other = (Car) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.carsusersweb.model.Car[ id=" + id + " ]";
    }
    
}

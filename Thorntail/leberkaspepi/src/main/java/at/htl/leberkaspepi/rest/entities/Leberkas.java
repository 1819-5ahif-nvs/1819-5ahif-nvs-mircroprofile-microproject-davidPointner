package at.htl.leberkaspepi.rest.entities;

import javax.persistence.*;


public class Leberkas {


    private Long id;

    private String name;

    private Double pricePerKg;

    public Leberkas(String name, Double pricePerKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    public Leberkas() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(Double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

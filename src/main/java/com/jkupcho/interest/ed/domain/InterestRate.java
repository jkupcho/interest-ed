package com.jkupcho.interest.ed.domain;

import javax.persistence.*;

@Entity
public class InterestRate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private Float rate;

    @Column
    private Integer duration;

    /***
     * JPA, you never fail to confuse me.
     */
    protected InterestRate () {}

    public InterestRate (Integer duration, Float rate) {
        this.rate = rate;
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}

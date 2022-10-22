package com.shamba.smart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
@Getter
@Setter
@AllArgsConstructor
public class SoilData {
    private int bdod;
    private int ph;
    private int nitrogen;
    private int ocd;
    private int soc;
}

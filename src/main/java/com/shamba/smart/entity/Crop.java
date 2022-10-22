package com.shamba.smart.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Crop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double elevation;
    private int yearly_rainfall;
    private double temp;
    private double ph;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "crop_nutrients",
            joinColumns = {
                    @JoinColumn(name = "crop_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "nutrient_id")
            }
    )
    private List<Nutrient> nutrients_needed;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "crop_nutrients",
            joinColumns = {
                    @JoinColumn(name = "crop_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "nutrient_id")
            }
    )
    private List<Nutrient> nutrients_added;
    private int humidity;

    private int time_to_harvest;
}

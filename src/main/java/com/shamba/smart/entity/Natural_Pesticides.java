package com.shamba.smart.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Natural_Pesticides {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String prevents;
}

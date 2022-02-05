package com.javamultiplex.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Rohit Agarwal on 30/01/22 11:03 PM
 * @copyright www.javamultiplex.com
 */
@Entity
@Getter
@Setter
public class Student implements Serializable {
    private static final long serialVersionUID = 4894112508617377286L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
}

package com.chibana.tasklist.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by Rodrigo Chibana
 * Date: 09/03/2020
 **/
@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String title;

    @NotNull
    @NotBlank
    private String description;

    @ManyToOne
    private Person assignedTo;

    @OneToMany
    private Set<Subtask> subtasks;

}

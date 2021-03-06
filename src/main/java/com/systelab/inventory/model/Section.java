package com.systelab.inventory.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Section extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private boolean active;
    private String externalID;
    private String responsible;
    private String code;
    private String email;

}

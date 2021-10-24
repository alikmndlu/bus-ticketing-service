package com.alikmndlu.busticketing.model;

import com.alikmndlu.busticketing.base.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "terminals_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Terminal extends BaseModel<Long> {

    @ManyToOne
    private City city;

    private String name;

    private String address;
}

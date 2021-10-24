package com.alikmndlu.busticketing.model;

import com.alikmndlu.busticketing.base.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cities_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class City extends BaseModel<Long> {

    private String name;
}

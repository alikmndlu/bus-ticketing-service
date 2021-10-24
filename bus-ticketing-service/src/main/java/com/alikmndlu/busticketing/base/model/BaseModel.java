package com.alikmndlu.busticketing.base.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseModel<ID extends Serializable> implements Serializable {

    @Id
    @GeneratedValue
    private ID id;
}

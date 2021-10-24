package com.alikmndlu.busticketing.model;

import com.alikmndlu.busticketing.base.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "travles_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Travel extends BaseModel<Long> {

    @ManyToOne
    private Terminal source;

    @ManyToOne
    private Terminal target;

    private LocalDateTime movingDateTime;
}

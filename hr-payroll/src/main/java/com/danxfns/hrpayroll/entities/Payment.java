package com.danxfns.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment implements Serializable {
    private String name;
    private Double dailyIncome;
    private Integer days;

    public double getTotal() {
        return days * dailyIncome;
    }
}

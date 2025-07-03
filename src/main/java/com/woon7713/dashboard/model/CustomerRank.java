package com.woon7713.dashboard.model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.util.List;

public class CustomerRank {
    private int customerId;
    private BigDecimal totalSpent;
    private int rank;


    public CustomerRank() {

    }

    public CustomerRank(int customerId, BigDecimal totalSpent, int rank) {
        this.customerId = customerId;
        this.totalSpent = totalSpent;
        this.rank = rank;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(BigDecimal totalSpent) {
        this.totalSpent = totalSpent;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}

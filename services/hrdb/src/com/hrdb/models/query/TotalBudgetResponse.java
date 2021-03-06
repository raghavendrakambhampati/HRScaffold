/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.hrdb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class TotalBudgetResponse implements Serializable {


    @JsonProperty("SUM(budget)")
    @ColumnAlias("SUM(budget)")
    private BigInteger sum_budget_;

    public BigInteger getSum_budget_() {
        return this.sum_budget_;
    }

    public void setSum_budget_(BigInteger sum_budget_) {
        this.sum_budget_ = sum_budget_;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TotalBudgetResponse)) return false;
        final TotalBudgetResponse totalBudgetResponse = (TotalBudgetResponse) o;
        return Objects.equals(getSum_budget_(), totalBudgetResponse.getSum_budget_());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSum_budget_());
    }
}
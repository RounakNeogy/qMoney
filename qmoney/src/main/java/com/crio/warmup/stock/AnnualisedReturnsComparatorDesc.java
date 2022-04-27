package com.crio.warmup.stock;

import java.util.Comparator;

import com.crio.warmup.stock.dto.AnnualizedReturn;

public class AnnualisedReturnsComparatorDesc implements Comparator <AnnualizedReturn>{

    @Override
    public int compare(AnnualizedReturn s1, AnnualizedReturn s2) {
        if(s1.getAnnualizedReturn()==s2.getAnnualizedReturn()){
            return 0;
        }
        else if(s1.getAnnualizedReturn()>s2.getAnnualizedReturn()){
            return -1;
        }
        else{
            return 1;
        }
    }
    
}
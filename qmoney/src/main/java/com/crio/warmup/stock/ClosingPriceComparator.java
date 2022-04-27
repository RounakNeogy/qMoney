package com.crio.warmup.stock;

import com.crio.warmup.stock.dto.TotalReturnsDto;
import java.util.Comparator;

public class ClosingPriceComparator implements Comparator<TotalReturnsDto>{

    @Override
    public int compare(TotalReturnsDto stock1, TotalReturnsDto stock2) {
        if(stock1.getClosingPrice()==stock2.getClosingPrice()){
            return 0;
        }
        else if(stock1.getClosingPrice()>stock2.getClosingPrice()){
            return 1;
        }
        else{
            return -1;
        }
    }

    
    
}
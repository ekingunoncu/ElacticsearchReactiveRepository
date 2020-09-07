package com.stocker.dto;

import com.stocker.model.StockData;
import lombok.*;

@Getter
@Setter
public class StockDataDto {

    private String name;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Long volumes;
    private Long date;

    public StockData toEntity(){
        return StockData.builder().name(name).date(date).close(close).high(high).low(low).open(open).volumes(volumes).build();
    }
}

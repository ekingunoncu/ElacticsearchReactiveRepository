package com.stocker.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "stock")
@Builder
@Setter
@Getter
public class StockData {

    @Id
    private String id;
    private String name;
    @Field(type = FieldType.Double)
    private Double open;
    @Field(type = FieldType.Double)
    private Double high;
    @Field(type = FieldType.Double)
    private Double low;
    @Field(type = FieldType.Double)
    private Double close;
    @Field(type = FieldType.Long)
    private Long volumes;
    private Long date;

    @Override
    public String toString() {
        return "StockData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
                ", volumes=" + volumes +
                ", date=" + date +
                '}';
    }
}

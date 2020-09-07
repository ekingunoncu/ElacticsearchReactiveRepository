package com.stocker.repository;

import com.stocker.model.StockData;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface StockDataTraditionalRepository extends ElasticsearchRepository<StockData, String> {

}

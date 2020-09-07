package com.stocker.repository;

import com.stocker.model.StockData;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDataRepository extends ReactiveElasticsearchRepository<StockData, String> {
}

package com.stocker.dao;

import com.stocker.model.StockData;
import com.stocker.repository.StockDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class StockDataDao {

    private final StockDataRepository stockDataRepository;

    public Flux<StockData> findAll() {
        return stockDataRepository.findAll();
    }

    public Mono<StockData> save(StockData stockData){
        return stockDataRepository.save(stockData);
    }

    public Mono<Void> deleteById(String id){
        return stockDataRepository.deleteById(id);
    }
}

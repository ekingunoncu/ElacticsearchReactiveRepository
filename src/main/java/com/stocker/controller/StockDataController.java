package com.stocker.controller;

import com.stocker.dao.StockDataDao;
import com.stocker.dto.StockDataDto;
import com.stocker.model.StockData;
import com.stocker.repository.StockDataTraditionalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.Date;

@RestController
@RequiredArgsConstructor
public class StockDataController {

    private final StockDataDao stockDataDao;
    private final StockDataTraditionalRepository stockDataTraditionalRepository;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<StockData> getAllStockData(){
        return stockDataDao.findAll();
    }

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<StockData> getAllStockDataTraditional(){
        return stockDataTraditionalRepository.findAll();
    }

    @PostMapping(value = "/")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<StockData> create(@RequestBody StockDataDto stockDataDto){
        stockDataDto.setDate(new Date().getTime());
        return stockDataDao.save(stockDataDto.toEntity());
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable String id){
        stockDataDao.deleteById(id).subscribe();
    }
}

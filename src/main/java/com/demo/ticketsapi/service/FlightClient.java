package com.demo.ticketsapi.service;

import com.demo.ticketsapi.model.FlightDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "flight-server")
public interface FlightClient {
    @GetMapping("/flights")
    List<FlightDto> getAllFlights();
}

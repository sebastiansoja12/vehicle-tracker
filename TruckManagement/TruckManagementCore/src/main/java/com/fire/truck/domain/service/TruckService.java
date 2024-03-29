package com.fire.truck.domain.service;

import com.fire.truck.domain.model.Truck;
import com.fire.truck.domain.model.TruckRequest;

public interface TruckService {
    void addTruck(TruckRequest truck);

    Truck getTruck(String plate);
}

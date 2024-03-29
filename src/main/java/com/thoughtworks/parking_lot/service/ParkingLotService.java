package com.thoughtworks.parking_lot.service;

import com.thoughtworks.parking_lot.repo.ParkingLotRepository;
import com.thoughtworks.parking_lot.parkingInfo.ParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingLotService {

    @Autowired
    private ParkingLotRepository parkingLotRepository;

    public ParkingLot save(ParkingLot parkingLot) {
        return parkingLotRepository.save(parkingLot);
    }

    public void delete(ParkingLot parkingLot) {
        parkingLotRepository.delete(parkingLot);
    }

    public List<ParkingLot> list(int page) {
        return parkingLotRepository.findAll();
    }

    public ParkingLot findByName(String name) {
        List<ParkingLot> findResult = parkingLotRepository.findAllByName(name);
        return findResult == null ? null : findResult.get(0);
    }

    public ParkingLot update(ParkingLot parkingLot) {
        return parkingLotRepository.save(parkingLot);
    }
}

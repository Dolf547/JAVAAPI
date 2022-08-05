package teste.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teste.demo.models.ParkingSpotModel;
import teste.demo.services.parkingSpotServices;
import teste.demo.dtos.parkingSpotDto;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin (origins= "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class parkingSpotController {
    final parkingSpotServices parkingSpotServices;

    public parkingSpotController(teste.demo.services.parkingSpotServices parkingSpotServices) {
        this.parkingSpotServices = parkingSpotServices;
    }

//metodo post
    @PostMapping
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid parkingSpotDto parkingSpotDto){
        ParkingSpotModel ParkingSpotModel = new ParkingSpotModel();
        BeanUtils.copyProperties(parkingSpotDto, ParkingSpotModel);
        ParkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotServices.save(ParkingSpotModel));


    }





}

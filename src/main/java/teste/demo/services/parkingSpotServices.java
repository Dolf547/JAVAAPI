package teste.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.demo.models.ParkingSpotModel;
import teste.demo.repositeries.parkSpotRepositorie;

import javax.transaction.Transactional;

@Service
public class parkingSpotServices {
    final
    parkSpotRepositorie parkSpotRepositorie;

    public parkingSpotServices(parkSpotRepositorie parkSpotRepositorie) {
        this.parkSpotRepositorie = parkSpotRepositorie;
    }

    @Transactional
    public Object save(ParkingSpotModel parkingSpotModel) {
        return parkSpotRepositorie.save(parkingSpotModel);
    }


}

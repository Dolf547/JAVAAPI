package teste.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.demo.models.ParkingSpotModel;
import teste.demo.repositeries.parkingSpotRepository;

import javax.transaction.Transactional;

@Service
public class parkingSpotServices {
    final
    parkingSpotRepository parkingSpotRepository;

    public parkingSpotServices(parkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }


}

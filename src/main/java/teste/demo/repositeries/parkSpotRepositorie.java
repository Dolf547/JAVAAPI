package teste.demo.repositeries;
import org.springframework.stereotype.Repository;
import teste.demo.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

//passando model, identificador.
@Repository
public interface parkSpotRepositorie extends JpaRepository<ParkingSpotModel, UUID> {




}

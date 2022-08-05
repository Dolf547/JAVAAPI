package teste.demo.models;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;
import java.time.LocalDateTime;



@Entity
@Table(name = "java_estacionamento")
public class ParkingSpotModel implements Serializable {
     private static final long serialVersionUID = 1;
     @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
     private UUID id;
     @Column(nullable = false, unique = true, length = 10)
     private String parkingSpotNumber;
     @Column(nullable = false, unique = true, length = 7)
     private String LicensePlatecar;
    @Column(nullable = false, length = 70)
    private String brandCar;
    @Column(nullable = false, length = 70)
    private String modelCar;
    @Column(nullable = false, length = 70)
    private String ColorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String ResponsibleName;
    @Column(nullable = false, length = 30)
    private String Apartment;
    @Column(nullable = false, length = 30)
    private String Block;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlatecar() {
        return LicensePlatecar;
    }

    public void setLicensePlatecar(String licensePlatecar) {
        LicensePlatecar = licensePlatecar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return ColorCar;
    }

    public void setColorCar(String colorCar) {
        ColorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void  setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;

    }

    public String getResponsibleName() {
        return ResponsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        ResponsibleName = responsibleName;
    }

    public String getApartment() {
        return Apartment;
    }

    public void setApartment(String apartment) {
        Apartment = apartment;
    }

    public String getBlock() {
        return Block;
    }

    public void setBlock(String block) {
        Block = block;
    }
}

package teste.demo.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class parkingSpotDto {
        @NotBlank
        private String parkingSpotNumber;
        @NotBlank
        @Size(max = 7)
        private String LicensePlatecar;
        @NotBlank
        private String brandCar;
        @NotBlank
        private String modelCar;
        @NotBlank
        private String ColorCar;
        @NotBlank
        private String ResponsibleName;
        @NotBlank
        private String Apartment;
        @NotBlank
        private String Block;



}

package factory;

import builder.AutoBuilder;
import prototype.Auto;

public class FabricaSedan extends FabricaAuto {
    @Override
    public Auto crearAuto() {
        return new AutoBuilder("Toyota", "Sedán")
                .color("Gris")
                .motor("1.6L")
                .puertas(4)
                .build();
    }
}
package factory;

import builder.AutoBuilder;
import prototype.Auto;

public class FabricaDeportivo extends FabricaAuto {
    @Override
    public Auto crearAuto() {
        return new AutoBuilder("Ferrari", "Deportivo")
                .color("Rojo")
                .motor("V8")
                .puertas(2)
                .build();
    }
}

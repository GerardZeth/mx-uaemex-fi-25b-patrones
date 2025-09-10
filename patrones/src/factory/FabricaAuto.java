package factory;

import builder.AutoBuilder;
import prototype.Auto;

public abstract class FabricaAuto {
    public abstract Auto crearAuto();

    public static class FabricaSUV extends FabricaAuto {
        @Override
        public Auto crearAuto() {
            return new AutoBuilder("Honda", "SUV")
                    .color("Negro")
                    .motor("2.0L Turbo")
                    .puertas(5)
                    .build();
        }
    }
}
package builder;
import prototype.Auto;

public class AutoBuilder {
    private Auto auto;

    public AutoBuilder(String marca, String modelo) {
        auto = new Auto(marca, modelo);
    }

    public AutoBuilder color(String color) {
        auto.setColor(color);
        return this;
    }

    public AutoBuilder motor(String motor) {
        auto.setMotor(motor);
        return this;
    }

    public AutoBuilder puertas(int puertas) {
        auto.setPuertas(puertas);
        return this;
    }

    public Auto build() {
        return auto;
    }
}
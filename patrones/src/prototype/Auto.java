package prototype;

public class Auto implements PrototipoAuto {
    private String marca;
    private String modelo;
    private String color;
    private String motor;
    private int puertas;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters y setters
    public void setColor(String color) { this.color = color; }
    public void setMotor(String motor) { this.motor = motor; }
    public void setPuertas(int puertas) { this.puertas = puertas; }

    @Override
    public PrototipoAuto clonar() {
        try {
            return (PrototipoAuto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar auto", e);
        }
    }

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo +
                ", color=" + color + ", motor=" + motor +
                ", puertas=" + puertas + "]";
    }
}
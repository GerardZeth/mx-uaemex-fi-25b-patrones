import builder.AutoBuilder;
import factory.*;
import prototype.Auto;

public class Main {
    public static void main(String[] args) {
        // Usando la FABRICA para crear autos base
        FabricaAuto fabricaSedan = new FabricaSedan();
        FabricaAuto fabricaSUV = new FabricaAuto.FabricaSUV();
        FabricaAuto fabricaDeportivo = new FabricaDeportivo();

        Auto sedan = fabricaSedan.crearAuto();
        Auto suv = fabricaSUV.crearAuto();
        Auto deportivo = fabricaDeportivo.crearAuto();

        System.out.println("Autos fabricados:");
        System.out.println(sedan);
        System.out.println(suv);
        System.out.println(deportivo);

        // Usando el prototype para clonar un auto existente
        Auto sedanClonado = (Auto) sedan.clonar();
        sedanClonado.setColor("Blanco"); // Modificación al clon

        System.out.println("\nClonación con Prototype:");
        System.out.println("Original: " + sedan);
        System.out.println("Clonado: " + sedanClonado);

        // Usando el bulder directamente para personalizar un auto
        Auto autoPersonalizado = new AutoBuilder("Nissan", "Versa")
                .color("Azul")
                .motor("1.8L")
                .puertas(4)
                .build();

        System.out.println("\nAuto personalizado con Builder:");
        System.out.println(autoPersonalizado);
    }
}
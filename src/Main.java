import java.util.List;
public class Main {
    public static void main(String[] args) {

        BicicletaElectrica e1 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
        BicicletaElectrica e2 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45, true);
        BicicletaMontana m1 = new BicicletaMontana("BIC-M01", 2021, 13.5, 2);
        BicicletaMontana m2 = new BicicletaMontana("BIC-M02", 2020, 12.0, 1);


            e1.activarGarantia();
            GestorTallerBicicletas gestor = new GestorTallerBicicletas();
            gestor.registrarBicicleta(e1);
            gestor.registrarBicicleta(e2);
            gestor.registrarBicicleta(m1);
            gestor.registrarBicicleta(m2);
            System.out.println("Busqueda de BIC-E01:");
            List<Bicicleta> resultado = gestor.buscarPorCodigo("BIC-E01");
            for (Bicicleta b : resultado) {
                System.out.println(b);
            }
            System.out.println("===LISTADO DE BICICLETAS===:");
            gestor.listarBicicletas();

    }
}



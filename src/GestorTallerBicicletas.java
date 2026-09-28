import java.util.ArrayList;

public class GestorTallerBicicletas {
    private ArrayList<Bicicleta> listaBicicletas;


    public GestorTallerBicicletas() {
        this.listaBicicletas = new ArrayList<>();
    }

    public void registrarBicicleta(Bicicleta bicicleta) {
        listaBicicletas.add(bicicleta);
        System.out.println("Bicicleta " + bicicleta.getCodigoBicicleta()
                + " Registrado correctamente.");
    }

    public ArrayList<Bicicleta> buscarPorCodigo(String criterio) {
        ArrayList<Bicicleta> encontradas = new ArrayList<>();
        for (Bicicleta b : listaBicicletas) {
            if (b.getCodigoBicicleta().equalsIgnoreCase(criterio)) {
                encontradas.add(b);
            }
        }
        return encontradas;
    }

    public void listarBicicletas() {
        for (Bicicleta b : listaBicicletas) {
            System.out.println(b);
        }
    }
}
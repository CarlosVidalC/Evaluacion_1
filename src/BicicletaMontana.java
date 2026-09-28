public class BicicletaMontana extends Bicicleta {
    private int cantidadSuspensiones;

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    public BicicletaMontana(String codigoBicicleta, int anoFabricacion, double peso, int cantidadSuspensiones) {
        super(codigoBicicleta, anoFabricacion, peso);
        setCantidadSuspensiones(cantidadSuspensiones);

    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 30000;
        if (cantidadSuspensiones > 1) {
            costo = costo + costo * 0.15;

        }
        return costo;
    }
}
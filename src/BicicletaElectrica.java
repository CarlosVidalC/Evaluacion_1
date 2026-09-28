public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {
    private double autonomia;
    private boolean bateriaCertificada;
    private boolean garantiaExtendida;

    public BicicletaElectrica(String codigoBicicleta, int anoFabricacion, double peso, double autonomia, boolean bateriaCertificada) {
        super(codigoBicicleta, anoFabricacion, peso);
        setAutonomia(autonomia);
        setBateriaCertificada(bateriaCertificada);
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    @Override
    public boolean tieneGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void activarGarantia(){
            this.garantiaExtendida = true;
    }
    @Override
    public double calcularCostoMantencion(){
        double costo = 45000;
        if (!bateriaCertificada){
            costo = costo + costo * 0.25;

    }
        return costo;
    }
}

public abstract class Bicicleta {
    private String codigoBicicleta;
    private int anoFabricacion;
    private double peso;

    public Bicicleta(String codigoBicicleta, int anoFabricacion, double peso) {
        setCodigoBicicleta(codigoBicicleta);
        setAnoFabricacion(anoFabricacion);
        setPeso(peso);
    }

    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(String codigoBicicleta) {
        if (codigoBicicleta == null || codigoBicicleta.isEmpty()) {
            throw new IllegalArgumentException("No puede ser nulo ni vacio");
        }
        this.codigoBicicleta = codigoBicicleta;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        if (anoFabricacion < 2000 || anoFabricacion > 2026) {
            throw new IllegalArgumentException("Debe encontrarse en el rango entre 2000 y 2026");

        }
        this.anoFabricacion = anoFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Debe ser un valor mayor a cero");
        }
        this.peso = peso;
    }

    public abstract double calcularCostoMantencion();

    @Override
    public String toString() {
        return "Bicicleta{" +
                "codigoBicicleta='" + codigoBicicleta + '\'' +
                ", anoFabricacion=" + anoFabricacion +
                '}';
    }
}

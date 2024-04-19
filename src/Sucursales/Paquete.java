package Sucursales;

public class Paquete  {
    protected int peso, prioridad, cuesta;
    protected String nreferencia;
    public Paquete(int peso, int prioridad, String nreferencia){
        this.peso=peso;
        this.prioridad=prioridad;
        this.nreferencia= nreferencia;
        cuesta=peso;
    }

    public void ModificaPeso(int peso){
        this.peso=peso;
    }
    public void CambiarPrioridad(int prioridad){
        this.prioridad=prioridad;
    }

    public int getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getNreferencia() {
        return nreferencia;
    }
    public String getInfoPaquete(){
        return "El paquete con n "+nreferencia+", con prioridad "+prioridad+", con el peso "+ peso+"\n"
                +"cuesta "+cuesta;
    }
}

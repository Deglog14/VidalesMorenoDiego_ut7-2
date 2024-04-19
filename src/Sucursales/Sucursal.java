package Sucursales;

public class Sucursal {
    protected int n_sucursal;
    protected String direccion;
    protected String ciudad;
    protected String tipo;
    protected  Paquete paquete;
    protected  String estaesunavariablenueva;

    public Sucursal(int n_sucusal, String direccion, String ciudad){
        this.ciudad=ciudad;
        this.n_sucursal=n_sucusal;
        this.direccion=direccion;
        estaesunavariablenueva="Aqui añadimos nuevos cambios";
    }
    public void calcular(Paquete paquete){
        this.paquete= paquete;
        //sabiendo que se cobra 1 euro por kilo,
        if (paquete.prioridad==1){
            //10 euros  más si la prioridad es alta (1)
            paquete.cuesta+=10;

        } else if (paquete.prioridad==2) {
            //20 si es Express(2)
            paquete.cuesta+=20;
        }
    }

    public int getN_sucursal() {
        return n_sucursal;
    }

    public void setN_sucursal(int n_sucursal) {
        this.n_sucursal = n_sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getInfoSucursal(){
        return "La sucursal con el numero: "+n_sucursal+", está en la calle "+direccion+", en la ciudad "+ ciudad+"\n"
                +"es de tipo "+tipo;
    }
}

package Sucursales;

public class SucursalS extends Sucursal {
    public SucursalS(int nsucursal, String direccion, String ciudad){
        super(nsucursal,direccion,ciudad);
        tipo="Secundaria";

    }
    public void calcular(Paquete paquete){
        paquete.cuesta+= paquete.peso*0.1;
        //sabiendo que se cobra 1 euro por kilo,
        if (paquete.prioridad==1){
            //10 euros  más si la prioridad es alta (1)
            paquete.cuesta+=10;

        } else if (paquete.prioridad==2) {
            //20 si es Express(2)
            paquete.cuesta+=20;
        }


    }
}

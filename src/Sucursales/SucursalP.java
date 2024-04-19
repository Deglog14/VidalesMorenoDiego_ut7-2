package Sucursales;

public class SucursalP extends Sucursal {

    protected SucursalS sucursal1,sucursal2;
    public SucursalP(int nsucursal, String direccion, String ciudad,SucursalS sucursal1, SucursalS sucursal2){
        super(nsucursal,direccion,ciudad);
        tipo="Primaria";
        this.sucursal1=sucursal1;
        this.sucursal2=sucursal2;
    }
    @Override
    public String getInfoSucursal(){
        return "La sucursal con el numero: "+n_sucursal+", está en la calle "+direccion+", en la ciudad "+ ciudad+"\n"
                +"es de tipo "+tipo+" tiene estas sucursales secundarias "+sucursal1.getInfoSucursal()+"--"+sucursal2.getInfoSucursal();
    }


}

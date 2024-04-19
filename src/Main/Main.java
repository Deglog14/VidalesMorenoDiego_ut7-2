package Main;

import Sucursales.Paquete;
import Sucursales.Sucursal;
import Sucursales.SucursalP;
import Sucursales.SucursalS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SucursalS sucursalSecundaria1= new SucursalS(1,"asdsa","t");
        SucursalS sucursalSecundaria2 =new SucursalS(2,"ada","t");
        Sucursal [] sucursals = new Sucursal[2];
        sucursals [0]=sucursalSecundaria1;
        sucursals [1]=sucursalSecundaria2;
        SucursalP sucursalPrimaria= new SucursalP(1,"juan","Toledo",sucursalSecundaria1,sucursalSecundaria2);
        Paquete paquete = new Paquete(10,2,"wadwada");
        System.out.println("Donde quieres enviar el paquete desde una sucursal primaria (P) o Secundaria (S) ");
        String decision= scanner.nextLine();
        if(decision.equalsIgnoreCase("P")){
            sucursalPrimaria.calcular(paquete);
            System.out.println(sucursalPrimaria.getInfoSucursal()+ "\n el paquete: "+paquete.getInfoPaquete());
        }
        if (decision.equalsIgnoreCase("S")) {
            System.out.println(sucursals[0].getInfoSucursal()+"\n"+sucursals[1].getInfoSucursal());
            System.out.println("dime que sucursal quieres ver");
            int decision1=scanner.nextInt();
            if (decision1==1){
                sucursalSecundaria1.calcular(paquete);
                System.out.println(sucursals[0].getInfoSucursal()+"\n"+paquete.getInfoPaquete());
            } else if (decision1==2) {
                sucursalSecundaria2.calcular(paquete);
                System.out.println(sucursals[1].getInfoSucursal()+"\n"+paquete.getInfoPaquete());
            }
        }
    }
}
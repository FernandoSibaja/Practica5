package Practica5;
import java.util.Random;
import java.util.Scanner;
public class Banco extends Cuenta {
    
        Cuenta cuenta = new Cuenta();
        int nip;
        String nombre,direccion;
        float saldo;
        Scanner scan = new Scanner(System.in);
        
        public Cuenta registrar(){
            System.out.printf("\nIntroducir nombre: ");
                     nombre = scan.next();
                    scan.nextLine();

                    System.out.printf("\nIntroducir direccion: ");
                    direccion = scan.next();
                    scan.nextLine();

                    System.out.printf("\nIntroducir saldo: ");
                    saldo = scan.nextFloat();

                    System.out.printf("\nIntroducir nip (ej: 2342): ");
                    nip = scan.nextInt();
            
            this.cuenta.setnombrecliente(nombre);
            this.cuenta.setdireccion(direccion);
            this.cuenta.setSaldo(saldo);
            this.cuenta.setNip(nip);
    
            Random r = new Random( System.currentTimeMillis());
            this.cuenta.setnumerocuenta(10000 + r.nextInt(20000));
            return this.cuenta;
        }
        public float saldo(int nip, int numerocuenta){
            if((cuenta.getNip() == nip) &&
                    (cuenta.getnumerocuenta() == numerocuenta)){
                return cuenta.getSaldo();
            }else{
                return 0;
            }
        }
}

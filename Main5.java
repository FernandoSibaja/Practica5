package Practica5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int numcuenta;
        
        int opc,c=0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

        boolean salir = false;
        while(!salir){
            System.out.println("\nBANCO\n");
			System.out.println("\n1. Crear cuenta.");
			System.out.println("\n2. Acceder a cuenta.");
			System.out.println("\n3. Salir.");
            System.out.println("Escoja una opcion: ");

            opc= scan.nextInt();

            if(opc==1){
                Banco banco = new Banco();
                    cuentas.add(banco.registrar());

                    System.out.printf("Numero de cuenta: %d", cuentas.get(c).getnumerocuenta());
                    c++;
            }
            if(opc==2){
                boolean cuentaExiste = false;
                int cuentaNIP = 0;
                int cuentaIndice = 0;
                int usuarioNIP = 0;

                System.out.println("Introducir numero de cuenta: ");
                numcuenta = scan.nextInt();
                for(int i=0; i<cuentas.size(); i++){

                    if(((cuentas.get(i).getnumerocuenta() == numcuenta))){
                        cuentaExiste = true;
                        cuentaIndice = i;
                        cuentaNIP = cuentas.get(i).getNip();

                        if(cuentaExiste){
 
                            System.out.println("Introducir nip: ");
                            usuarioNIP = scan.nextInt();
 
                            if(cuentaNIP == usuarioNIP){

                                boolean exitOpcionesDeCuenta = false;
                                float deposito = 0, nuevoSaldo = 0, retiro = 0;

                               
                                while(!exitOpcionesDeCuenta){
                                    System.out.printf("\nOPCIONES DE CUENTA");
                                    System.out.printf("\n1) Consulta saldo");
                                    System.out.printf("\n2) Hacer deposito");
                                    System.out.printf("\n3) Hacer retiro");
                                    System.out.printf("\n4) salir");
                                    System.out.printf("\nescoja una opcion: ");
                                    int opcionDeCuenta = scan.nextInt();
                                    switch(opcionDeCuenta){
                                        case 1:
                                          
                                            System.out.printf("\nSaldo: %.2f", cuentas.get(cuentaIndice).getSaldo());
                                            break;
                                        case 2:
                                            
                                            System.out.println("\nCuanto vas a depositar: ");
                                            deposito = scan.nextFloat();
                                            nuevoSaldo = cuentas.get(cuentaIndice).getSaldo() + deposito;
                                            cuentas.get(cuentaIndice).setSaldo(nuevoSaldo);
                                            break;
                                        case 3:
                                            
                                            System.out.println("\nCuanto quieres retirar?: ");
                                            retiro = scan.nextFloat();

                                            
                                            if(retiro <= cuentas.get(cuentaIndice).getSaldo()){
                                                nuevoSaldo = cuentas.get(cuentaIndice).getSaldo() - retiro;
                                                cuentas.get(cuentaIndice).setSaldo(nuevoSaldo);
                                            }else{
                                                System.out.println("Cuenta con un saldo de cero, no puede realizar un retiro\n");
                                            }
                                            break;
                                        case 4:
                                            exitOpcionesDeCuenta = true;
                                            break;
                                        default:
                                            System.out.println("\nNo es valido");
                                            break;
                                    }
                                }
                            }
                        }
                    }

                }
                
                if(!cuentaExiste){
                    System.out.println("La cuenta no existe, ingrese de nuevo los datos");
                }
            }
            if(opc==3){
                salir=true;
            }
        }
        scan.close();
    }
}

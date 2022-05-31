package Practica5;

public class Cuenta {
    private int nip;
    private int numerocuenta;
    private float saldo;
    private String nombrecliente;
    private String direccion;
    public int getNip(){
        return this.nip;
    }
    public void setNip(int nip){
        this.nip = nip;
    }

    public int getnumerocuenta(){
        return this.numerocuenta;
    }
    public void setnumerocuenta(int numerocuenta){
        this.numerocuenta = numerocuenta;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public String getnombrecliente(){
        return this.nombrecliente;
    }
    public void setnombrecliente(String nombrecliente){
        this.nombrecliente = nombrecliente;
    }

    public String getdireccion(){
        return this.direccion;
    }
    public void setdireccion(String direccion){
        this.direccion = direccion;
    }
}

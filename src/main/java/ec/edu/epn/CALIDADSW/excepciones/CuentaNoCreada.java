package ec.edu.epn.CALIDADSW.excepciones;

public class CuentaNoCreada extends Exception{

    public CuentaNoCreada(String message) {
        super(message);
    }

    public CuentaNoCreada(){
        super("EROR! Cuenta no creada");
    }

}
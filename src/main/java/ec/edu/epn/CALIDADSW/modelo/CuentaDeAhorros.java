package ec.edu.epn.CALIDADSW.modelo;

import ec.edu.epn.CALIDADSW.excepciones.CuentaNoCreada;


public class CuentaDeAhorros extends Cuenta {
    //monto corresponde a la cantidad de dinero que tienes en la cuenta
    private double monto;
    private String categoria;
    public static final String NORMAL = "NORMAL";
    private static final String VIP = "VIP";

    public CuentaDeAhorros(double monto) throws CuentaNoCreada {
        super(monto);
        if (monto >= 180) {
            this.monto = monto;
			if (this.monto > 2500) {
				this.categoria = "NORMAL";
			} else {
				this.categoria = "VIP";
			}
			System.out.println("Cuenta creada con éxito");
        } else {
            throw new CuentaNoCreada("La cuenta no se puede crear con menos de $180");
        }
    }

    //monto corresponde a la cantidad de dinero que tienes en la cuenta
    public double getMonto() {
        return monto;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void depositar(double cantidad) throws CuentaNoCreada {
        if (cantidad >= 0 && cantidad!=0) {
			double dineroActual = this.monto;
			dineroActual += cantidad;
            this.monto += dineroActual;
            //TODO identificar la categoria

        }
        else throw new CuentaNoCreada("La cantidad debe ser mayor a cero");
    }

    public void retirar(double c, int a) {
        if (this.monto >= c && this.antiguedad > 4 && a>4) {
            this.monto -= c;
        }
        else {
			System.out.println("Cuenta no creada");
        }
        if (this.monto > 2500) {
            this.categoria = "NORMAL";
        } else {
            this.categoria = "VIP";
        }
    }

   
    public void masAntiguedad(int a) {
		// boolean incremento = false
        antiguedad--;
    }

    public String imprimirInformacion(){
        boolean presentar=true;
        if (presentar)
            return this.antiguedad+"meses $"+this.monto;

        return "";
    }

}
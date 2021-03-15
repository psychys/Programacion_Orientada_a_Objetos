package Relacion2.prCalculos;

public class NumeroRacional {

	private int numerador;
	private int denominador;
	
	public NumeroRacional() {
		this.numerador = 0;
		this.denominador = 1;
	}
	
	public NumeroRacional(int numerador, int denominador) {
		if(denominador != 0) {
			this.numerador = numerador;
			this.denominador = denominador;
			this.normalizar();
		}else {
			throw new RuntimeException();
		}
	}
	
	public int getNumerador() {
		return this.numerador;
	}
	
	public int getDenominador() {
		return this.denominador;
	}
	
	public NumeroRacional suma(NumeroRacional numero) {
		int mcm = mcm(this.denominador, numero.denominador);
		NumeroRacional resultado = new NumeroRacional();
		int multiplo, multiplo1, multiplo2;
		if(mcm == this.denominador) {
			multiplo = mcm / numero.denominador;
			resultado.denominador = mcm;
			resultado.numerador = this.numerador + (numero.numerador * multiplo);
			
		}else if(mcm == numero.denominador) {
			multiplo = mcm / this.denominador;
			resultado.denominador = mcm;
			resultado.numerador = numero.numerador + (this.numerador * multiplo);
		}else {
			resultado.denominador = this.denominador * numero.denominador;
			multiplo1 = resultado.denominador / this.denominador;
			multiplo2 = resultado.denominador / numero.denominador;
			
			resultado.numerador = (this.numerador * multiplo1) + (numero.numerador * multiplo2);
		}
		
		return resultado;
	}
	
	public NumeroRacional resta(NumeroRacional numero) {
		int mcm = mcm(this.denominador, numero.denominador);
		NumeroRacional resultado = new NumeroRacional();
		int multiplo, multiplo1, multiplo2;
		if(mcm == this.denominador) {
			multiplo = mcm / numero.denominador;
			resultado.denominador = mcm;
			resultado.numerador = this.numerador - (numero.numerador * multiplo);
			
		}else if(mcm == numero.denominador) {
			multiplo = mcm / this.denominador;
			resultado.denominador = mcm;
			resultado.numerador =  (this.numerador * multiplo) - numero.numerador ;
		}else {
			resultado.denominador = this.denominador * numero.denominador;
			multiplo1 = resultado.denominador / this.denominador;
			multiplo2 = resultado.denominador / numero.denominador;
			
			resultado.numerador = (this.numerador * multiplo1) - (numero.numerador * multiplo2);
		}
		
		return resultado;
	}
	
	public NumeroRacional mult(NumeroRacional numero) {
		NumeroRacional racional = new NumeroRacional(this.numerador * numero.getNumerador(), this.denominador * numero.getDenominador());
		this.normalizar();
		return racional;
	}
	
	public NumeroRacional div(NumeroRacional numero) {
		NumeroRacional racional = new NumeroRacional(this.numerador * numero.getDenominador(), this.denominador * numero.getNumerador());
		this.normalizar();
		return racional;
	}
	
	public String toString() {
		String resultado;
		if(this.denominador == 1) {
			resultado = String.valueOf(this.numerador);
		}else if(this.numerador == 0) {
			resultado = String.valueOf(0);
		}else {
			resultado = String.valueOf(this.numerador) + "/" + String.valueOf(this.denominador);
		}
		return resultado;
	}
	
	
	/**
	 * Este metodo privado lo que va a hacer es reducir los dos elementos numerador y denominador mediante
	 * el minimo comun multiplo
	 */
	private void normalizar() {
		
		int mcm=1;
        int i=2;
        int num1 = this.numerador, num2 = this.denominador;
        while(i <= num1 || i <= num2) {
            if(num1 % i == 0 && num2 % i == 0) {
            mcm=mcm*i;
            if(num1 % i == 0) num1 = num1 / i;
            if(num2 % i == 0) num2 = num2 / i;
            }else
                i++;               
        }
        
        this.numerador = this.numerador / mcm;
        this.denominador = this.denominador / mcm;
       
		
		if((this.denominador < 0) && (this.numerador > 0)){
			this.denominador = -this.denominador;
			this.numerador = -this.numerador;
		}
	}
	
	private int mcm(int n1, int n2) {
		int mcm=1;
        int i=2;
        int num1 = n1, num2 = n2;
        while(i <= num1 || i <= num2) {
            if(num1 % i == 0 || num2 % i == 0) {
            mcm=mcm*i;
            if(num1 % i == 0) num1 = num1 / i;
            if(num2 % i == 0) num2 = num2 / i;
            }else
                i++;               
        }
        return mcm;
	}
	
}

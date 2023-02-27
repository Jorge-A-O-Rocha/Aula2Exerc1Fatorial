package controller;

public class modulos {
	
	public modulos() {
		super();
	}
	
	public int ffat(int n){
        int f;
        //condição de parada será quando n chegar a 0 e assim parar de subtrair o próximo número
        if(n != 0){
        	// n * n-1 * n-2 * n-3 ... n=1, vai sempre multiplicar o número n - 1  e multiplicar 
            f=n*ffat(n-1);
            return f;
        }else{
            return 1;
        }
    }
	

}

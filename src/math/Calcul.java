package math;

public class Calcul {
	
	public double addition(double a, double b){
		return a+b;
	}
	
	public double soustraction(double a, double b){
		return a-b;
	}
	
	public double multiplication(double a, double b){
		return a*b;
	}
	
	public double division(double a, double b){
		if(b==0){
			return 0;
			
		}else{
			
			return a/b;
		}
	}
	
	public double racine(double a){
		//return 0;
		
		if(a>0){
			double xResult=1;
			double xTemp=1;
			
			for(int i=0; i < a+1; i++){
				xResult = 0.5*(xTemp+(a/xTemp));
				xTemp = xResult;
			}
			
			return xResult;
			
		} else if(a<0){
			
			return Double.NaN;
			
		} else{
			
			return 0;
		}
	}
	
}

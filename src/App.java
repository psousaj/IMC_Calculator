import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
	
	public static void situation(double imc) {
		String magreza = "\nMagreza meu bom."+"\n\nSeu IMC é: "+App.formatImc(imc);
		String normal = "\nNormal meu bom. \nParabéns seu saudável"+"\n\nSeu IMC é: "+App.formatImc(imc);
		String sobrepeso = "\nSobrepeso I meu bom."+"\n\nSeu IMC é: "+App.formatImc(imc);
		String obesidade = "\nObesidade II meu bom. \nCuidado!!"+"\n\nSeu IMC é: "+App.formatImc(imc);
		String obesidadeGrave = "\nObesidade grave III meu bom. Se liga mermão(ã)!!!"+"\n\nSeu IMC é: "+App.formatImc(imc);;
		
		if (imc < 18.5) {
			MyIO.write(magreza);
		} else if (imc < 24.9) {
			MyIO.write(normal);
		} else if (imc < 29.9) {
			MyIO.write(sobrepeso);		
		} else if (imc < 39.9) {
			MyIO.write(obesidade);
		} else {
			MyIO.write(obesidadeGrave);
		}
		
	}
	

	public static double formatImc(double imc) {
		BigDecimal form = new BigDecimal(imc).setScale(2, RoundingMode.FLOOR);	
		String f = form.toString();
		double  imcF = Double.parseDouble(f);
		return imcF;  
	}
	
	public static void main(String[] args) {
		
		double altura = MyIO.readDouble("Informe sua altura");
		double peso = MyIO.readDouble("Informe seu peso");
		double imc = peso / Math.pow(altura, 2);
				
		situation(imc);
		
	}	
	
}

//IMC	CLASSIFICAÇÃO	OBESIDADE (GRAU)
//MENOR QUE 18,5	MAGREZA	0
//ENTRE 18,5 E 24,9	NORMAL	0
//ENTRE 25,0 E 29,9	SOBREPESO	I
//ENTRE 30,0 E 39,9	OBESIDADE	II
//MAIOR QUE 40,0	OBESIDADE GRAVE	III
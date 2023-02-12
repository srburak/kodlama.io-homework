package intro;

public class Main {

	public static void main(String[] args)
	{
		System.out.println("Hello world !");
		String ortametin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortametin);
		
		int vade = 12;
		
		double dolarDun = 18.15;
		double dolarBugun = 18.15;
		
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun)
		{
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		} 
		
		else if(dolarBugun >dolarDun) 
		{
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		else
		{
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler = {"Hızlı Kredi", "Maaşına Halkbanktan","Mutlu Emekli"};
			
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}

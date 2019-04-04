package conf;

import elements.Variables;

public class Logger extends Variables {
	Config configuration = new Config();
		
	public void name(String string){	
		//Âûâîä íàçâàíèÿ òåñòà
		configuration.dateTime();
		System.out.print("[Info]");
		System.out.println("Òåñò ¹ " + string);
	}
	
	public void doText(String string){	
		//Âûâîä òåêñòà
		configuration.dateTime();
		System.out.print("[Info]");
		System.out.println(string);
	}	
	
	public void doClick(String string){		
		//Âûâîä íàæàòèÿ íà ýëåìåíò
		configuration.dateTime();
		System.out.print("[Click]");
		System.out.println("Íàæèìàåì íà êíîïêó " + string);
	}	
	
	public void doInput(String string){		
		//Âûâîä ââîäà çíà÷åíèÿ
		configuration.dateTime();
		System.out.print("[Input]");
		System.out.println("Íàáèðàåì/Óñòàíàâëèâàåì çíà÷åíèå â ïîëå " + string);
	}	
}

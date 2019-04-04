package conf;

import elements.Variables;

public class Logger extends Variables {
	Config configuration = new Config();
		
	public void name(String string){	
		//Вывод названия теста
		configuration.dateTime();
		System.out.print("[Info]");
		System.out.println("Тест № " + string);
	}
	
	public void doText(String string){	
		//Вывод текста
		configuration.dateTime();
		System.out.print("[Info]");
		System.out.println(string);
	}	
	
	public void doClick(String string){		
		//Вывод нажатия на элемент
		configuration.dateTime();
		System.out.print("[Click]");
		System.out.println("Нажимаем на кнопку " + string);
	}	
	
	public void doInput(String string){		
		//Вывод ввода значения
		configuration.dateTime();
		System.out.print("[Input]");
		System.out.println("Набираем/Устанавливаем значение в поле " + string);
	}	
	
	
	
	public void doCheck(){	
		//Вывод проверки
		configuration.dateTime();
		System.out.print("[Check]");
		System.out.println("Проверяем результат: ");		
	}
	
	
	
	public void ignoreAdmin(){		
		if (account.equals("adm")){
			System.out.println("Для администратора данный тест игнорируется");				
		}			
	}
	
	public void ignoreManager(){		
		if (account.equals("man")){
			System.out.println("Для менеджера данный тест игнорируется");
			driver.quit();
		}
	}
	
	public void ignorePolzovatel(){		
		if (account.equals("pol")){
			System.out.println("Для пользователя данный тест игнорируется");
			driver.quit();
		}
	}
}

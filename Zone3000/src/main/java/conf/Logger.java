package conf;

import elements.Variables;

public class Logger extends Variables {
	Config configuration = new Config();
		
	public void name(String string){	
		//����� �������� �����
		configuration.dateTime();
		System.out.print("[Info]");
		System.out.println("���� � " + string);
	}
	
	public void doText(String string){	
		//����� ������
		configuration.dateTime();
		System.out.print("[Info]");
		System.out.println(string);
	}	
	
	public void doClick(String string){		
		//����� ������� �� �������
		configuration.dateTime();
		System.out.print("[Click]");
		System.out.println("�������� �� ������ " + string);
	}	
	
	public void doInput(String string){		
		//����� ����� ��������
		configuration.dateTime();
		System.out.print("[Input]");
		System.out.println("��������/������������� �������� � ���� " + string);
	}	
	
	
	
	public void doCheck(){	
		//����� ��������
		configuration.dateTime();
		System.out.print("[Check]");
		System.out.println("��������� ���������: ");		
	}
	
	
	
	public void ignoreAdmin(){		
		if (account.equals("adm")){
			System.out.println("��� �������������� ������ ���� ������������");				
		}			
	}
	
	public void ignoreManager(){		
		if (account.equals("man")){
			System.out.println("��� ��������� ������ ���� ������������");
			driver.quit();
		}
	}
	
	public void ignorePolzovatel(){		
		if (account.equals("pol")){
			System.out.println("��� ������������ ������ ���� ������������");
			driver.quit();
		}
	}
}

package classes;
import java.util.Scanner;

public class Uspevaemost {
	
	//конструктор класса со всеми параметрами
	public Uspevaemost(short s, int m, int n, int h, Napravlenie nam){
		srball = s;
		minimum = m;
		normal = n;
		high = h;
		na = nam;
	}
	
	//конструктор класса с одним параметром
	public Uspevaemost(short x){
		srball = x;
		minimum = 30;
		normal = 70;
		high = 100;
		na = new Napravlenie((short)x);
	}
	
	//конструктор класса без параметров
	public Uspevaemost(){
		srball = 0;
		minimum = 30;
		normal = 70;
		high = 100;
		na = new Napravlenie();
	}
	
	//метод ввода
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите средний балл студента: ");
		srball = inp.nextShort();
	}

	//метод подсчета размера стипендии
	public int getstip()
	{
		int stip = 0;
		if (srball<=minimum)
			stip = 1000;
		else if ((srball>minimum)&&(srball<=normal))
			stip = 4000;
		else if ((srball>normal)&&(srball<=high))
			stip = 7000;
		return stip;
	}
	
	public void bonuss(){
		if ((na.elite) == 1)
			System.out.println("Бонус не положен");
		else 
			System.out.println("Положен бонус в размере 2000");
	}

	//метод вывода
	public void output(){
		if (srball<=minimum)
			System.out.println("Успеваемость: Низкая");
		else if ((srball>minimum)&&(srball<=normal))
			System.out.println("Успеваемость: Нормальная");
		else if ((srball>normal)&&(srball<=high))
			System.out.println("Успеваемость: Высокая");
		System.out.println("Средний балл студента: " + srball);
	}
	
	
	//поля класса
	private short srball; //средний балл студента по всем предметам 
	private int minimum; //порог, меньше которого успеваемость считается низкой
	private int normal; //порог, меньше которого успеваемость считается нормальной
	private int high; //порог, меньше которого успеваемость считается высокой
	private Napravlenie na;
}
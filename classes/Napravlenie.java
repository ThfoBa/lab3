package classes;
import java.util.Scanner;

public class Napravlenie {
	//конструктор со всеми параметрами
	public Napravlenie(String n, short e, short f){
		nazvanie = n;
		elite = e;
		formstudy = f;
	}
	
	//конструктор с одним параметром
	public Napravlenie(short x){
		nazvanie = Short.toString(x);
		elite = x;
		formstudy = x;
	}
	
	//конструктор без параметров
	public Napravlenie(){
		nazvanie = "";
		elite = 0;
		formstudy = 0;
	}
	
	//метод ввода класса
	public void input(){
		Scanner inp = new Scanner(System.in, "Cp866");
		System.out.println("Введите название вашего направления: ");
		nazvanie = inp.nextLine();
		System.out.println("Введите класс престижности вашего направления (1-обычная, 2-высокая): ");
		elite = inp.nextShort();
		System.out.println("Введите форму обучения (1-платное, 2-бюджет): ");
		formstudy = inp.nextShort();
	}
	
	//метод вывода класса
	public void output(){
		System.out.println("Направление: " + nazvanie);
		if (elite == 1)
			System.out.println("Престижность направления: Обычная");
		else
			System.out.println("Престижность направления: Высокая");
		if (formstudy == 1)
			System.out.println("Форма обучения: Платное");
		else 
			System.out.println("Форма обучения: Бюджет");
	}

	
		
	
	//поля класса
	private String nazvanie; //название направления
	protected short elite; //класс престижности направления (типа обычное и престижное)
	private short formstudy; //форма обучения
}
package classes;
import java.util.Scanner;
import java.util.ArrayList;

public class Student{
	//конструктор класса со всеми параметрами
	public Student(int i, Experience e, Napravlenie n, Uspevaemost u){
		id = i;
		exp = e;
		nap = n;
		usp = u;
	}
	
	//конструктор класса с одним параметром
	public Student(int x){
		id = x;
		exp = new Experience((byte)x);
		nap = new Napravlenie((short)x);
		usp = new Uspevaemost((short)x);
	}
	
	//конструктор класса без параметров
	public Student(){
		id = 0;
		exp = new Experience();
		nap = new Napravlenie();
		usp = new Uspevaemost();
	}
	
	//метод вывода
	public void output(){
		System.out.println("ID: " + id);
		exp.output();
		nap.output();
		usp.output();
		usp.bonuss();
		System.out.println("Стипендия: " + usp.getstip());
	}
	
	//метод ввода
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите ID: ");
		id = inp.nextInt();
		exp.input();
		nap.input();
		usp.input();
	}
	

	
	

	
	
	//поля класса
	private int  id; //индивидуальный номер
	private Experience exp; //кол-во лет обучения в вузе
	private Napravlenie nap; //название направления
	private Uspevaemost usp; //успеваемость студента
}
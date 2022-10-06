package classes;
import java.util.Scanner;

public class Experience {
	//конструктор класса со всеми параметрами
	public Experience(byte s, byte a) {
		studyyears = s;
		akadem = a;
		
	}
	
	//конструктор класса с одним параметром
	public Experience(byte x) {
		studyyears = x;
		akadem = x;
		
	}
	
	//конструктор класса без параметров
	public Experience(){
		studyyears = 0;
		akadem = 0;
		
	}
	
	//метод вывода
	public void output(){
		System.out.println("Количество лет обучения: " + studyyears);
		System.out.println("Количество лет в академическом отпуске: " + akadem);
		
	}
	
	//метод ввода
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите кол-во полных лет обучения: ");
		studyyears = inp.nextByte();
		System.out.println("Введите кол-во лет, проведенных в академическом отпуске: ");
		akadem = inp.nextByte();
		
	}
	
	//метод возвращающий общее время, проведённое в вузе
	public byte allexperience(){
		byte all;
		all = studyyears;
		all += akadem;
		return all;
	}
	
	//поля класса
	private byte studyyears; //кол-во реальных лет обучения
	private byte akadem; //кол-во лет в академе
}
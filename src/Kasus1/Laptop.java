package Kasus1;

public class Laptop {
	String nameLaptop; 
	 int series;
	 processor processor;
	 int price;
	 
	 public Laptop(String nameLaptop, int series, processor processor) {  
		 this.series = series;  
		 this.nameLaptop = nameLaptop;  
		 this.processor=processor; 
		}  
	 void display(){  
		 System.out.println("Name: " +nameLaptop + ", "+"Series: " +series);
		 System.out.println("Processor:");
		 System.out.println(processor.name+" "+processor.gen+" "+processor.merk+ " " +processor.score); 
		 System.out.println("\n");
		}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 processor proc1 = new processor("I7,","11th,","Intel,", 90000);  
		 processor proc2 = new processor("Ryzen3,","3th,","AMD,", 82000);  
			  
		 Laptop st1 = new Laptop("Asus", 9866, proc1);  
		 Laptop st2 = new Laptop("Dell", 2299 , proc2);  
			     
		   st1.display();  
		   st2.display();  
	}

}

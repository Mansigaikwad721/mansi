package aws_package;
import  java.util.*;
class Pizza
{
	String pizzabase;
	int price;
	Pizza(String base, int p)
	{
		pizzabase = base;
		price = p;
	}
	void display()
	{
		System.out.println("PizzaBase = "+pizzabase+"\nPrice = "+price );
	}
	
}
class ChickenPizza extends Pizza
{
	String topping = "chicken";
	ChickenPizza(String base, int p)
	{
		super(base, p);
		
	}
	void display()
	{
		System.out.println("PizzaBase = "+pizzabase+"\nPrice = "+price +"\nTopping ="+topping);
	}
	
}
class MuttonPizza extends ChickenPizza
{
	String flavouredtopping  = "Mutton";
	MuttonPizza(String base, int p)
	{
		super(base, p);
		
	}
	void display()
	{
		System.out.println("PizzaBase = "+pizzabase+"\nPrice = "+price+"\nFlavoured Topping = "+flavouredtopping );
	}
}

public class PizzaHut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Pizza obj1= new Pizza("Thin", 100);
		ChickenPizza obj2 = new ChickenPizza("Thick", 200);
		MuttonPizza obj3 = new MuttonPizza("flat", 300);
		
		System.out.print("Simple Pizza Price = "+ obj1.price);
		System.out.print("Chicken Pizza Price = "+ obj2.price);
		System.out.print("Mutton Pizza Price = "+ obj3.price);
		System.out.print("Choose your pizza\nPress\n 1 ---> simple Pizza \n2 ---> Chicken Pizza\n3 ---> Mutton Pizza");
		int pi = sc.nextInt();
		if(pi== 1)
		{
			obj1.display();
		}else if(pi== 2)
		{
			obj2.display();
			
		}
		else if(pi== 3)
		{
			obj3.display();
		}
		else
		{
			System.out.println("Enter valid number");
		}
	}
}

package com.test;

class Animal 
{ 
	void walk(String model)
	{ 
		if(model.equals("fish"))
		{
			System.out.println("I am not walking");
		}else 
		if(model.equals("caterpillar"))
		{
			System.out.println("I am not walking");
		}else
		{
			System.out.println("I am walking");
		}
		
	}
	
	void swim()
	{ 
		System.out.println("I am swiming");
	}
	
	void rooster()
	{ 
		System.out.println("Cock-a-doodle-doo");
	}
	
	void cat()
	{ 
		System.out.println("I am cat");
	}
	void dog()
	{ 
		System.out.println("I am dog");
	}
	
	void duck()
	{ 
		System.out.println("I am duck");
	}
	
	
	
} 
class Bird extends Animal 
{ 
	void fly(String model) 
	{ 
		if(model.equals("butterfly"))
		{
			System.out.println("I am flying"); 
		}else if(model.equals("bird"))
		{
			System.out.println("I am flying"); 
		}else
		{
			System.out.println("I am not flying"); 
		}
	} 
	void sing(String model) 
	{ 
		if(model.equals("fish"))
		{
			System.out.println("Fishes don’t sing");
		}else
		{
		System.out.println("I am Sing"); 
		}
	} 
	void birdsName(String name)
	{
		System.out.println("I am "+name);
	}
	
	void sounds(String name)
	{
		if(name.equals("Duck"))
		{
			System.out.println("Quack, quack");
			System.out.println("duck can swim");
		}else if(name.equals("Chicken"))
		{
			System.out.println("Cluck, cluck");
			System.out.println("chicken can't fly for assumbtion");
		}else if(name.equals("dog"))
		{
			System.out.println("Woof, woofW");
		}else if(name.equals("cat"))
		{
			System.out.println("Meow");
		}
		else if(name.equals("phone"))
		{
			System.out.println("Phone is rings");
		}
		else if(name.equals("butterfly"))
		{
			System.out.println("butterfly does not make a sound");
		}

	}
	
	void parrot(String type)
	{
		System.out.println("Parrot 1 living with dog");
	}
	
	
} 

class Fish extends Bird
{
	void fishName(String name)
	{
		System.out.println("Fish Name :"+name);
	}
	void fishInfo(String name)
	{
		if(name.equals("Shark"))
		{
			System.out.println("Sharks are large and grey");
			System.out.println("Sharks eat other fish");
		}else if(name.equals("Clownfish"))
		{
			System.out.println("Clownfish are small and colourful (orange)");
			System.out.println("Clownfish make jokes");
		}
	}
	
}

class Duck  extends Bird
{
	
}

class Chicken extends Bird
{
	
}

class Rooster extends Bird
{
	
}

class Parrot extends Bird
{
	
}
class Shark extends Fish
{
	
}

class ClownFish extends Fish
{
	
}

class Dolhpin extends Fish
{
	
}
class Frog extends Animal
{
	
}
class Dog extends Animal
{
	
}

class Butterfly extends Bird
{
	
}

class Cat extends Animal
{
	
}


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird=new Bird();
		bird.walk("animal");
		bird.fly("bird");
		
		//1.
		bird.sing("bird");//call bird sing method
		
		System.out.println("--------------------------------------");
		
		bird.birdsName("Duck");
		bird.sounds("Duck");
		System.out.println("--------------------------------------");
		bird.birdsName("Chicken");
		bird.sounds("Chicken");
		
		System.out.println("--------------------------------------");
		//Rooster add in parent class
		Animal animal=new Animal();
		animal.rooster();
		
		System.out.println("--------------------------------------");
		
		bird.dog();
		bird.parrot("1");
		bird.sounds("dog");
		
        System.out.println("--------------------------------------");
		
		bird.dog();
		bird.parrot("2");
		bird.sounds("dog");
		
        System.out.println("--------------------------------------");
		bird.parrot("3");
		bird.sounds("phone");
		
		
		System.out.println("--------------------------------------");
		//fish Model
		
		Fish fish=new Fish();
		fish.sing("fish");
		fish.walk("fish");
		fish.swim();
		System.out.println("--------------------------------------");
		fish.fishName("Shark");
		fish.fishInfo("Shark");
		
		System.out.println("--------------------------------------");
		fish.fishName("Clownfish");
		fish.fishInfo("Clownfish");
		
		//butterfly model
		System.out.println("--------------------------------------");
		bird.fly("butterfly");
		bird.sounds("butterfly");
		
		//caterpillar model
				System.out.println("--------------------------------------");
				bird.fly("caterpillar");
				bird.walk("caterpillar");
		
	   Animal[] obj=new Animal[]
			   {
					   new Bird(),
					   new Duck(),
					   new Chicken(),
					   new Rooster(),
					   new Parrot(),
					   new Fish(),
					   new Shark(),
					   new ClownFish(),
					   new Dolhpin(),
					   new Frog(),
					   new Dog(),
					   new Butterfly(),
					   new Cat()
					   
			   };
	   
	  System.out.println("No Of Animals : "+obj.length);
		
	}

}

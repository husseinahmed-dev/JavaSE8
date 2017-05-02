package ite409;
public class AnimalTest
{
	public static void main (String[] args)
    {
    	IMovable[] animalArr = new Animal[5];
    	
    	animalArr[0] = new Cow("Milky");
    	animalArr[1] = new Cow("Meaty");
    	animalArr[2] = new Cow("Hairy");
    	animalArr[3] = new Cat("Kitty");
    	animalArr[4] = new Cat("Garfield");
    	
    	for (IMovable animal : animalArr)
	    {
	    	System.out.println (animal);
			System.out.println(animal.move());
	    }
    }
}
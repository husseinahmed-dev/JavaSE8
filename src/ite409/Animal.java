package ite409;

public abstract class Animal implements IMovable
{
	private String name;
	
	public Animal(String name)
	{
		this.name = name;
	}
	public final String getName()
	{
		return name;
	}
	public String toString()
	{
		return String.format("My name is %s", getName());
	}
	
	public abstract String makeSound();
}
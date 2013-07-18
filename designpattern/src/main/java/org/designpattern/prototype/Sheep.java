package org.designpattern.prototype;

public class Sheep implements Animal {

	public Sheep(){
		System.out.println("Sheep is made");
	}
	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is being Made");

		Sheep sheepObject = null;
		try{
			sheepObject=(Sheep)super.clone();
		}catch(CloneNotSupportedException e){}
		
		return sheepObject;
	}

	
	public String toString(){
		return "Sheep";
	}
}

package day34_Inheritance.animals;

public class AnimalObject {

	public static void main(String[] args) {
//      Animal a = new Animal();
//      a.age = 4;
//      a.gender = 'M';
//      a.name = "John";
      
      Animal a = new Animal("John",5,'M');
  
      a.move();
      a.makeSounds();
            
      Cat cat = new Cat();
      cat.makeSounds();
      cat.move(); // inherit move method from Animal class
            
//      System.out.println(cat.age);
//      System.out.println(cat.gender);
//      System.out.println(cat.name);
//      
      System.out.println(cat.getAge());
      System.out.println(cat.getGender());
      System.out.println(cat.getName());
      
      
      System.out.println("---------------");
      Dog d = new Dog("Jim",2,'M');
      d.move();
      d.makeSounds();
      
      System.out.println(d.getAge());
      System.out.println(d.getName());
      System.out.println(d.getGender());
      
	}

}

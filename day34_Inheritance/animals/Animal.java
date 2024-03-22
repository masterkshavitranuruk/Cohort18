package day34_Inheritance.animals;

public class Animal {
	// instance variables
    private String name;
    private int age;
    private char gender;
    
    public Animal() {}
    public Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // instance method
    public void move() {
        System.out.println("Animal is moving.");
    }
    
    public void makeSounds() {
        System.out.println("Animal is making sounds.");
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
    
    
}

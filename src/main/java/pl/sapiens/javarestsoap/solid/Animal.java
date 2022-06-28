package pl.sapiens.javarestsoap.solid;

public abstract class Animal {

   abstract public void eat();
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("hau hau");
        System.out.println("mniam");
    }
}

class Horse extends Animal{
    @Override
    public void eat() {
        System.out.println("ihaaaa");
    }
}

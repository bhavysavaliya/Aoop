final class Bike {
    String name;

   
    Bike(String name) {
        this.name = name;
    }

    
    void display() {
        System.out.println("Bike name: " + name);
    }
}


public class Main {
    public static void main(String[] args) {
       
        Bike myBmw = new Bike("Kawasaki Ninja H2");
        myBmw.display();
    }
}

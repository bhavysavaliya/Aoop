class gadi {
    String name;
    int topSpeed;

   
    gadi(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    public String toString() {
        return "Car Name: " + name + ", Top Speed: " + topSpeed + " km/h";
    }
}

public class Main {
    public static void main(String[] args) {
       
        gadi first = new gadi("Amaze",160);
        gadi second = new gadi("Ciaz", 190);
        gadi third = new gadi("Sonet", 180);
        gadi forth = new gadi("Fortuner", 190);
        gadi fifth = new gadi("G-Wagon", 220);

        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(forth);
        System.out.println(fifth);
    }
}

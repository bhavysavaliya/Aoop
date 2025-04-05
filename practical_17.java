class Bhavy {
   
    void behaviour() {
        System.out.println("maja karva ni");
    }
}


class moj extends Bhavy {
 
    void moves() {
        System.out.println("aavi jav more moro");
    }
}

public class Main {
    public static void main(String[] args) {
        Bhavy myb = new Bhavy();
        myb.behaviour();  

        moj mineb = new moj();
        mineb.moves();
    }
}

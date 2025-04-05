class heart {
    void BMW() {
        System.out.println("full form of bmw is Bayerische Motoren Werke");
    }
}


class Mseries extends heart {
    void eyes() {
        System.out.println("this series is give us ultimate performance");
    }
}


class Xseries extends heart {
    void XUV() {
        System.out.println("this series is give us ultimate performance + family car");
    }
}


public class Main {
    public static void main(String[] args) {
        Mseries suii = new Mseries();
        suii.BMW();  
        suii.eyes();   

        Xseries suiii = new Xseries();
        suiii.BMW();  
        suiii.XUV();
    }
}

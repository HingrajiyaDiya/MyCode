package MyPackage;

class HillStations {
    public void location() {
        System.out.println("Location is:");
    }
    
    public void famousFor() {
        System.out.println("Famous for:");
    }
}

class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }
    
    @Override
    public void famousFor() {
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }
    
    @Override
    public void famousFor() {
        System.out.println("It is Famous for education institutions");
    }
}

class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is in J&K");
    }
    
    @Override
    public void famousFor() {
        System.out.println("It is Famous for skiing");
    }
}

public class Lab_3_HillStationsDemo {
    public static void main(String[] args) {
        HillStations hillStations = new HillStations();
        hillStations.location();
        hillStations.famousFor();
        
        Manali manali = new Manali();
        manali.location();
        manali.famousFor();
        
        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();
        
        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}
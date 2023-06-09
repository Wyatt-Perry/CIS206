import java.util.ArrayList;
import java.util.List;

class Mountain {
    private String name;
    private String country;
    private double elevation;

    public Mountain(String name, String country, double elevation) {
        this.name = name;
        this.country = country;
        this.elevation = elevation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public double toMeters() {
        return elevation / 3.2808;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Mountain> mountains = new ArrayList<>();

        Mountain chimborazo = new Mountain("Chimborazo", "Ecuador", 20549);
        Mountain matterhorn = new Mountain("Matterhorn", "Switzerland", 14692);
        Mountain olympus = new Mountain("Olympus", "Greece (Macedonia)", 9573);
        Mountain everest = new Mountain("Everest", "Nepal", 29029);
        Mountain mountMarcy = new Mountain("Mount Marcy - Adirondacks", "United States", 5344);
        Mountain mountMitchell = new Mountain("Mount Mitchell - Blue Ridge", "United States", 6684);
        Mountain zugspitze = new Mountain("Zugspitze", "Switzerland", 9719);

        mountains.add(chimborazo);
        mountains.add(matterhorn);
        mountains.add(olympus);
        mountains.add(everest);
        mountains.add(mountMarcy);
        mountains.add(mountMitchell);
        mountains.add(zugspitze);

        System.out.println("Mountain Details:");
        System.out.println("-----------------");
        for (Mountain mountain : mountains) {
            System.out.println("Mountain: " + mountain.getName());
            System.out.println("Country: " + mountain.getCountry());
            System.out.println("Elevation (feet): " + mountain.getElevation());
            System.out.println("Elevation (meters): " + mountain.toMeters());
            System.out.println("-----------------");
        }

        Mountain shortestMountain = minElevation(mountains);
        System.out.println("Shortest Mountain:");
        System.out.println("Name: " + shortestMountain.getName());
        System.out.println("Elevation (feet): " + shortestMountain.getElevation());

        System.out.println("-----------------");
    }

    public static Mountain minElevation(List<Mountain> mountains) {
        Mountain minMountain = mountains.get(0);
        for (Mountain mountain : mountains) {
            if (mountain.getElevation() < minMountain.getElevation()) {
                minMountain = mountain;
            }
        }
        return minMountain;
    }
}

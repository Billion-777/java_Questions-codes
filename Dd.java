package coverage;

import java.util.*;

public class Dd {
    double k, m, M;
    Scanner sc = new Scanner(System.in);

    public void MetertoKm() {
        System.out.println("Enter the meters");
        m = sc.nextDouble();
        k = m / 1000;
        System.out.println(m + "M" + " =" + k + "Km");

    }

    public void KmtoMeter() {
        System.out.println("Enter the kilo meters");
        k = sc.nextDouble();
        m = k * 1000;
        System.out.println(k + "Km" + " =" + m + "M");

    }

    public void Kmtomiles() {
        System.out.println("Enter the kilo meters");
        k = sc.nextDouble();
        M = k * 1.60934;
        System.out.println(k + "Km" + " =" + M + "miles");

    }

    public void MilestoKm() {
        System.out.println("Enter the Miles");
        M = sc.nextDouble();
        k = M / 1.60934;
        System.out.println(M + "miles" + " =" + k + "Km");

    }

}

package coverage;

import java.util.*;

public class Tt {
    double hr, min, sec, S, s;
    Scanner sc = new Scanner(System.in);

    public void HourstoMin() {
        System.out.println("enter the hours");
        hr = sc.nextDouble();
        min = hr * 60;
        System.out.println(hr + "hours" + "=" + min + " minutes");
    }

    public void MintoHours() {
        System.out.println("enter the Minutes");
        min = sc.nextDouble();
        hr = min / 60;
        min = min % 60;
        System.out.println(hr + "hours" + ":" + min + " minutes");
    }

    public void SecondstoHours() {
        System.out.println("enter the Seconds");
        sec = sc.nextDouble();
        hr = sec / 3600;
        min = (sec % 3600) / 60;
        S = (sec % 3600) % 60;

        System.out.println(s + "seconds" + "= " + hr + ":" + min + ":" + S);
    }
}

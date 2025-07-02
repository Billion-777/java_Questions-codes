package coverage;

import java.util.*;

public class Cc {
    double inr, usd, yen, euro;
    Scanner sc = new Scanner(System.in);

    public void InrtoUsd() {
        System.out.println("enter indian rupees");
        inr = sc.nextDouble();
        usd = inr / 82.12;
        System.out.println(inr + " INR" + "=" + usd + " dollar");
    }

    public void usdtoInr() {
        System.out.println("enter dollars");
        usd = sc.nextDouble();
        inr = usd * 82.12;
        System.out.println(usd + " dollar" + " =" + inr + " INR");
    }

    public void Inrtoeuro() {
        System.out.println("enter indian rupees");
        inr = sc.nextDouble();
        euro = inr / 89.62;
        System.out.println(inr + " INR" + "=" + euro + " Euros");
    }

    public void EurotoInr() {
        System.out.println("enter  Euros");
        euro = sc.nextDouble();
        inr = euro * 89.62;
        System.out.println(euro + " Euros" + " =" + inr + " INR");
    }

    public void InrtoYen() {
        System.out.println("enter Indian Rupees");
        inr = sc.nextDouble();
        yen = inr / 0.62;
        System.out.println(inr + " INR" + "=" + yen + " Yen");
    }

    public void YentoInr() {
        System.out.println("enter Yen");
        yen = sc.nextDouble();
        inr = yen * 0.62;
        System.out.println(yen + " Yen" + "=" + inr + " INR");
    }

}

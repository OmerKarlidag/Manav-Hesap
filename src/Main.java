import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armutkg = 2.14, elmakg = 3.67, domateskg = 1.11, muzkg = 0.95, patlicankg = 5.00;

        Scanner kg = new Scanner(System.in);

        System.out.print("Armut : ");
        double armut = kg.nextDouble();

        System.out.print("Elma : ");
        double elma = kg.nextDouble();

        System.out.print("Domates : ");
        double domates = kg.nextDouble();

        System.out.print("Muz : ");
        double muz = kg.nextDouble();

        System.out.print("Patlıcan : ");
        double patlican = kg.nextDouble();

        double total = (armutkg * armut) + (elmakg * elma) + (domateskg * domates) + (muz * muzkg) + (patlicankg * patlican);

        System.out.printf("Toplam Tutar : " + total + " TL");

    }
}
/* Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL */

import java.util.Scanner;

public class PatikaProje7 {
    public static void main(String[] args) {

        //Değişkenleri tanımlayalım
        int armut, elma,domates, muz, patlican;
        double armutKgFiyati = 2.14, elmaKgFiyati=3.67, domatesKgFiyati=1.11, muzKgFiyati=0.95, patlicanKgFiyati=5.00, toplamTutar;

        //Scanner sınıfını tanımlayalım
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alalım
        System.out.print("Armut kaç kilo ? : ");
        armut = input.nextInt();

        System.out.print("Elma kaç kilo ? : ");
        elma = input.nextInt();

        System.out.print("Domates kaç kilo ? : ");
        domates = input.nextInt();

        System.out.print("Muz kaç kilo ? : ");
        muz = input.nextInt();

        System.out.print("Patlıcan kaç kilo ? : ");
        patlican = input.nextInt();

        //Toplam tutarı hesaplayalım
        toplamTutar = (armut * armutKgFiyati) +(elma * elmaKgFiyati) + (domates * domatesKgFiyati) + (muz * muzKgFiyati) + (patlican * patlicanKgFiyati);
        System.out.print("Toplam Tutar : " + toplamTutar);
    }
}

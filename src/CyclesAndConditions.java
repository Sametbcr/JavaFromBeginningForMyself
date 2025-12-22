import java.util.Scanner;

public class CyclesAndConditions {
    public static void main(String[] args) {

        /*
        // if kullanımı
        int number = -20;

        if (number > 0) {
            System.out.println(" Sayı sıfırdan büyük.");
        } else {
            System.out.println(" Sayı sıfır yada negatiftir..");
        }

         */

        /*
        // else if kullanımı

        int number = 20;
        if (number > 0) {
            System.out.println("Sayı pozitiftir.");
        } else if (number == 0) {
            System.out.println("Sayı SIFIR'dır.");
        } else {
            System.out.println("Sayı sıfırdan küçüktür.");
        }

         */

        /*
        //iç içe kullanım
        int x = 5, y = 6, z = 7, max;

        if (x >= y) {

            if (x >= z) {
                max = x;
            } else {
                max = z;
            }

        } else {
            if (y >= z) {
                max = y;
            } else {
                max = z;
            }

        }
        */

        /*
        // Üniversitede Vize ve Final notları üzerinden Kaldı geçti durumu veren bir uygulama ;
        double vize, finel, ortalama;
        int sinir;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Vize sınavı notunuzu giriniz: ");
        vize = input.nextDouble();
        System.out.print("Lütfen Final Sınavı notunuzu giriniz: ");
        finel = input.nextDouble();
        System.out.print("Üniversitenizdeki ders geçme sınır notunu giriniz: ");
        sinir = input.nextInt();
        ortalama =(vize*0.4)+(finel*0.6);
        System.out.println("Not Ortalamanız: "+ortalama);
        if (ortalama>=sinir  ) {
            if (finel>=sinir){
                System.out.println("Ortalamanız ve Final sınavı notunuz "+sinir+" sınırının üzerinde.\nTebrikler dersi geçtiniz. :)");
            }
            else {
                System.out.println("Ortalamanız "+sinir+" sınırının üzerinde. Ama Final Sınavı notunuz sınırın altında.\nDersi geçemediniz ama Bütünlemelere iyi çalışın :)");
            }
        }
        else {
            System.out.println("Ortalamanız "+sinir+" sınır notunun altında. Malesef dersi geçemediniz.");
        }
        input.close();
        */

        /*
        // Ternary operator
        //Örneğin 50den yukarı alınca dersi geçsin öğrenci durumu için Ternary biçimde yazalım.

        Scanner input = new Scanner(System.in);
        double puan = input.nextDouble();

        String sonuc = (puan >= 50) ? "Dersi geçtiniz." : "Dersten kaldınız.";

        System.out.println(sonuc);

        input.close();
        */

        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        String message = (yas >= 18) ? "Dikkatli sürün." : "Araba sürmeye uygun değilsiniz!";
        System.out.println(message);
        */






    }

}

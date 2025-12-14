import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Variable {
    public static void main(String[] args) {
        /*
         *  /n bir alt satıra iner.
         *  /t bir TAB kadar boşluk bırakır.
         *
         *  */

        /*

       int hiz1; // başlangıç atamasız değişken tanımı



        int hiz2 = 100; // başlangıç atamalı değişken tanımı

        double a = 4.5;

        a=5.5; // a değişkeninde saklanan sayı güncellendi.

        char Harf='A';

        */

        /*


         *           Tam Sayılar
         * Byte          [ 8  Bit (Max:127  Min:-128) ]
         * Short         [ 16 Bit (Max:32,767  Min:-32,768) ]
         * Integer       [ 32 Bit (Max:2,147,483,647  Min:-2,147,483,648) ]
         * Long          [ 64 Bit (Max:...) ]
         *
         *           Ondalıklı Sayılar
         * Float         [ 32 Bit, Hız ve bellek tasarrufu   ] Float tanımlamasından sonra f-F harfi konulmalıdır.
         * Double        [ 64 Bit, Yavaş ve Hassas değerler  ]
         *
         *           Karakterler
         * Char          [ 16 Bit (Diğer dillerde 8 Bittir. JAVA Unicode'dur.)
         *
         *           Mantıksal Değerler
         * Boolean       [ True ve False içerir. ]
         *
         * */

        /*
        char karakter = 97;  //Küçük a harfinin ASCI kodunun 10luk tabandaki numarasını verdim.
        System.out.println("karakter: " + karakter);
        */

        /*
        //  + , - , * , / , %  Aritmetik operatörlerdir.
        // burada farklı olabilecek olan, bölümden çıkan sonuç virgüllü olabilir. İnteger atanması tam sonuç vermeyebilir.
        // birde % (MOD) bölümden kalanı verir.

        int a = 15, b = 7;  // bu şekilde aynı tipteki a ve b integer'ini virgülle yan yana atayabilirim.
        System.out.println("a + b = " + (a + b));  //toplam ekrana basıldı. Sonra kullanmak istersem değişkende olmalı.
        */

        /*
        // Atama Operatörleri
        // = , += , -= , *= , /= , %=

        int a = 15, b = 7;

        a = a + b; //bu yazım ile alttaki yazım aynıdır.
        a += b;
        */

        /*

        //  İlişkisel operatörler
        //  ==  ,  !=  ,  >  ,  <  ,  >=  ,  <=     ( eşit mi? , eşit değil mi? , büyük mü? , küçük mü? , büyük veya eşit mi? , küçük veya eşit mi? )

        System.out.println(5 != 7);  //  5 eşit değil mi 7 ye? cevap true geldi çünki  eşit değil.
        */

        /*
        // Mantıksal Operatörler
        // !  ,  &&  ,  ||   ( değil  ,  ve  ,  veya )
        // && (VE) olduğunda ikisinin de true olması lazım. biri bile false'sa sonuç false olur.
        // || (VEYA) olduğunda herhangi biri true olduğunda cevap true olur.

        System.out.println(!(25<15));  // normalde 25<15 false gelecek. önünde değil olduğundan true geldi.
        */



    }
}

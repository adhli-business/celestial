import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//        //long
//        long uangSaya = 200000;
//        System.out.println(uangSaya);
//
//        //integer
//        int age = 25;
//        System.out.println(age);
//
//        //float dan double
//        float price = 19.99f;
//        System.out.println(price);
//
//        //character
//        char grade = 'A';
//        System.out.println(grade);
//
//        //boolean
//        boolean isTrue = true;
//        System.out.println(isTrue);
//
//        //String
//        String name = "Adhli";
//        System.out.println(name);
//
//        //Array
//        int[] numbers = {1,2,3,4};
//        System.out.println(java.util.Arrays.toString(numbers));

        // Arithmatic Operators
        int bilPertama = 10;
        int bilKedua = 5;
        int penjumlahan = bilPertama + bilKedua;
        System.out.println("Hasil penjumlahan dari "+ bilPertama + "+" + bilKedua + "=" + penjumlahan);

        int bilKetiga = 15;
        int bilKeempat = 5;
        int sisaBagi = bilKetiga % bilKeempat;
        System.out.println("Sisa hasil bagi dari "+ bilKetiga + "%" + bilKeempat + "=" + sisaBagi);

        //Relational Operators
        boolean hasil = (10!=5);
        System.out.println("Apakah 10 tidak sama dengan 5? " + hasil);
        boolean hasil2 = (10==5);
        System.out.println("Apakah 10 sama dengan 5? " + hasil2);

        //Logical Operators
        boolean result = (10>5) && (4<6);
        System.out.println("Apakah 10>5 dan 4<6? " + result);
        boolean result2 = (10>5) || (4>6);
        System.out.println("Apakah 10>5 atau 4>6? " + result2);

        //Bitwise Operators
        int coba = 5 & 3;
        int coba2 = 5 | 3;
        System.out.println(coba);
        System.out.println(coba2);

    }
}

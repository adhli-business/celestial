public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            long factorial = 1;

            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            System.out.println("Faktorial dari " + i + " : " + factorial);
        }

        //        //if else
//        String nama = "putra";
//        if (nama == "adhli"){
//            System.out.println("Nama: Adhli");
//        } else if (nama == "putra") {
//            System.out.println("Nama: Putra");
//        } else {
//            System.out.println("Nama: Falah");
//        }
//
//        // Switch Case
//        int angka = 3;
//        String namaHari;
//        switch (angka){
//                case 1:
//                namaHari = "Senin";
//                break;
//
//                case 2:
//                namaHari = "Selasa";
//                break;
//
//                case 3:
//                namaHari = "Rabu";
//                break;
//
//                case 4:
//                namaHari = "Kamis";
//                break;
//
//                case 5:
//                namaHari = "Jumat";
//                break;
//            default:
//                namaHari = "Salah";
//                break;
//        }
//
//        System.out.println("Hari ketiga adalah hari: " + namaHari);
//
//        //While loop
//        int number = 1;
//        while (number<=10) {
//            System.out.println("While loop ke-" + number);
//            number++;
//        }
//
//        //Do While
//        int numbers = 1;
//        do {
//            System.out.println("Do-while ke-" + numbers);
//            numbers++;
//        } while (numbers <=10);
    }
}
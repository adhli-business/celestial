public class Main {
    public static void main(String[] args) {
        String nama = "putra";
        if (nama == "adhli"){
            System.out.println("Nama: Adhli");
        } else if (nama == "putra") {
            System.out.println("Nama: Putra");
        } else {
            System.out.println("Nama: Falah");
        }

        int angka = 3;
        String namaHari;
        switch (angka){
                case 1:
                namaHari = "Senin";
                break;

                case 2:
                namaHari = "Selasa";
                break;

                case 3:
                namaHari = "Rabu";
                break;

                case 4:
                namaHari = "Kamis";
                break;

                case 5:
                namaHari = "Jumat";
                break;
            default:
                namaHari = "Salah";
                break;
        }

        System.out.println("Hari ketiga adalah hari: " + namaHari);
    }
}
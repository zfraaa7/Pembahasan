import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        soal_5();
        soal_4();
    }

    static void soal_5(){
        String text = "Java";

        int i = 1;

        while(i <= 3){
            String c = text.substring(i-1, text.length());

            System.out.println(i + " =" + text.substring( i -1, text.length()));

            i += 1;
        }
    }

    static void soal_4(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang anda:" );

        int jumlahBarang = input.nextInt();
        int total = 0;

        for(int i = 1; i <= jumlahBarang; i++){
            System.out.print("Masukkan harga barang ke- " + i+1 + " ");

            int hargaBarang = input.nextInt();
            total += hargaBarang;
        }

        System.out.println("Total harga barang anda : " + total);

        if(total > 100000){
            System.out.println("Selamat anda mendapat diskon!");
            total = total - (total * 10 / 100);
        } 

        System.out.println("Total yang harus anda bayar : " + total);
    }
}
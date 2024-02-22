import java.util.Scanner;

public class code {

    public static void main(String[] args){
        String name;
        char gender;
        int tahunsekarang = 2023;
        int bulansekarang = 12;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("// Input\n");

        //Meminta input nama
        System.out.print("Nama : ");
        name = keyboard.nextLine();

        //Meminta input jenis kelamin
        System.out.print("Jenis Kelamin : ");
        gender = keyboard.next().charAt(0);
       
        //Meminta input tahun lahir
        System.out.print("Masukkan Tanggal : ");
        int tanggal = keyboard.nextInt();

        System.out.print("Masukkan Bulan : ");
        int bulan = keyboard.nextInt();

        System.out.print("Masukkan Tahun : ");
        int tahun = keyboard.nextInt();

        System.out.print("Tanggal Lahir Anda : "+tanggal+"-"+bulan+"-"+tahun);

        System.out.print("\n// Output");

        System.out.print("\nNama anda: "+ name);

        int umur = tahunsekarang - tahun;
        int bulan1 = bulansekarang - bulan;

        if (gender <= 'L') {
            System.out.println("\ngender anda : Laki-Laki");
        } else if (gender <= 'P') {
            System.out.println("\ngender anda : Perempuan");
        } else {
            System.out.println("\nEROR!!!");
        }

        System.out.print("Umur Anda: " + umur + " tahun " + bulan1 + " bulan");


    }
}
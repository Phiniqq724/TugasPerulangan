import java.util.Scanner;

public class tugasperulangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double jumlahHarga = 0, harga;
        char pilih, pilihan;
        int count =0;
        while(true) {
            System.out.println(" == Selamat datang di Chamber Store! == ");
            System.out.println(" Pilih barang : \n  1. Sabun cuci (15000)\n  2. Minyak Goreng (40000)\n  3. Telur sekotak (25000)\n  4. Beras (13500)\n  5. Gula (12500)");
            System.out.print("  Input pilihan = ");
            pilih = in.next().charAt(0);
            switch(pilih){
                case '1':
                    harga = 15000;
                    jumlahHarga = jumlahHarga + harga;
                    break;
                case '2':
                    harga = 40000;
                    jumlahHarga = jumlahHarga + harga;
                    break;
                case '3':
                    harga = 25000;
                    jumlahHarga = jumlahHarga + harga;
                    break;
                case '4':
                    harga = 13500;
                    jumlahHarga = jumlahHarga + harga;
                    break;
                case '5':
                    harga = 12500;
                    jumlahHarga = jumlahHarga + harga;
                    break;
                default:
                    System.out.println(" -=- -=ERROR=- -=-");
                    return;
            }
            count++;
            System.out.print("Apakah ada barang lagi yang mau dibeli? {Y/N}");
            pilihan = in.next().charAt(0);
            if(pilihan == 'Y' || pilihan == 'y') {
                
            } else if(pilihan == 'N' || pilihan == 'n') {
                break;
            } else {
                return;
            }
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); //Ini biar rapi bu struknya ^^
        System.out.println(" == STRUK BELANJA CHAMBER STORE ==\n  Jumlah belanjaan = " + count + "\n  Total harga belanjaan = " + jumlahHarga);
    }
}

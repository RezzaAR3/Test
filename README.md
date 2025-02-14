import java.util.ArrayList; // Mengimpor kelas ArrayList digunakan untuk menyimpan daftar.
import java.util.Scanner; // Mengimpor kelas Scanner digunakan untuk membaca input dari user.
public class Kafe { // nama class.
    public static void main(String[] args) { // main method.
        Scanner sc = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari user.

        String[] menu = { // array yang menyimpan daftar menu makanan dan minuman yang tersedia.
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"
        };
        int[] harga = {20000, 15000, 12000, 10000, 8000, 20000, 25000}; // array yang menyimpan harga dari setiap menu sesuai dengan indeksnya.

        ArrayList<String> pesanan = new ArrayList<>(); // digunakan untuk menyimpan nama menu yang dipesan.
        ArrayList<Integer> jumlah = new ArrayList<>(); // digunakan untuk menyimpan jumlah pesanan dari masing-masing menu.
        ArrayList<Integer> totalHarga = new ArrayList<>(); // digunakan untuk menyimpan total harga dari setiap pesanan.

        int pilihan; // Variabel untuk menyimpan pilihan menu dari user.
        do { // Perulangan do-while agar menu terus muncul sampai user memilih opsi "Selesai" (4).

            System.out.println("=== Selamat Datang di Kafe ==="); // Menampilkan daftar menu beserta harga.
            System.out.println();
            System.out.println("=== Menu ===");
            for (int i = 0; i < menu.length; i++) { // Melakukan perulangan sebanyak jumlah elemen dalam array menu.
                System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]); // menampilkan menu secara otomatis sesuai array.
            }
            System.out.println();
            System.out.println("Pilih opsi berikut:"); // Menampilkan opsi yang bisa dipilih oleh user.
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Lihat Daftar Pesanan");
            System.out.println("3. Hitung Total Biaya");
            System.out.println("4. Selesai");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = sc.nextInt(); // digunakan untuk membaca input pilihan.
            sc.nextLine(); // digunakan untuk menghindari error dalam membaca input setelah angka.

            switch (pilihan) { // digunakan untuk menentukan tindakan berdasarkan pilihan user.
                case 1:
                    System.out.print("Masukkan nomor menu yang ingin dipesan: ");
                    int nomorMenu = sc.nextInt(); // meminta user untuk memasukkan nomer menu yg ingin dipesan.
                    if (nomorMenu < 1 || nomorMenu > menu.length) {
                    System.out.println("Nomor menu tidak valid."); // jika nomor tidak valid maka akan muncul pesan.
                    break;
                }
                System.out.print("Masukkan jumlah pesanan: ");
                int jumlahPesanan = sc.nextInt(); // Meminta jumlah pesanan dan menyimpannya ke dalam ArrayList.
                sc.nextLine();

                pesanan.add(menu[nomorMenu - 1]);
                jumlah.add(jumlahPesanan);
                totalHarga.add(harga[nomorMenu - 1] * jumlahPesanan);

                System.out.println(jumlahPesanan + " " + menu[nomorMenu - 1] + " berhasil ditambahkan ke pesanan."); // Menampilkan pesan konfirmasi.
                System.out.println();
                break;


                case 2:
                    System.out.println("=== Daftar Pesanan ==="); // Menampilkan semua pesanan yang telah dimasukkan.
                    int totalSementara = 0;
                    for (int i = 0; i < pesanan.size(); i++) {
                        System.out.println((i + 1) + ". " + pesanan.get(i) + " x" + jumlah.get(i) + " - Rp" + totalHarga.get(i));
                        totalSementara += totalHarga.get(i);
                }
                    System.out.println("Total Biaya Sementara: Rp" + totalSementara); // Menghitung dan menampilkan total biaya sementara.
                    System.out.println();
                    break;

                case 3:
                    int totalBiaya = 0; // Menghitung total harga dari seluruh pesanan dan menampilkannya.
                    for (int hargaPesanan : totalHarga) {
                        totalBiaya += hargaPesanan;
                }
                    System.out.println("Total biaya seluruh pesanan: Rp" + totalBiaya);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Terima kasih telah memesan di kafe kami!"); // menampilkan pesan sebelum mengakhiri program.
                    break;

                default:
                    System.out.println("Pilihan tidak valid."); // Menampilkan pesan error jika user memasukkan pilihan yang tidak tersedia.
            }
        } while (pilihan != 4); // Selama pilihan bukan 4, menu utama akan terus ditampilkan. Jika pilihan == 4, perulangan berhenti, dan program selesai.

        sc.close(); // menutup scanner.
    }
}
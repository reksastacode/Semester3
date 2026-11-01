class Produk {
    int id;
    String nama;
    int stok;

    public Produk(int id, String nama, int stok) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
    }
}

public class studiKasus {
    public static int binarySearchProsedural(Produk[] list, int targetId) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (list[mid].id == targetId) {
                return mid;
            } else if (list[mid].id < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRekursif(Produk[] list, int low, int high, int targetId) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (list[mid].id == targetId) {
            return mid;
        } else if (list[mid].id > targetId) {
            return binarySearchRekursif(list, low, mid - 1, targetId);
        } else {
            return binarySearchRekursif(list, mid + 1, high, targetId);
        }
    }

    public static void tampilkanHasilPencarian(Produk[] list, int index) {
        if (index != -1) {
            System.out.println("--- PRODUK DITEMUKAN ---");
            System.out.println("ID Produk   : " + list[index].id);
            System.out.println("Nama Produk : " + list[index].nama);
            System.out.println("Stok Produk : " + list[index].stok);
        } else {
            System.out.println("Produk tidak ditemukan");
        }
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Produk[] daftarProduk = {
            new Produk(102, "Sabun Mandi", 45),
            new Produk(105, "Sikat Gigi", 25),
            new Produk(108, "Shampo", 20),
            new Produk(112, "Sabun Cuci Piring", 35),
            new Produk(115, "Pasta Gigi", 60),
            new Produk(118, "Tisu Wajah", 50),
            new Produk(121, "Detergen", 15),
            new Produk(125, "Pembersih Lantai", 40),
            new Produk(130, "Minyak Goreng", 30),
            new Produk(135, "Gula Pasir", 50)
        };

        int idCari1 = 121;
        System.out.println("Mencari ID Produk: " + idCari1 + " (Prosedural)");
        int idx1 = binarySearchProsedural(daftarProduk, idCari1);
        tampilkanHasilPencarian(daftarProduk, idx1);

        int idCari2 = 102;
        System.out.println("Mencari ID Produk: " + idCari2 + " (Rekursif)");
        int idx2 = binarySearchRekursif(daftarProduk, 0, daftarProduk.length - 1, idCari2);
        tampilkanHasilPencarian(daftarProduk, idx2);

        int idCari3 = 999;
        System.out.println("Mencari ID Produk: " + idCari3 + " (Prosedural)");
        int idx3 = binarySearchProsedural(daftarProduk, idCari3);
        tampilkanHasilPencarian(daftarProduk, idx3);
    }
}
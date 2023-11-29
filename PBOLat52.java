/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi - Reg. Pagi
 * NIM      : 22166030
 */
class Manusia {
    void siapaKamu() {
        System.out.println("Saya Manusia");
    }
}

class Dosen extends Manusia {
    String nip;
    String nama;
    int umur;
    String mataKuliah;

    void mengajarApa() {
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang mengajar mata kuliah " + mataKuliah);
        System.out.println("");
    }

    @Override
    void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}

class Mahasiswa extends Manusia {
    String nim;
    String nama;
    int umur;
    String kelas;

    void kelasApa() {
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang belajar di kelas " + kelas);
    }

    @Override
    void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}

public class PBOLat52 {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.nip = "41227829930";
        dosen.nama = "Rizki Adam Kurniawan";
        dosen.umur = 27;
        dosen.mataKuliah = "PBO";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nim = "22166030";
        mahasiswa.nama = "Dwi";
        mahasiswa.umur = 19;
        mahasiswa.kelas = "PBO1";

        dosen.siapaKamu();
        System.out.println("NIP DOSEN: " + dosen.nip);
        dosen.mengajarApa();

        mahasiswa.siapaKamu();
        System.out.println("NIM MAHASISWA: " + mahasiswa.nim);
        mahasiswa.kelasApa();
    }
}

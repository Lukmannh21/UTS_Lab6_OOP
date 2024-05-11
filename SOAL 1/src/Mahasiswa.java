class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // ni buat setter untuk mengatur nama mahasiswa(overload)
    public void setNama(String nama) {
        this.nama = nama;
    }

    // setter buat umur mahasiswa
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // yg ni getter buat ngambil nama mahasiswa
    public String getNama() {
        return nama;
    }

    // yg ni getter umur mahasiswa
    public int getUmur() {
        return umur;
    }

    public void status() {
        System.out.println(nama + " adalah seorang mahasiswa");
    }
}

// Subclass dari si Mahasiswa
class MahasiswaUsu extends Mahasiswa {
    public MahasiswaUsu(String nama, int umur) {
        super(nama, umur);
    }

    // buat ngeoverride dari belajar()
    @Override
    public void status() {
        System.out.println(getNama() + " adalah mahasiswa USU, berumur " + getUmur());
    }
}
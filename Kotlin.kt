class Produk(
    val nama: String, var harga: Double, var stok: Int,
    val kategori: String, val deskripsi: String, val berat: Double
) {
    // Fungsi untuk menampilkan informasi detail produk
    fun tampilkanInformasi() = println("""
        Nama Produk   : $nama
        Harga         : Rp${"%,.2f".format(harga)}
        Stok Tersedia : $stok porsi
        Kategori      : $kategori
        Deskripsi     : $deskripsi
        Berat Produk  : $berat g
        ${"=".repeat(40)}
    """.trimIndent())

    // Fungsi untuk mengurangi stok produk saat dibeli
    fun beliProduk(jumlah: Int) {
        if (jumlah <= stok) stok -= jumlah.also { println("$jumlah unit produk $nama telah dibeli.") }
        else println("Maaf, stok tidak mencukupi. Stok saat ini hanya $stok unit.")
    }
}

fun main() {
    val produk1 = Produk("Rawon", 12000.0, 18, "Makanan",
        "Nasi rawon dengan toping lengkap serta beraroma unik.", 400.0)

    produk1.tampilkanInformasi()
    produk1.beliProduk(7)  // Simulasi pembelian
    produk1.tampilkanInformasi()
}

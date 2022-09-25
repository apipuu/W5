package Kasus1;

public class DataMakanan {
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}

	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	//buat constructor
//	public DataMakanan(String nama, double harga, int stok) {
//		this.nama_makanan = nama;
//		this.harga_makanan = harga;
//		this.stok = stok;
//	}
	
	public String getNama_makanan() {
		return nama_makanan;
	}

	public double getHarga_makanan() {
		return harga_makanan;
	}

	public int getStok() {
		return stok;
	}
	
	public void tampilMakanan() {
		System.out.println(nama_makanan +"["+stok+"]"+"\tRP. "+harga_makanan);
	}
	
	public void kurangiStok(int Qty) {
		stok -= Qty;
	}

}

package Kasus1;

public class Restaurant {
	private DataMakanan[] ListMakanan;
	private static byte id=0;
	public static byte getId() {
		return id;
	}

	public static void setId(byte id) {
		Restaurant.id = id;
	}

	public Restaurant() {
		this.ListMakanan = new DataMakanan[20];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		// TODO Auto-generated method stub
		this.ListMakanan[id] = new DataMakanan();
		this.ListMakanan[id].setNama_makanan(nama);
		this.ListMakanan[id].setHarga_makanan(harga);
		this.ListMakanan[id].setStok(stok);
	}
	
	public void tampilMenuMakanan() {
		System.out.println("--------------------MENU--------------------");
		for(int i=0; i<=id; i++) {
			int a = i;
			if(!isOutOfStock(i)) {
				a++;
				System.out.println(a + ". " + ListMakanan[i].getNama_makanan() + "[" + ListMakanan[i].getStok() + "]" + "\tRp." + ListMakanan[i].getHarga_makanan());
			}else {
				a++;
				System.out.println(a + ". " + ListMakanan[i].getNama_makanan() + "\t\t Stok Tidak Ada");
			}
		}
	}
	
	public void beliMakanan(int inputan, int quantity) {	
		if(!isOutOfStock(inputan)) {		
			ListMakanan[inputan].setStok(ListMakanan[inputan].getStok() - quantity);
			System.out.println(ListMakanan[inputan].getNama_makanan() + "\t" + quantity );
			TotalHarga(inputan,quantity);
		}
	}
	
	public void TotalHarga(int id_harga, int jumlahbeli) {
		double TotalBayar = ListMakanan[id_harga].getHarga_makanan() * jumlahbeli;
		System.out.println("Total Harga : " + TotalBayar);
	}
	
	public boolean isOutOfStock(int id) {
		if(this.ListMakanan[id].getStok() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void nextId() {
		id++;
		setId(id);
	}
	
	public void PesanMakanan(String NamaMakanan, int Qty) {
		for(int i=0; i<=id; i++) {
			if(NamaMakanan.equals(ListMakanan[i].getNama_makanan())) {
				if(ListMakanan[i].getStok()>= Qty) {
					System.out.println(Qty +" "+ ListMakanan[i].getNama_makanan() +" "+ "Berhasil Dibeli");
					ListMakanan[i].kurangiStok(Qty);
				}else {
					System.out.println("Stok" +ListMakanan[i].getNama_makanan()+ "habis");
				}
			}
		}
	}
	
	public void tambahMakanan() {
		this.tambahMenuMakanan("Bala-Bala\t", 1_000, 20);
		Restaurant.nextId();
		this.tambahMenuMakanan("Tempe \t", 1_000, 20);
		Restaurant.nextId();
		this.tambahMenuMakanan("Cireng\t", 1_000, 20);
		Restaurant.nextId();
		this.tambahMenuMakanan("Pastel\t", 1_000, 20);
		Restaurant.nextId();
		this.tambahMenuMakanan("Lontong\t", 1_000, 20);
		Restaurant.nextId();
		this.tambahMenuMakanan("karoket\t", 1_000, 20);
		Restaurant.nextId();
		this.tambahMenuMakanan("Risoles\t", 1_000, 20);
		Restaurant.nextId();
		this.tambahMenuMakanan("Gehu\t\t", 1_000, 20);
		Restaurant.nextId();
		this.tambahMenuMakanan("Tahu\t", 1_000, 0);
		Restaurant.nextId();
		this.tambahMenuMakanan("Molen\t", 1_000, 20);
	}
}

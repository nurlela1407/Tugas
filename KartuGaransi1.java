public class KartuGaransi1{
	private String jenis_produk;
	private String no_produk;
	private String tgl_pembelian;
	private String no_seri;
	private String nama_perusahaan;
	private String nama_pelanggan;
	private String alamat_pelanggan;
	private String nohp_pelanggan;
	private String email_pelanggan;
	private String nama_penjual;
	private String alamat_penjual;
	private String nohp_penjual;
	
	public KartuGaransi1(String jenis_produk, String no_produk, String tgl_pembelian, String no_seri, String nama_perusahaan,
	String nama_pelanggan, String alamat_pelanggan, String nohp_pelanggan, String email_pelanggan, String nama_penjual, 
	String alamat_penjual, String nohp_penjual)
	{
		this.jenis_produk = jenis_produk;
		this.no_produk = no_produk;
		this.tgl_pembelian = tgl_pembelian;
		this.no_seri = no_seri;
		this.nama_perusahaan = nama_perusahaan;
		this.nama_pelanggan = nama_pelanggan;
		this.alamat_pelanggan = alamat_pelanggan;
		this.nohp_pelanggan = nohp_pelanggan;
		this.email_pelanggan = email_pelanggan;
		this.nama_penjual = nama_penjual;
		this.alamat_penjual = alamat_penjual;
		this.nohp_penjual = nohp_penjual;
	}
	public void setJenis_produk(String jp){
		jenis_produk = jp;
	}
	public String getJenis_produk(){
		return jenis_produk;
	}
	public void setNo_produk(String nopro){
		no_produk = nopro;
	}
	public String getNo_produk(){
		return no_produk;
	}
	public void setTgl_pembelian(String tp){
		tgl_pembelian = tp;
	}
	public String getTgl_pembelian(){
		return tgl_pembelian;
	}
	public void setNo_seri(String nose){
		no_seri = nose;
	}
	public String getNo_seri(){
		return no_seri;
	}
	public void setNama_perusahaan(String naper){
		nama_perusahaan = naper;
	}
	public String getNama_perusahaan(){
		return nama_perusahaan;
	}
	public void setNama_pelanggan(String napel){
		nama_pelanggan = napel;
	}
	public String getNama_pelanggan(){
		return nama_pelanggan;
	}
	public void setAlamat_pelanggan(String apel){
		alamat_pelanggan = apel;
	}
	public String getAlamat_pelanggan(){
		return alamat_pelanggan;
	}
	public void setNohp_pelanggan(String noplang){
		nohp_pelanggan = noplang;
	}
	public String getNohp_pelanggan(){
		return nohp_pelanggan;
	}
	public void setEmail_pelanggan(String emailnya){
		email_pelanggan= emailnya;
	}
	public String getEmail_pelanggan(){
		return email_pelanggan;
	}
	public void setNama_penjual(String napen){
		nama_penjual = napen;
	}
	public String getNama_penjual(){
		return nama_penjual;
	}
	public void setAlamat_penjual(String alpen){
		alamat_penjual = alpen;
	}
	public String getAlamat_penjual(){
		return alamat_penjual;
	}
	public void setNohp_penjual(String nopenjual){
		nohp_penjual = nopenjual;
	}
	public String getNohp_penjual(){
		return nohp_penjual;
	}

	public void kg()
	{
	System.out.println("Jenis Produk\t\t: "+getJenis_produk());
	System.out.println("No Produk\t\t: "+getNo_produk());
	System.out.println("Tanggal Pembelian\t: "+getTgl_pembelian());
	System.out.println("No Seri\t\t\t: "+getNo_seri());
	System.out.println("Nama perusahaan\t\t: "+getNama_perusahaan());
	System.out.println("Nama pelanggan\t\t: "+getNama_pelanggan());
	System.out.println("Alamat Pelanggan\t: "+getAlamat_pelanggan());
	System.out.println("No Hp Pelanggan\t\t: "+getNohp_pelanggan());
	System.out.println("Email Pelanggan\t\t: "+getEmail_pelanggan());
	System.out.println("Nama Penjual\t\t: "+getNama_penjual());
	System.out.println("Alamat Penjual\t\t: "+getAlamat_penjual());
	System.out.println("No Hp Penjual\t\t: "+getNohp_penjual());
	}
	
	public void merk()
	{
		System.out.println("Merk Terbaru : Laptop HP X Envy"); 
	}
	
	public void merk(String mrk)
	{
		System.out.println(mrk);
	}

}
	
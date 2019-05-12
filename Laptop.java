class Laptop extends KartuGaransi1
{
	public Laptop(String jenis_produk, String no_produk, String tgl_pembelian, String no_seri, String nama_perusahaan,
	String nama_pelanggan, String alamat_pelanggan, String nohp_pelanggan, String email_pelanggan, String nama_penjual, 
	String alamat_penjual, String nohp_penjual)
	{
	super(jenis_produk, no_produk, tgl_pembelian, no_seri, nama_perusahaan, nama_pelanggan, alamat_pelanggan, nohp_pelanggan, email_pelanggan,
	nama_penjual, alamat_penjual, nohp_penjual);
	}
	
	public void merk ()
	{
		System.out.println("merk : HP Envy"); 
	}
}

 
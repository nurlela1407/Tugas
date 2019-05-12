class Program_KartuGaransi
{
	public static void main (String [] args)
	{
		Laptop laptop = new Laptop( "HP ENVY 13","376GV45","14 April 2019","897V5R7","BEC","Nurlela","Sukabumi", "085624838160", "nur816897@gmail.com", "Nurjanah", "Bandung", "085724773507");
		laptop.kg();
		laptop.merk();
		laptop.merk("Merk Terbaru !!!");
	}
	
	
}
package examples;

public class �rnektir {
	public static void main (String arg[]) {
		Kedi a = new Kedi();
		Kedi b = new Kedi("m�nc�r");
		a.setIsim("pembe");
		System.out.println(a.getIsim());
		System.out.println(b);
	}

}

class Kedi {
	private String isim;
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	private String soyad;
	
	Kedi(){
	}
	
	Kedi(String i){
		isim = i;
	}
}

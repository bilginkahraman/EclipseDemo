
public class main {

	public static void main(String[] args) {
		String ogrenci1="Engine";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("----------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Bilgin";
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		//Foreach
		System.out.println("----------------------");
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		double total=0;
		double[] myList= {1,15,1.3,4.3,5.6};
		double max=myList[0];
		for (double number:myList) {
			if (max<number) {
				max=number;
			}
			total = total +number;
			System.out.println(number);
			System.out.println("En Büyük"+max);
		}
		
		System.out.println("Toplam = "+total);
		System.out.println("Bilgin");
	}

}

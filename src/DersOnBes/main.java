package DersOnBes;

public class main {

	public static void main(String[] args) {

		// double[] myList=new double[4];

		double[] myList = { 1.2, 6.3, 4.3, 5.6 };

		// new le bununla arasında hiçbir fark yok
		// arka planda bir new yaratıyor kendi
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;

			}
			total += number;
			System.out.println(number);

		}

		System.out.println("toplam:" + total);
		System.out.println("en büyük:" + max);
	}

}

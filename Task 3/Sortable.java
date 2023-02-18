
abstract class Sortable {
	 public abstract int compare(Sortable b);
	 public static void shell_sort(Sortable[] a) {
		    int n = a.length;

		    // Memilih increment sequence
		    int increment = n / 2;

		    while (increment > 0) {
		        for (int i = increment; i < n; i++) {
		            int j = i;
		            Sortable temp = a[i];

		            // Menggeser elemen ke kanan jika lebih kecil dari elemen di sebelah kiri
		            while (j >= increment && a[j - increment].compare(temp) > 0) {
		                a[j] = a[j - increment];
		                j = j - increment;
		            }

		            // Menempatkan elemen yang sedang diurutkan pada posisi yang tepat
		            a[j] = temp;
		        }

		        // Mengurangi increment sequence
		        increment = increment / 2;
		    }
		}
		
}


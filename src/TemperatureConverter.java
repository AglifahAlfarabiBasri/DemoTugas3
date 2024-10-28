import java.util.Scanner;


class TemperatureConverter {


    public static final int Fahrenheit_option = 1;
    public static final int kelvin_option = 2;
    public static final int reamur_option = 3;

    private static final double Fahrenheit_Multiplier = 9.0 / 5.0;
    private static final double Fahrenheit_offset = 32;
    private static final double Kelvin_offset = 273.15;
    private static final double Reamur_Multiplier = 4.0 / 5.0;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan suhu dalam Celcius: ");
        double celcius = scanner.nextDouble();

        System.out.println("Pilih konversi: ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Reamur");

        int pilihan = scanner.nextInt();
        convertTemperature(pilihan, celcius);
    }

    /**
     * Mengonversi suhu berdasarkan pilihan pengguna.
     *
     * @param pilihan angka yang menunjukkan jenis konversi (1 untuk Fahrenheit, 2 untuk Kelvin, 3 untuk Reamur)
     * @param celcius nilai suhu dalam Celcius yang akan dikonversi
     */
    private static void convertTemperature(int pilihan, double celcius) {
        switch (pilihan) {
            case Fahrenheit_option -> ConvertToFahrenheit(celcius);
            case kelvin_option -> ConvertToKelvin(celcius);
            case reamur_option -> ConvertToReamur(celcius);
            default -> System.out.println("Pilihan tidak valid!");
        }
    }

    /**
     * Mengonversi suhu dari Celcius ke Reamur.
     *
     * @param celcius nilai suhu dalam Celcius yang akan dikonversi
     */

    private static void ConvertToReamur(double celcius) {
        double reamur = celcius * Reamur_Multiplier;
        System.out.println("Suhu dalam Reamur: " + reamur);
    }

    private static void ConvertToKelvin(double celcius) {
        double kelvin = celcius + Kelvin_offset;
        System.out.println("Suhu dalam Kelvin: " + kelvin);
    }
    /**
     * Mengonversi suhu dari Celcius ke Fahrenheit.
     *
     * @param celcius nilai suhu dalam Celcius yang akan dikonversi
     */
    private static void ConvertToFahrenheit(double celcius) {
        double fahrenheit = (celcius * Fahrenheit_Multiplier) + Fahrenheit_offset;
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
    }
}

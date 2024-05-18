import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rumus calc = new Rumus();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih rumus yang ingin dihitung:");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Volume Bola");
        System.out.println("3. Energi Kinetik");
        System.out.println("4. Kecepatan Akhir (GLBB)");
        System.out.println("5. Gaya (Newton's Second Law)");
        System.out.println("6. Tekanan");

        System.out.print("Masukkan pilihan (1-6): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Masukkan radius: ");
                double radiusL = scanner.nextDouble();
                double circleArea = calc.calculate(radiusL);
                System.out.println("Luas lingkaran: " + circleArea);
                break;

            case 2:
                System.out.print("Masukkan radius: ");
                double radiusSphere = scanner.nextDouble();
                double sphereVolume = calc.calculate(radiusSphere, true);
                System.out.println("Volume bola: " + sphereVolume);
                break;

            case 3:
                System.out.print("Masukkan massa (kg): ");
                double massa = scanner.nextDouble();
                System.out.print("Masukkan kecepatan (m/s): ");
                double velocity = scanner.nextDouble();
                double EnergiKinetik = calc.calculate(massa, velocity);
                System.out.println("Energi kinetik: " + EnergiKinetik);
                break;

            case 4:
                System.out.print("Masukkan kecepatan awal (m/s): ");
                double KecepatanAwal = scanner.nextDouble();
                System.out.print("Masukkan percepatan (m/s^2): ");
                double Percepatan = scanner.nextDouble();
                System.out.print("Masukkan waktu (s): ");
                double time = scanner.nextDouble();
                double finalVelocity = calc.calculate(KecepatanAwal, Percepatan, time);
                System.out.println("Kecepatan akhir: " + finalVelocity);
                break;

            case 5:
                System.out.print("Masukkan massa (kg): ");
                double massaF = scanner.nextDouble();
                System.out.print("Masukkan percepatan (m/s^2): ");
                double percepatanF = scanner.nextDouble();
                double gaya = calc.calculateGaya(massaF, percepatanF);
                System.out.println("Gaya: " + gaya);
                break;

            case 6:
                System.out.print("Masukkan gaya (N): ");
                double forcePressure = scanner.nextDouble();
                System.out.print("Masukkan luas area (m^2): ");
                double area = scanner.nextDouble();
                double pressure = calc.calculateTekanan(forcePressure, area);
                System.out.println("Tekanan: " + pressure);
                break;

            default:
                System.out.println("Pilihan gk valid, periksa kembali");
                break;
        }

        scanner.close();
    }
}
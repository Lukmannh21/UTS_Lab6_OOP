class Rumus {

    // rumus menghitung luas lingkaran
    public double calculate(double radiusL) {
        return Math.PI * radiusL * radiusL;
    }

    // menghitung volume bola
    public double calculate(double radius, boolean isSphere) {
        if (isSphere) {
            return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
        return 0;
    }

    // menghitung energi kinetik
    public double calculate(double massa, double velocity) {
        return 0.5 * massa * velocity * velocity;
    }

    // menghitung kecepatan akhir di GLBB
    public double calculate(double KecepatanAwal, double Percepatan, double time) {
        return KecepatanAwal + (Percepatan * time);
    }

    // menghitung gaya
    public double calculateGaya(double massaF, double PercepatanF) {
        return massaF * PercepatanF;
    }

    // menghitung tekanan
    public double calculateTekanan(double force, double area) {
        return force / area;
    }
}
package sample.Model;

public class Region extends Location {
    private double pm10, co, pm25, so2, no2, psi ,o3;

    public Region(String name, double pm10, double co, double pm25, double so2, double no2, double psi, double o3) {
        super(name);
        this.pm10 = pm10;
        this.co = co;
        this.pm25 = pm25;
        this.so2 = so2;
        this.no2 = no2;
        this.psi = psi;
        this.o3 = o3;
    }

    public double getPm10() {
        return pm10;
    }

    public double getO3() {
        return o3;
    }

    public double getCo() {
        return co;
    }

    public double getPm25() {
        return pm25;
    }

    public double getSo2() {
        return so2;
    }

    public double getNo2() {
        return no2;
    }

    public double getPsi() {
        return psi;
    }

    @Override
    public String toString() {
        return "Region{" +
                "pm10=" + pm10 +
                ", co=" + co +
                ", pm25=" + pm25 +
                ", so2=" + so2 +
                ", no2=" + no2 +
                ", psi=" + psi +
                ", o3=" + o3 +
                ", name='" + name + '\'' +
                "}\n";
    }
}

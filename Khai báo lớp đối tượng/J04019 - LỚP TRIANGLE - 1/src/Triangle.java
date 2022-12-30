public class Triangle {
    private Point A, B, C;
    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public boolean valid() {
        double AB = Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
        double BC = Math.sqrt(Math.pow(B.getX() - C.getX(), 2) + Math.pow(B.getY() - C.getY(), 2));
        double CA = Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2));
        if (AB + BC > CA && BC + CA > AB && AB + CA > BC) return true;
        else return false;
    }
    public String getPerimeter(){
        double AB = Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
        double BC = Math.sqrt(Math.pow(B.getX() - C.getX(), 2) + Math.pow(B.getY() - C.getY(), 2));
        double CA = Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2));
        return String.format("%.3f", AB + BC + CA);
    }
}

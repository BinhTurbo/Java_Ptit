public class Point3D {
    private int x, y, z;
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D) {
        Point3D AB = new Point3D(B.x - A.x, B.y - A.y, B.z - A.z);
        Point3D AC = new Point3D(C.x - A.x, C.y - A.y, C.z - A.z);
        Point3D AD = new Point3D(D.x - A.x, D.y - A.y, D.z - A.z);
        Point3D temp = new Point3D(AB.y * AC.z - AC.y * AB.z, AB.z * AC.x - AC.z * AB.x, AB.x * AC.y - AC.x * AB.y);
        if (temp.x * AD.x + temp.y * AD.y + temp.z * AD.z == 0) return true;
        return false;
    }
}

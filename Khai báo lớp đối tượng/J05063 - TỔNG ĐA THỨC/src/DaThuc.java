public class DaThuc {
    private int[] a;
    public DaThuc(){
        a = new int[10001];
    }
    public DaThuc(String nextLine) {
        a = new int[10001];
        String[] s = nextLine.split("\\s+");
        for(String i : s) {
            if(i.length() > 1) {
                int k = 0;
                int[] x = new int[2];
                for(int j = 0; j < i.length(); j++) {
                    if(i.charAt(j) >= '0' && i.charAt(j) <= '9') {
                        x[k] = x[k]*10 + Integer.parseInt(String.valueOf(i.charAt(j)));
                    }
                    else {
                        k = 1;
                    }
                }
                a[x[1]] = x[0];
            } 
        }
    }
    public DaThuc cong(DaThuc q) {
        DaThuc res = new DaThuc();
        for(int i = 0; i < 10001; i++) {
            res.a[i] = this.a[i] + q.a[i];
        } 
        return res;
    }
    
    @Override
    public String toString() {
        String s = "";
        int cnt = 0;
        for(int i = 0; i < 10001; i++) {
            if(a[i] != 0) {
                cnt++;
            }
        }
        for(int i = 10000; i >= 0; i--) {
            if(a[i] != 0) {
                s += Integer.toString(a[i]) + "*x^" + Integer.toString(i);
                if(cnt > 1) {
                    s +=  " + ";
                    cnt--;
                }
            }
            
        }
        return s.trim();
    }
}

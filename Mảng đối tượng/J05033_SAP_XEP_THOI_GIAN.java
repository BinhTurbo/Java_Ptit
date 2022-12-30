import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J05033_SAP_XEP_THOI_GIAN {
	int h,m,s;
	public J05033_SAP_XEP_THOI_GIAN(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<J05033_SAP_XEP_THOI_GIAN> l = new ArrayList<J05033_SAP_XEP_THOI_GIAN>();
		for(int i=0;i<n;i++)
		{
			int h = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			l.add(new J05033_SAP_XEP_THOI_GIAN(h, m, s));
		}
		Collections.sort(l,new Comparator<J05033_SAP_XEP_THOI_GIAN>(){
			@Override
			public int compare(J05033_SAP_XEP_THOI_GIAN a, J05033_SAP_XEP_THOI_GIAN b)
			{
				if(a.h<b.h) return -1;
				else if (a.h==b.h&&a.m<b.m) return -1;
				else if(a.h==b.h&&a.m==b.m&&a.s<b.s) return -1;
				return 1;
				
			}
		});
		for(J05033_SAP_XEP_THOI_GIAN a:l) 
		{
			System.out.println(a.h + " " + a.m + " " + a.s);
		}
	}
}
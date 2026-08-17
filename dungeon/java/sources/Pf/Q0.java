package Pf;

/* JADX INFO: loaded from: classes3.dex */
public class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9092b = 0;

    public Q0(String str) {
        this.f9091a = str;
    }

    public boolean a() {
        return this.f9092b != -1;
    }

    public String b() {
        int i10 = this.f9092b;
        if (i10 == -1) {
            return null;
        }
        int iIndexOf = this.f9091a.indexOf(46, i10);
        if (iIndexOf == -1) {
            String strSubstring = this.f9091a.substring(this.f9092b);
            this.f9092b = -1;
            return strSubstring;
        }
        String strSubstring2 = this.f9091a.substring(this.f9092b, iIndexOf);
        this.f9092b = iIndexOf + 1;
        return strSubstring2;
    }
}

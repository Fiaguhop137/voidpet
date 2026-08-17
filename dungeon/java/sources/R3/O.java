package R3;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f10674f;

    public O(int i10, int i11, String str, String str2, String str3) {
        this.f10669a = i10;
        this.f10670b = i11;
        this.f10671c = str;
        this.f10672d = str2;
        this.f10673e = str3;
    }

    public O a(float f10) {
        O o10 = new O((int) (this.f10669a * f10), (int) (this.f10670b * f10), this.f10671c, this.f10672d, this.f10673e);
        Bitmap bitmap = this.f10674f;
        if (bitmap != null) {
            o10.g(Bitmap.createScaledBitmap(bitmap, o10.f10669a, o10.f10670b, true));
        }
        return o10;
    }

    public Bitmap b() {
        return this.f10674f;
    }

    public String c() {
        return this.f10672d;
    }

    public int d() {
        return this.f10670b;
    }

    public String e() {
        return this.f10671c;
    }

    public int f() {
        return this.f10669a;
    }

    public void g(Bitmap bitmap) {
        this.f10674f = bitmap;
    }
}

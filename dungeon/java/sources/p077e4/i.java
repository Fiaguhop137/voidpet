package p077e4;

import p128h1.n;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f40373a = new String[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f40374b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40375c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40376d = 0;

    public void a(String str) {
        int i10 = this.f40375c;
        if (i10 == 5) {
            this.f40376d++;
            return;
        }
        this.f40373a[i10] = str;
        this.f40374b[i10] = System.nanoTime();
        n.a(str);
        this.f40375c++;
    }

    public float b(String str) {
        int i10 = this.f40376d;
        if (i10 > 0) {
            this.f40376d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f40375c - 1;
        this.f40375c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f40373a[i11])) {
            n.b();
            return (System.nanoTime() - this.f40374b[this.f40375c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f40373a[this.f40375c] + ".");
    }
}

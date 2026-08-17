package X3;

import R3.C1364k;
import p323s.C4125z;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f15286b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4125z f15287a = new C4125z(20);

    g() {
    }

    public static g b() {
        return f15286b;
    }

    public C1364k a(String str) {
        if (str == null) {
            return null;
        }
        return (C1364k) this.f15287a.c(str);
    }

    public void c(String str, C1364k c1364k) {
        if (str == null) {
            return;
        }
        this.f15287a.d(str, c1364k);
    }
}

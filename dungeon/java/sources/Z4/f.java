package Z4;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SoftReference f18775a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SoftReference f18776b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SoftReference f18777c = null;

    public void a() {
        SoftReference softReference = this.f18775a;
        if (softReference != null) {
            softReference.clear();
            this.f18775a = null;
        }
        SoftReference softReference2 = this.f18776b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f18776b = null;
        }
        SoftReference softReference3 = this.f18777c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f18777c = null;
        }
    }

    public Object b() {
        SoftReference softReference = this.f18775a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(Object obj) {
        this.f18775a = new SoftReference(obj);
        this.f18776b = new SoftReference(obj);
        this.f18777c = new SoftReference(obj);
    }
}

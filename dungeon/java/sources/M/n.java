package M;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final int a(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final L.e b() {
        return l.f6662c.a();
    }

    public static final Object[] c(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i10) {
        return (i10 - 1) & (-32);
    }
}

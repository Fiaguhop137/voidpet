package p143hg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static int a(int i10) {
        int i11 = i10 & 65535;
        int i12 = (i11 | (i11 << 8)) & 16711935;
        int i13 = (i12 | (i12 << 4)) & 252645135;
        int i14 = (i13 | (i13 << 2)) & 858993459;
        return (i14 | (i14 << 1)) & 1431655765;
    }
}

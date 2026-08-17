package p143hg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static int a(int i10) {
        int i11 = (2 - (i10 * i10)) * i10;
        int i12 = i11 * (2 - (i10 * i11));
        int i13 = i12 * (2 - (i10 * i12));
        return i13 * (2 - (i10 * i13));
    }
}

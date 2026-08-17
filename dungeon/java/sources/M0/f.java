package M0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i10, int i11, int i12) {
        return i10 | (i11 << 8) | (i12 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(int i10) {
        return i10 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i10) {
        return (i10 >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i10) {
        return (i10 >> 16) & 255;
    }
}

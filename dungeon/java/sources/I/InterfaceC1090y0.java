package I;

/* JADX INFO: renamed from: I.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1090y0 extends InterfaceC1046j0, A0 {
    @Override // I.InterfaceC1046j0
    int f();

    @Override // I.d2
    default Integer getValue() {
        return Integer.valueOf(f());
    }

    void o(int i10);

    default void r(int i10) {
        o(i10);
    }

    @Override // I.A0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        r(((Number) obj).intValue());
    }
}

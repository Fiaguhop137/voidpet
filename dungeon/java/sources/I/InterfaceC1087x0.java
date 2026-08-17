package I;

/* JADX INFO: renamed from: I.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1087x0 extends InterfaceC1025c0, A0 {
    @Override // I.d2
    default Float getValue() {
        return Float.valueOf(j());
    }

    @Override // I.InterfaceC1025c0
    float j();

    @Override // I.A0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        t(((Number) obj).floatValue());
    }

    default void t(float f10) {
        u(f10);
    }

    void u(float f10);
}

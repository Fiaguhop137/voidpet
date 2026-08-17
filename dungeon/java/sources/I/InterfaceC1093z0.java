package I;

/* JADX INFO: renamed from: I.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1093z0 extends d2, A0 {
    @Override // I.d2
    default Long getValue() {
        return Long.valueOf(k());
    }

    long k();

    default void q(long j10) {
        y(j10);
    }

    @Override // I.A0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        q(((Number) obj).longValue());
    }

    void y(long j10);
}

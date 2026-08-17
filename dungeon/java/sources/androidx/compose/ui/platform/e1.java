package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public interface e1 {
    long a();

    long b();

    long c();

    default long d() {
        float f10 = 48;
        return O0.i.a(O0.h.o(f10), O0.h.o(f10));
    }

    default float e() {
        return Float.MAX_VALUE;
    }

    float f();
}

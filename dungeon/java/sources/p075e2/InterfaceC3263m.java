package p075e2;

import Y1.b;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: e2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3263m {

    /* JADX INFO: renamed from: e2.m$a */
    public static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40334a;

        public a(Throwable th, int i10) {
            super(th);
            this.f40334a = i10;
        }
    }

    static void d(InterfaceC3263m interfaceC3263m, InterfaceC3263m interfaceC3263m2) {
        if (interfaceC3263m == interfaceC3263m2) {
            return;
        }
        if (interfaceC3263m2 != null) {
            interfaceC3263m2.c(null);
        }
        if (interfaceC3263m != null) {
            interfaceC3263m.e(null);
        }
    }

    UUID a();

    boolean b();

    void c(t.a aVar);

    void e(t.a aVar);

    a f();

    b g();

    int getState();

    Map h();

    boolean i(String str);
}

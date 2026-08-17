package p222m6;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f49147a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f49148b = h.class;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f49149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49151c;

        public final int a() {
            return this.f49150b;
        }

        public final int b() {
            return this.f49151c;
        }

        public final boolean c() {
            return this.f49149a;
        }

        public final void d(int i10) {
            this.f49150b = i10;
        }

        public final void e(int i10) {
            this.f49151c = i10;
        }

        public final void f(boolean z10) {
            this.f49149a = z10;
        }
    }

    private h() {
    }

    public static final int a(int i10) {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        if (i10 == 3) {
            return 180;
        }
        if (i10 != 6) {
            return i10 != 8 ? 0 : 270;
        }
        return 90;
    }

    private final int b(InputStream inputStream, int i10, boolean z10) {
        if (i10 >= 10 && g.a(inputStream, 2, z10) == 3 && g.a(inputStream, 4, z10) == 1) {
            return g.a(inputStream, 2, z10);
        }
        return 0;
    }

    private final int c(InputStream inputStream, int i10, boolean z10, int i11) throws IOException {
        if (i10 < 14) {
            return 0;
        }
        int iA = g.a(inputStream, 2, z10);
        int i12 = i10 - 2;
        while (true) {
            int i13 = iA - 1;
            if (iA <= 0 || i12 < 12) {
                break;
            }
            int i14 = i12 - 2;
            if (g.a(inputStream, 2, z10) == i11) {
                return i14;
            }
            inputStream.skip(10L);
            i12 -= 12;
            iA = i13;
        }
        return 0;
    }

    public static final int d(InputStream stream, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        a aVar = new a();
        h hVar = f49147a;
        int iE = hVar.e(stream, i10, aVar);
        int iB = aVar.b() - 8;
        if (iE == 0 || iB > iE) {
            return 0;
        }
        stream.skip(iB);
        return hVar.b(stream, hVar.c(stream, iE - iB, aVar.c(), 274), aVar.c());
    }

    private final int e(InputStream inputStream, int i10, a aVar) {
        if (i10 <= 8) {
            return 0;
        }
        aVar.d(g.a(inputStream, 4, false));
        if (aVar.a() != 1229531648 && aVar.a() != 1296891946) {
            W4.a.i(f49148b, "Invalid TIFF header");
            return 0;
        }
        aVar.f(aVar.a() == 1229531648);
        aVar.e(g.a(inputStream, 4, aVar.c()));
        int i11 = i10 - 8;
        if (aVar.b() >= 8 && aVar.b() - 8 <= i11) {
            return i11;
        }
        W4.a.i(f49148b, "Invalid offset");
        return 0;
    }
}

package p214lg;

import Vf.p;
import Xf.h;

/* JADX INFO: loaded from: classes3.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f48763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f48764b;

    static class a extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p f48765c;

        a() {
            super(64, 64);
            this.f48765c = Zf.b.b(Yf.a.k());
        }
    }

    static class b extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h f48766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f48767d;

        b() {
            super(168, 136);
            this.f48766c = new h(128);
            this.f48767d = new h(256);
        }
    }

    f(int i10, int i11) {
        this.f48763a = i10;
        this.f48764b = i11;
    }
}

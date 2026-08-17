package p232mg;

import Vf.p;
import Xf.d;
import Xf.f;
import Xf.h;

/* JADX INFO: loaded from: classes3.dex */
abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f49396a;

    static class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f49397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Xf.g f49398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p f49399d;

        a() {
            super(64);
            this.f49397b = new d();
            this.f49398c = new Xf.g();
            this.f49399d = Zf.b.b(Yf.a.k());
        }
    }

    static class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f49400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f f49401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f f49402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final h f49403e;

        b() {
            super(168);
            this.f49400b = new h(128);
            this.f49403e = new h(256);
            this.f49402d = new f(256);
            this.f49401c = new f(512);
        }
    }

    g(int i10) {
        this.f49396a = i10;
    }
}

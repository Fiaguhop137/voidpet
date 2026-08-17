package p214lg;

import Xf.h;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecureRandom f48725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f48726b = new h(128);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f48727c = new h(256);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f48729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f48730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f48731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f48732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f48733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f48734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f48735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f48736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f48737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f48738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f48739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f48740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f48741q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f48742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f48743s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f48744t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f48745u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final f f48746v;

    a(int i10, SecureRandom secureRandom, boolean z10) {
        int i11;
        int i12;
        int i13;
        this.f48732h = i10;
        if (i10 != 2) {
            if (i10 == 3) {
                this.f48733i = 6;
                this.f48734j = 5;
                this.f48735k = 4;
                this.f48736l = 49;
                this.f48737m = 196;
                this.f48738n = 524288;
                this.f48739o = 261888;
                this.f48740p = 55;
                this.f48729e = 640;
                this.f48730f = 128;
                this.f48731g = 128;
                i13 = 48;
            } else {
                if (i10 != 5) {
                    throw new IllegalArgumentException("The mode " + i10 + "is not supported by Crystals Dilithium!");
                }
                this.f48733i = 8;
                this.f48734j = 7;
                this.f48735k = 2;
                this.f48736l = 60;
                this.f48737m = 120;
                this.f48738n = 524288;
                this.f48739o = 261888;
                this.f48740p = 75;
                this.f48729e = 640;
                this.f48730f = 128;
                this.f48731g = 96;
                i13 = 64;
            }
            this.f48741q = i13;
        } else {
            this.f48733i = 4;
            this.f48734j = 4;
            this.f48735k = 2;
            this.f48736l = 39;
            this.f48737m = 78;
            this.f48738n = 131072;
            this.f48739o = 95232;
            this.f48740p = 80;
            this.f48729e = 576;
            this.f48730f = 192;
            this.f48731g = 96;
            this.f48741q = 32;
        }
        this.f48746v = z10 ? new f.a() : new f.b();
        this.f48725a = secureRandom;
        int i14 = this.f48740p;
        int i15 = this.f48733i;
        int i16 = i14 + i15;
        this.f48728d = i16;
        this.f48742r = (i15 * 320) + 32;
        int i17 = this.f48734j;
        int i18 = this.f48731g;
        this.f48743s = (i17 * i18) + 96 + (i18 * i15) + (i15 * 416);
        this.f48744t = this.f48741q + (i17 * this.f48729e) + i16;
        int i19 = this.f48738n;
        if (i19 == 131072) {
            i11 = this.f48746v.f48764b;
            i12 = i11 + 575;
        } else {
            if (i19 != 524288) {
                throw new RuntimeException("Wrong Dilithium Gamma1!");
            }
            i11 = this.f48746v.f48764b;
            i12 = i11 + 639;
        }
        this.f48745u = i12 / i11;
    }

    int a() {
        return this.f48733i;
    }

    int b() {
        return this.f48734j;
    }

    int c() {
        return this.f48731g;
    }
}

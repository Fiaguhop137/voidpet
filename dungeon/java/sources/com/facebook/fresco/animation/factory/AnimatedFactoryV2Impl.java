package com.facebook.fresco.animation.factory;

import T4.g;
import T4.i;
import U5.n;
import V4.d;
import V4.o;
import W5.InterfaceC1613p;
import android.content.Context;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import p025b6.e;
import p025b6.k;
import p025b6.p;

/* JADX INFO: loaded from: classes2.dex */
@d
public class AnimatedFactoryV2Impl implements P5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T5.d f28695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1613p f28696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f28697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f28698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private P5.d f28699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Q5.b f28700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private R5.a f28701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p007a6.a f28702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f28703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f28705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28706l;

    class a implements Z5.c {
        a() {
        }

        @Override // Z5.c
        public e a(k kVar, int i10, p pVar, V5.d dVar) {
            return AnimatedFactoryV2Impl.this.n().b(kVar, dVar, dVar.f14079i);
        }
    }

    class b implements Q5.b {
        b() {
        }

        @Override // Q5.b
        public O5.a a(O5.e eVar, Rect rect) {
            return new Q5.a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f28698d);
        }
    }

    class c implements Q5.b {
        c() {
        }

        @Override // Q5.b
        public O5.a a(O5.e eVar, Rect rect) {
            return new Q5.a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f28698d);
        }
    }

    @d
    public AnimatedFactoryV2Impl(T5.d dVar, InterfaceC1613p interfaceC1613p, n nVar, boolean z10, boolean z11, int i10, int i11, g gVar) {
        this.f28695a = dVar;
        this.f28696b = interfaceC1613p;
        this.f28697c = nVar;
        this.f28704j = i10;
        this.f28705k = z11;
        this.f28698d = z10;
        this.f28703i = gVar;
        this.f28706l = i11;
    }

    public static /* synthetic */ Integer e() {
        return 2;
    }

    public static /* synthetic */ Integer f() {
        return 3;
    }

    private P5.d j() {
        return new P5.e(new c(), this.f28695a, this.f28705k);
    }

    private F5.d k() {
        F5.b bVar = new F5.b();
        ExecutorService dVar = this.f28703i;
        if (dVar == null) {
            dVar = new T4.d(this.f28696b.d());
        }
        F5.c cVar = new F5.c();
        V4.n nVar = o.f14063b;
        return new F5.d(l(), i.h(), dVar, RealtimeSinceBootClock.get(), this.f28695a, this.f28697c, bVar, cVar, nVar, o.a(Boolean.valueOf(this.f28705k)), o.a(Boolean.valueOf(this.f28698d)), o.a(Integer.valueOf(this.f28704j)), o.a(Integer.valueOf(this.f28706l)));
    }

    private Q5.b l() {
        if (this.f28700f == null) {
            this.f28700f = new b();
        }
        return this.f28700f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public R5.a m() {
        if (this.f28701g == null) {
            this.f28701g = new R5.a();
        }
        return this.f28701g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public P5.d n() {
        if (this.f28699e == null) {
            this.f28699e = j();
        }
        return this.f28699e;
    }

    @Override // P5.a
    public p007a6.a a(Context context) {
        if (this.f28702h == null) {
            this.f28702h = k();
        }
        return this.f28702h;
    }

    @Override // P5.a
    public Z5.c b() {
        return new F5.a(this);
    }

    @Override // P5.a
    public Z5.c c() {
        return new a();
    }
}

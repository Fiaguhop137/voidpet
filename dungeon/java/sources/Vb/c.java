package Vb;

import Ad.v;
import Rb.e;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.g;
import kotlin.reflect.o;
import p013ac.s;
import p067dc.f;
import p067dc.h;
import p157ic.C3594b;
import p157ic.C3596d;
import p157ic.P;
import p157ic.X;
import p157ic.Y;
import p157ic.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rb.d f14246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f14247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final kotlin.reflect.d f14248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C3594b f14249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private s f14250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f14251p;

    /* synthetic */ class a extends AbstractC3975l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14252a = new a();

        a() {
            super(2, SharedObject.class, "onStartListeningToEvent", "onStartListeningToEvent(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m((SharedObject) obj, (String) obj2);
            return Unit.f48228a;
        }

        public final void m(SharedObject p10, String p11) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            Intrinsics.checkNotNullParameter(p11, "p1");
            p10.m(p11);
        }
    }

    /* synthetic */ class b extends AbstractC3975l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14253a = new b();

        b() {
            super(2, SharedObject.class, "onStopListeningToEvent", "onStopListeningToEvent(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m((SharedObject) obj, (String) obj2);
            return Unit.f48228a;
        }

        public final void m(SharedObject p10, String p11) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            Intrinsics.checkNotNullParameter(p11, "p1");
            p10.o(p11);
        }
    }

    /* JADX INFO: renamed from: Vb.c$c, reason: collision with other inner class name */
    public static final class C0197c implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0197c f14254a = new C0197c();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return F.n(String.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Rb.d appContext, String name, kotlin.reflect.d ownerClass, C3594b ownerType, a0 a0Var) {
        super(a0Var);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ownerClass, "ownerClass");
        Intrinsics.checkNotNullParameter(ownerType, "ownerType");
        this.f14246k = appContext;
        this.f14247l = name;
        this.f14248m = ownerClass;
        this.f14249n = ownerType;
        this.f14251p = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(g gVar, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
        ((Function2) gVar).invoke(objArr[0], objArr[1]);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Object[] it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f48228a;
    }

    public final void A(s sVar) {
        this.f14250o = sVar;
    }

    public final d w() {
        boolean zB = Intrinsics.b(this.f14248m, F.b(Unit.class));
        boolean z10 = !zB && p121gc.d.a(this.f14248m);
        boolean z11 = !zB && p121gc.g.a(this.f14248m);
        Object next = null;
        if (p() != null && z10) {
            for (Pair pair : CollectionsKt.o(v.a("__expo_onStartListeningToEvent", a.f14252a), v.a("__expo_onStopListeningToEvent", b.f14253a))) {
                String str = (String) pair.getFirst();
                g gVar = (g) pair.getSecond();
                C3594b c3594b = this.f14249n;
                C3594b c3594b2 = (C3594b) C3596d.f43900a.a().get(new Pair(F.b(String.class), Boolean.FALSE));
                if (c3594b2 == null) {
                    c3594b2 = new C3594b(new P(F.b(String.class), false, C0197c.f14254a), null);
                }
                C3594b[] c3594bArr = {c3594b, c3594b2};
                Y y10 = Y.f43891a;
                X x10 = (X) y10.a().get(F.b(Unit.class));
                if (x10 == null) {
                    x10 = new X(F.b(Unit.class));
                    y10.a().put(F.b(Unit.class), x10);
                }
                s sVar = new s(str, c3594bArr, x10, new Vb.a(gVar));
                sVar.d(false);
                r().put(str, sVar);
            }
        }
        h hVarL = l();
        List list = this.f14251p;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            while (it2.hasNext()) {
                next = ((h) next).i((h) it2.next());
            }
        }
        h hVarI = hVarL.i((h) next);
        e eVarE = hVarI.e();
        while (eVarE.hasNext()) {
            p013ac.a aVar = (p013ac.a) eVarE.next();
            aVar.l(this.f14249n.g());
            aVar.k(true);
        }
        if (!zB && this.f14250o == null && !z11) {
            throw new IllegalArgumentException("constructor cannot be null");
        }
        s sVar2 = this.f14250o;
        if (sVar2 == null) {
            C3594b[] c3594bArr2 = new C3594b[0];
            Y y11 = Y.f43891a;
            X x11 = (X) y11.a().get(F.b(Unit.class));
            if (x11 == null) {
                x11 = new X(F.b(Unit.class));
                y11.a().put(F.b(Unit.class), x11);
            }
            sVar2 = new s("constructor", c3594bArr2, x11, new Vb.b());
        }
        sVar2.k(true);
        sVar2.l(this.f14249n.g());
        return new d(this.f14247l, sVar2, hVarI, z11);
    }

    public final C3594b z() {
        return this.f14249n;
    }
}

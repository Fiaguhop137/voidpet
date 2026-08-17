package Ud;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ud.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1528k0 extends B0 implements kotlin.reflect.l, kotlin.reflect.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Lazy f13623q;

    /* JADX INFO: renamed from: Ud.k0$a */
    public static final class a extends K0.d implements kotlin.reflect.h.a, Function1 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final C1528k0 f13624j;

        public a(C1528k0 property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f13624j = property;
        }

        @Override // kotlin.reflect.k.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public C1528k0 m() {
            return this.f13624j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Sd.a {
            j0(obj);
            return Unit.f48228a;
        }

        public void j0(Object obj) throws Sd.a {
            m().u0(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528k0(AbstractC1514d0 container, p015ae.Z descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f13623q = Ad.j.a(Ad.m.PUBLICATION, new C1526j0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a r0(C1528k0 c1528k0) {
        return new a(c1528k0);
    }

    @Override // kotlin.reflect.h
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public a h() {
        return (a) this.f13623q.getValue();
    }

    public void u0(Object obj) throws Sd.a {
        h().call(obj);
    }
}

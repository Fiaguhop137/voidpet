package Ud;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ud.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1536o0 extends H0 implements kotlin.reflect.n, kotlin.reflect.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Lazy f13642q;

    /* JADX INFO: renamed from: Ud.o0$a */
    public static final class a extends K0.d implements kotlin.reflect.h.a, Md.n {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final C1536o0 f13643j;

        public a(C1536o0 property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f13643j = property;
        }

        @Override // kotlin.reflect.k.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public C1536o0 m() {
            return this.f13643j;
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws Sd.a {
            j0(obj, obj2, obj3);
            return Unit.f48228a;
        }

        public void j0(Object obj, Object obj2, Object obj3) throws Sd.a {
            m().u0(obj, obj2, obj3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536o0(AbstractC1514d0 container, p015ae.Z descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f13642q = Ad.j.a(Ad.m.PUBLICATION, new C1534n0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a r0(C1536o0 c1536o0) {
        return new a(c1536o0);
    }

    @Override // kotlin.reflect.h
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public a h() {
        return (a) this.f13642q.getValue();
    }

    public void u0(Object obj, Object obj2, Object obj3) throws Sd.a {
        h().call(obj, obj2, obj3);
    }
}

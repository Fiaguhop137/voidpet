package Ud;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ud.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1532m0 extends E0 implements kotlin.reflect.i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Lazy f13630q;

    /* JADX INFO: renamed from: Ud.m0$a */
    public static final class a extends K0.d implements kotlin.reflect.i.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final C1532m0 f13631j;

        public a(C1532m0 property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f13631j = property;
        }

        @Override // kotlin.reflect.k.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public C1532m0 m() {
            return this.f13631j;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Sd.a {
            j0(obj, obj2);
            return Unit.f48228a;
        }

        public void j0(Object obj, Object obj2) throws Sd.a {
            m().u0(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532m0(AbstractC1514d0 container, p015ae.Z descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f13630q = Ad.j.a(Ad.m.PUBLICATION, new C1530l0(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532m0(AbstractC1514d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f13630q = Ad.j.a(Ad.m.PUBLICATION, new C1530l0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a r0(C1532m0 c1532m0) {
        return new a(c1532m0);
    }

    @Override // kotlin.reflect.i, kotlin.reflect.h
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public a h() {
        return (a) this.f13630q.getValue();
    }

    public void u0(Object obj, Object obj2) throws Sd.a {
        h().call(obj, obj2);
    }
}

package Ud;

import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC3967d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class H0 extends K0 implements kotlin.reflect.n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Lazy f13480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Lazy f13481p;

    public static final class a extends K0.c implements kotlin.reflect.n.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final H0 f13482j;

        public a(H0 property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f13482j = property;
        }

        @Override // kotlin.reflect.k.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public H0 m() {
            return this.f13482j;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(Object obj, Object obj2) {
            return m().s(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(AbstractC1514d0 container, p015ae.Z descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Ad.m mVar = Ad.m.PUBLICATION;
        this.f13480o = Ad.j.a(mVar, new F0(this));
        this.f13481p = Ad.j.a(mVar, new G0(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(AbstractC1514d0 container, String name, String signature) {
        super(container, name, signature, AbstractC3967d.NO_RECEIVER);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Ad.m mVar = Ad.m.PUBLICATION;
        this.f13480o = Ad.j.a(mVar, new F0(this));
        this.f13481p = Ad.j.a(mVar, new G0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a m0(H0 h10) {
        return new a(h10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member p0(H0 h10) {
        return h10.f0();
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return s(obj, obj2);
    }

    @Override // Ud.K0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public a j0() {
        return (a) this.f13480o.getValue();
    }

    @Override // kotlin.reflect.n
    public Object s(Object obj, Object obj2) {
        return j0().call(obj, obj2);
    }
}

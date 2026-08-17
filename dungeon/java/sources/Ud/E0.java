package Ud;

import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class E0 extends K0 implements kotlin.reflect.m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Lazy f13472o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Lazy f13473p;

    public static final class a extends K0.c implements kotlin.reflect.m.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final E0 f13474j;

        public a(E0 property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f13474j = property;
        }

        @Override // kotlin.reflect.k.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public E0 m() {
            return this.f13474j;
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            return m().get(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(AbstractC1514d0 container, p015ae.Z descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Ad.m mVar = Ad.m.PUBLICATION;
        this.f13472o = Ad.j.a(mVar, new C0(this));
        this.f13473p = Ad.j.a(mVar, new D0(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(AbstractC1514d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Ad.m mVar = Ad.m.PUBLICATION;
        this.f13472o = Ad.j.a(mVar, new C0(this));
        this.f13473p = Ad.j.a(mVar, new D0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a m0(E0 e10) {
        return new a(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member p0(E0 e10) {
        return e10.f0();
    }

    @Override // kotlin.reflect.m
    public Object get(Object obj) {
        return j0().call(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // Ud.K0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public a j0() {
        return (a) this.f13472o.getValue();
    }
}

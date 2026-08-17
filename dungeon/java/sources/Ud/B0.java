package Ud;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class B0 extends K0 implements kotlin.reflect.l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Lazy f13464o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Lazy f13465p;

    public static final class a extends K0.c implements kotlin.reflect.l.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final B0 f13466j;

        public a(B0 property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f13466j = property;
        }

        @Override // kotlin.reflect.k.a
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public B0 m() {
            return this.f13466j;
        }

        @Override // kotlin.jvm.functions.Function0
        public Object invoke() {
            return c0().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AbstractC1514d0 container, p015ae.Z descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Ad.m mVar = Ad.m.PUBLICATION;
        this.f13464o = Ad.j.a(mVar, new C1557z0(this));
        this.f13465p = Ad.j.a(mVar, new A0(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AbstractC1514d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Ad.m mVar = Ad.m.PUBLICATION;
        this.f13464o = Ad.j.a(mVar, new C1557z0(this));
        this.f13465p = Ad.j.a(mVar, new A0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a m0(B0 b10) {
        return new a(b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p0(B0 b10) {
        return b10.h0(b10.f0(), null, null);
    }

    @Override // kotlin.reflect.l
    public Object get() {
        return d().call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // Ud.K0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a j0() {
        return (a) this.f13464o.getValue();
    }
}

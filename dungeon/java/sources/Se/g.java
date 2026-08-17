package Se;

import Re.S;
import Re.v0;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p015ae.H;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1794h;
import p015ae.InterfaceC1799m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends Re.r {

    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11613a = new a();

        private a() {
        }

        @Override // Se.g
        public InterfaceC1791e b(p464ze.b classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            return null;
        }

        @Override // Se.g
        public Ke.k c(InterfaceC1791e classDescriptor, Function0 compute) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(compute, "compute");
            return (Ke.k) compute.invoke();
        }

        @Override // Se.g
        public boolean d(H moduleDescriptor) {
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // Se.g
        public boolean e(v0 typeConstructor) {
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // Se.g
        public Collection g(InterfaceC1791e classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Collection collectionA = classDescriptor.l().a();
            Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
            return collectionA;
        }

        @Override // Re.r
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public S a(Ve.i type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return (S) type;
        }

        @Override // Se.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC1791e f(InterfaceC1799m descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return null;
        }
    }

    public abstract InterfaceC1791e b(p464ze.b bVar);

    public abstract Ke.k c(InterfaceC1791e interfaceC1791e, Function0 function0);

    public abstract boolean d(H h10);

    public abstract boolean e(v0 v0Var);

    public abstract InterfaceC1794h f(InterfaceC1799m interfaceC1799m);

    public abstract Collection g(InterfaceC1791e interfaceC1791e);

    /* JADX INFO: renamed from: h */
    public abstract S a(Ve.i iVar);
}

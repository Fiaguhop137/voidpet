package p051ce;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1791e;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: ce.a$a, reason: collision with other inner class name */
    public static final class C0356a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0356a f27454a = new C0356a();

        private C0356a() {
        }

        @Override // p051ce.a
        public Collection a(InterfaceC1791e classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.l();
        }

        @Override // p051ce.a
        public Collection c(f name, InterfaceC1791e classDescriptor) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.l();
        }

        @Override // p051ce.a
        public Collection d(InterfaceC1791e classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.l();
        }

        @Override // p051ce.a
        public Collection e(InterfaceC1791e classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.l();
        }
    }

    Collection a(InterfaceC1791e interfaceC1791e);

    Collection c(f fVar, InterfaceC1791e interfaceC1791e);

    Collection d(InterfaceC1791e interfaceC1791e);

    Collection e(InterfaceC1791e interfaceC1791e);
}

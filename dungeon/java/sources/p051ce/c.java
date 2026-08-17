package p051ce;

import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1791e;
import p015ae.g0;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27455a = new a();

        private a() {
        }

        @Override // p051ce.c
        public boolean b(InterfaceC1791e classDescriptor, g0 functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27456a = new b();

        private b() {
        }

        @Override // p051ce.c
        public boolean b(InterfaceC1791e classDescriptor, g0 functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().b1(d.a());
        }
    }

    boolean b(InterfaceC1791e interfaceC1791e, g0 g0Var);
}

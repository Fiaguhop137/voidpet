package Ye;

import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1799m;

/* JADX INFO: loaded from: classes3.dex */
public interface l {

    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17849a = new a();

        private a() {
        }

        @Override // Ye.l
        public boolean a(InterfaceC1799m what, InterfaceC1799m from) {
            Intrinsics.checkNotNullParameter(what, "what");
            Intrinsics.checkNotNullParameter(from, "from");
            return true;
        }
    }

    boolean a(InterfaceC1799m interfaceC1799m, InterfaceC1799m interfaceC1799m2);
}

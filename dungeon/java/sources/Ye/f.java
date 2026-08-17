package Ye;

import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1811z;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    public static final class a {
        public static String a(f fVar, InterfaceC1811z functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            if (fVar.h(functionDescriptor)) {
                return null;
            }
            return fVar.g();
        }
    }

    String g();

    boolean h(InterfaceC1811z interfaceC1811z);

    String i(InterfaceC1811z interfaceC1811z);
}

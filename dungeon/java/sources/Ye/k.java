package Ye;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1811z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17846a;

    public static final class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f17847b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // Ye.f
        public boolean h(InterfaceC1811z functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.O() != null;
        }
    }

    public static final class b extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f17848b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // Ye.f
        public boolean h(InterfaceC1811z functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.O() == null && functionDescriptor.R() == null) ? false : true;
        }
    }

    private k(String str) {
        this.f17846a = str;
    }

    public /* synthetic */ k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // Ye.f
    public String g() {
        return this.f17846a;
    }

    @Override // Ye.f
    public String i(InterfaceC1811z interfaceC1811z) {
        return f.a.a(this, interfaceC1811z);
    }
}

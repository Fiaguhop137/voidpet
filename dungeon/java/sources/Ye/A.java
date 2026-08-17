package Ye;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1811z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17819a;

    public static final class a extends A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17820b;

        public a(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("must have at least ");
            sb2.append(i10);
            sb2.append(" value parameter");
            sb2.append(i10 > 1 ? "s" : "");
            super(sb2.toString(), null);
            this.f17820b = i10;
        }

        @Override // Ye.f
        public boolean h(InterfaceC1811z functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() >= this.f17820b;
        }
    }

    public static final class b extends A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17821b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f17821b = i10;
        }

        @Override // Ye.f
        public boolean h(InterfaceC1811z functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() == this.f17821b;
        }
    }

    public static final class c extends A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f17822b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // Ye.f
        public boolean h(InterfaceC1811z functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().isEmpty();
        }
    }

    public static final class d extends A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f17823b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // Ye.f
        public boolean h(InterfaceC1811z functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.i().size() == 1;
        }
    }

    private A(String str) {
        this.f17819a = str;
    }

    public /* synthetic */ A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // Ye.f
    public String g() {
        return this.f17819a;
    }

    @Override // Ye.f
    public String i(InterfaceC1811z interfaceC1811z) {
        return f.a.a(this, interfaceC1811z);
    }
}

package com.rivereactnative;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.rivereactnative.a$a, reason: collision with other inner class name */
    public static final class C0421a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f38659a;

        public C0421a(boolean z10) {
            super(null);
            this.f38659a = z10;
        }

        public final boolean a() {
            return this.f38659a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0421a) && this.f38659a == ((C0421a) obj).f38659a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f38659a);
        }

        public String toString() {
            return "AutoBind(autoBind=" + this.f38659a + ")";
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f38660a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1653671279;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f38661a;

        public c(int i10) {
            super(null);
            this.f38661a = i10;
        }

        public final int a() {
            return this.f38661a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f38661a == ((c) obj).f38661a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f38661a);
        }

        public String toString() {
            return "Index(index=" + this.f38661a + ")";
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38662a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f38662a = name;
        }

        public final String a() {
            return this.f38662a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.b(this.f38662a, ((d) obj).f38662a);
        }

        public int hashCode() {
            return this.f38662a.hashCode();
        }

        public String toString() {
            return "Name(name=" + this.f38662a + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

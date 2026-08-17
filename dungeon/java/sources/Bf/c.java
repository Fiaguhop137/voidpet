package Bf;

import If.C1109k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f865d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1109k f866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1109k f867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1109k f868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1109k f869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1109k f870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1109k f871j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1109k f872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1109k f873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f874c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C1109k.a aVar = C1109k.f5523d;
        f866e = aVar.g(":");
        f867f = aVar.g(":status");
        f868g = aVar.g(":method");
        f869h = aVar.g(":path");
        f870i = aVar.g(":scheme");
        f871j = aVar.g(":authority");
    }

    public c(C1109k name, C1109k value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f872a = name;
        this.f873b = value;
        this.f874c = name.M() + 32 + value.M();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(C1109k name, String value) {
        this(name, C1109k.f5523d.g(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C1109k.a aVar = C1109k.f5523d;
        this(aVar.g(name), aVar.g(value));
    }

    public final C1109k a() {
        return this.f872a;
    }

    public final C1109k b() {
        return this.f873b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.b(this.f872a, cVar.f872a) && Intrinsics.b(this.f873b, cVar.f873b);
    }

    public int hashCode() {
        return (this.f872a.hashCode() * 31) + this.f873b.hashCode();
    }

    public String toString() {
        return this.f872a.S() + ": " + this.f873b.S();
    }
}

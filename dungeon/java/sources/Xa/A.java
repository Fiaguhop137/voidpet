package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15338e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC1634e f15339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1657q f15340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f15341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15342d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public A(EnumC1634e billingProgram, EnumC1657q launchMode, r linkType, String linkUri) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(linkUri, "linkUri");
        this.f15339a = billingProgram;
        this.f15340b = launchMode;
        this.f15341c = linkType;
        this.f15342d = linkUri;
    }

    public final EnumC1634e a() {
        return this.f15339a;
    }

    public final EnumC1657q b() {
        return this.f15340b;
    }

    public final r c() {
        return this.f15341c;
    }

    public final String d() {
        return this.f15342d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f15339a == a10.f15339a && this.f15340b == a10.f15340b && this.f15341c == a10.f15341c && Intrinsics.b(this.f15342d, a10.f15342d);
    }

    public int hashCode() {
        return (((((this.f15339a.hashCode() * 31) + this.f15340b.hashCode()) * 31) + this.f15341c.hashCode()) * 31) + this.f15342d.hashCode();
    }

    public String toString() {
        return "LaunchExternalLinkParamsAndroid(billingProgram=" + this.f15339a + ", launchMode=" + this.f15340b + ", linkType=" + this.f15341c + ", linkUri=" + this.f15342d + ")";
    }
}

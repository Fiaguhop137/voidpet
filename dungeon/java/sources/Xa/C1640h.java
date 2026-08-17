package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1640h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16025c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16027b;

    /* JADX INFO: renamed from: Xa.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1640h(String str, String str2) {
        this.f16026a = str;
        this.f16027b = str2;
    }

    public final String a() {
        return this.f16026a;
    }

    public final String b() {
        return this.f16027b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1640h)) {
            return false;
        }
        C1640h c1640h = (C1640h) obj;
        return Intrinsics.b(this.f16026a, c1640h.f16026a) && Intrinsics.b(this.f16027b, c1640h.f16027b);
    }

    public int hashCode() {
        String str = this.f16026a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16027b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DeepLinkOptions(packageNameAndroid=" + this.f16026a + ", skuAndroid=" + this.f16027b + ")";
    }
}

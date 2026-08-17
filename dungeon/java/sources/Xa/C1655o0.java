package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1655o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16110d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f16111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f16112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f16113c;

    /* JADX INFO: renamed from: Xa.o0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: Xa.o0$b */
    public static abstract class b {

        /* JADX INFO: renamed from: Xa.o0$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final p0 f16114a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p0 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.f16114a = value;
            }

            public final p0 a() {
                return this.f16114a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.b(this.f16114a, ((a) obj).f16114a);
            }

            public int hashCode() {
                return this.f16114a.hashCode();
            }

            public String toString() {
                return "Purchase(value=" + this.f16114a + ")";
            }
        }

        /* JADX INFO: renamed from: Xa.o0$b$b, reason: collision with other inner class name */
        public static final class C0218b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final u0 f16115a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0218b(u0 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.f16115a = value;
            }

            public final u0 a() {
                return this.f16115a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0218b) && Intrinsics.b(this.f16115a, ((C0218b) obj).f16115a);
            }

            public int hashCode() {
                return this.f16115a.hashCode();
            }

            public String toString() {
                return "Subscription(value=" + this.f16115a + ")";
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1655o0(b request, V type, Boolean bool) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f16111a = request;
        this.f16112b = type;
        this.f16113c = bool;
        if (request instanceof b.a) {
            if (type != V.InApp) {
                throw new IllegalArgumentException("type must be IN_APP when request is purchase");
            }
        } else {
            if (!(request instanceof b.C0218b)) {
                throw new Ad.n();
            }
            if (type != V.Subs) {
                throw new IllegalArgumentException("type must be SUBS when request is subscription");
            }
        }
    }

    public /* synthetic */ C1655o0(b bVar, V v10, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, v10, (i10 & 4) != 0 ? null : bool);
    }

    public final b a() {
        return this.f16111a;
    }

    public final V b() {
        return this.f16112b;
    }

    public final Boolean c() {
        return this.f16113c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1655o0)) {
            return false;
        }
        C1655o0 c1655o0 = (C1655o0) obj;
        return Intrinsics.b(this.f16111a, c1655o0.f16111a) && this.f16112b == c1655o0.f16112b && Intrinsics.b(this.f16113c, c1655o0.f16113c);
    }

    public int hashCode() {
        int iHashCode = ((this.f16111a.hashCode() * 31) + this.f16112b.hashCode()) * 31;
        Boolean bool = this.f16113c;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "RequestPurchaseProps(request=" + this.f16111a + ", type=" + this.f16112b + ", useAlternativeBilling=" + this.f16113c + ")";
    }
}

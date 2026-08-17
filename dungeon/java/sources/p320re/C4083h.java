package p320re;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: re.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4083h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f52534e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C4083h f52535f = new C4083h(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC4086k f52536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC4084i f52537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f52538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f52539d;

    /* JADX INFO: renamed from: re.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4083h a() {
            return C4083h.f52535f;
        }
    }

    public C4083h(EnumC4086k enumC4086k, EnumC4084i enumC4084i, boolean z10, boolean z11) {
        this.f52536a = enumC4086k;
        this.f52537b = enumC4084i;
        this.f52538c = z10;
        this.f52539d = z11;
    }

    public /* synthetic */ C4083h(EnumC4086k enumC4086k, EnumC4084i enumC4084i, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC4086k, enumC4084i, z10, (i10 & 8) != 0 ? false : z11);
    }

    public static /* synthetic */ C4083h c(C4083h c4083h, EnumC4086k enumC4086k, EnumC4084i enumC4084i, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC4086k = c4083h.f52536a;
        }
        if ((i10 & 2) != 0) {
            enumC4084i = c4083h.f52537b;
        }
        if ((i10 & 4) != 0) {
            z10 = c4083h.f52538c;
        }
        if ((i10 & 8) != 0) {
            z11 = c4083h.f52539d;
        }
        return c4083h.b(enumC4086k, enumC4084i, z10, z11);
    }

    public final C4083h b(EnumC4086k enumC4086k, EnumC4084i enumC4084i, boolean z10, boolean z11) {
        return new C4083h(enumC4086k, enumC4084i, z10, z11);
    }

    public final boolean d() {
        return this.f52538c;
    }

    public final EnumC4084i e() {
        return this.f52537b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4083h)) {
            return false;
        }
        C4083h c4083h = (C4083h) obj;
        return this.f52536a == c4083h.f52536a && this.f52537b == c4083h.f52537b && this.f52538c == c4083h.f52538c && this.f52539d == c4083h.f52539d;
    }

    public final EnumC4086k f() {
        return this.f52536a;
    }

    public final boolean g() {
        return this.f52539d;
    }

    public int hashCode() {
        EnumC4086k enumC4086k = this.f52536a;
        int iHashCode = (enumC4086k == null ? 0 : enumC4086k.hashCode()) * 31;
        EnumC4084i enumC4084i = this.f52537b;
        return ((((iHashCode + (enumC4084i != null ? enumC4084i.hashCode() : 0)) * 31) + Boolean.hashCode(this.f52538c)) * 31) + Boolean.hashCode(this.f52539d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f52536a + ", mutability=" + this.f52537b + ", definitelyNotNull=" + this.f52538c + ", isNullabilityQualifierForWarning=" + this.f52539d + ')';
    }
}

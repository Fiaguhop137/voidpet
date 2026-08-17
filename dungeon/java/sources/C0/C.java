package C0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1064c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C f1065d = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1067b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C() {
        this(C0827h.f1154b.b(), false, null);
    }

    private C(int i10, boolean z10) {
        this.f1066a = z10;
        this.f1067b = i10;
    }

    public /* synthetic */ C(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public C(boolean z10) {
        this.f1066a = z10;
        this.f1067b = C0827h.f1154b.b();
    }

    public final int a() {
        return this.f1067b;
    }

    public final boolean b() {
        return this.f1066a;
    }

    public final C c(C c10) {
        return c10 == null ? this : c10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f1066a == c10.f1066a && C0827h.g(this.f1067b, c10.f1067b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f1066a) * 31) + C0827h.h(this.f1067b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f1066a + ", emojiSupportMatch=" + ((Object) C0827h.i(this.f1067b)) + ')';
    }
}

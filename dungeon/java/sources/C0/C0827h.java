package C0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: C0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0827h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1154b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f1155c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f1156d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f1157e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1158a;

    /* JADX INFO: renamed from: C0.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C0827h.f1157e;
        }

        public final int b() {
            return C0827h.f1155c;
        }

        public final int c() {
            return C0827h.f1156d;
        }
    }

    private /* synthetic */ C0827h(int i10) {
        this.f1158a = i10;
    }

    public static final /* synthetic */ C0827h d(int i10) {
        return new C0827h(i10);
    }

    private static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof C0827h) && i10 == ((C0827h) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        if (i10 == f1155c) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == f1156d) {
            return "EmojiSupportMatch.None";
        }
        if (i10 == f1157e) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f1158a, obj);
    }

    public int hashCode() {
        return h(this.f1158a);
    }

    public final /* synthetic */ int j() {
        return this.f1158a;
    }

    public String toString() {
        return i(this.f1158a);
    }
}

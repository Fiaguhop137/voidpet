package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f48502d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f48503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f48504f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f48506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f48507c;

    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final C0569a f48508j = new C0569a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final a f48509k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f48512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f48513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f48514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f48515f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f48516g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f48517h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f48518i;

        /* JADX INFO: renamed from: kotlin.text.d$a$a, reason: collision with other inner class name */
        public static final class C0569a {
            private C0569a() {
            }

            public /* synthetic */ C0569a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return a.f48509k;
            }
        }

        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
            Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
            Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
            Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.f48510a = i10;
            this.f48511b = i11;
            this.f48512c = groupSeparator;
            this.f48513d = byteSeparator;
            this.f48514e = bytePrefix;
            this.f48515f = byteSuffix;
            this.f48516g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f48517h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f48518i = e.b(groupSeparator) || e.b(byteSeparator) || e.b(bytePrefix) || e.b(byteSuffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f48510a);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f48511b);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f48512c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f48513d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f48514e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f48515f);
            sb2.append("\"");
            return sb2;
        }

        public final String c() {
            return this.f48514e;
        }

        public final String d() {
            return this.f48513d;
        }

        public final String e() {
            return this.f48515f;
        }

        public final int f() {
            return this.f48511b;
        }

        public final int g() {
            return this.f48510a;
        }

        public final String h() {
            return this.f48512c;
        }

        public final boolean i() {
            return this.f48516g;
        }

        public final boolean j() {
            return this.f48517h;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return d.f48503e;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final a f48519h = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final c f48520i = new c("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f48522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f48523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f48524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f48525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f48526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f48527g;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f48520i;
            }
        }

        public c(String prefix, String suffix, boolean z10, int i10) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.f48521a = prefix;
            this.f48522b = suffix;
            this.f48523c = z10;
            this.f48524d = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f48525e = z11;
            this.f48526f = z11 && i10 == 1;
            this.f48527g = e.b(prefix) || e.b(suffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f48521a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f48522b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f48523c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f48524d);
            return sb2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        a.C0569a c0569a = a.f48508j;
        a aVarA = c0569a.a();
        c.a aVar = c.f48519h;
        f48503e = new d(false, aVarA, aVar.a());
        f48504f = new d(true, c0569a.a(), aVar.a());
    }

    public d(boolean z10, a bytes, c number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f48505a = z10;
        this.f48506b = bytes;
        this.f48507c = number;
    }

    public final a b() {
        return this.f48506b;
    }

    public final boolean c() {
        return this.f48505a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f48505a);
        sb2.append(",");
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f48506b.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f48507c.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}

package Ce;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f1853a = new b("PLAIN", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f1854b = new a("HTML", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ F[] f1855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1856d;

    static final class a extends F {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // Ce.F
        public String g(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return StringsKt.I(StringsKt.I(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    }

    static final class b extends F {
        b(String str, int i10) {
            super(str, i10, null);
        }

        @Override // Ce.F
        public String g(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return string;
        }
    }

    static {
        F[] fArrE = e();
        f1855c = fArrE;
        f1856d = Gd.a.a(fArrE);
    }

    private F(String str, int i10) {
        super(str, i10);
    }

    public /* synthetic */ F(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    private static final /* synthetic */ F[] e() {
        return new F[]{f1853a, f1854b};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f1855c.clone();
    }

    public abstract String g(String str);
}

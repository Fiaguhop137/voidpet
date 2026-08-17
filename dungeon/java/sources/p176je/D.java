package p176je;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f47214d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final D f47215e = new D(B.b(null, 1, null), a.f47219a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f47216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f47217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f47218c;

    /* synthetic */ class a extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47219a = new a();

        a() {
            super(1, B.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final O invoke(c p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return B.d(p10);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final D a() {
            return D.f47215e;
        }
    }

    public D(G jsr305, Function1 getReportLevelForAnnotation) {
        Intrinsics.checkNotNullParameter(jsr305, "jsr305");
        Intrinsics.checkNotNullParameter(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f47216a = jsr305;
        this.f47217b = getReportLevelForAnnotation;
        this.f47218c = jsr305.f() || getReportLevelForAnnotation.invoke(B.e()) == O.IGNORE;
    }

    public final boolean b() {
        return this.f47218c;
    }

    public final Function1 c() {
        return this.f47217b;
    }

    public final G d() {
        return this.f47216a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f47216a + ", getReportLevelForAnnotation=" + this.f47217b + ')';
    }
}

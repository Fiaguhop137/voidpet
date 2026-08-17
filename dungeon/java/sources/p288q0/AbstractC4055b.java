package p288q0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC3975l;

/* JADX INFO: renamed from: q0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4055b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4061h f51174a = new C4061h(a.f51176a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C4061h f51175b = new C4061h(C0611b.f51177a);

    /* JADX INFO: renamed from: q0.b$a */
    /* synthetic */ class a extends AbstractC3975l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f51176a = new a();

        a() {
            super(2, Od.a.class, "min", "min(II)I", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer m(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }
    }

    /* JADX INFO: renamed from: q0.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0611b extends AbstractC3975l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0611b f51177a = new C0611b();

        C0611b() {
            super(2, Od.a.class, "max", "max(II)I", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer m(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }
    }

    public static final C4061h a() {
        return f51174a;
    }

    public static final C4061h b() {
        return f51175b;
    }

    public static final int c(AbstractC4054a abstractC4054a, int i10, int i11) {
        return ((Number) abstractC4054a.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }
}

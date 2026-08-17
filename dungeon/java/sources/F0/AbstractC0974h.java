package F0;

import I.d2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: F0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0974h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2839b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final D f2840c = new C0972f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u f2841d = new u("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u f2842e = new u("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final u f2843f = new u("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final u f2844g = new u("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2845a;

    /* JADX INFO: renamed from: F0.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final D a() {
            return AbstractC0974h.f2840c;
        }
    }

    /* JADX INFO: renamed from: F0.h$b */
    public interface b {
        static /* synthetic */ d2 a(b bVar, AbstractC0974h abstractC0974h, r rVar, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i12 & 1) != 0) {
                abstractC0974h = null;
            }
            if ((i12 & 2) != 0) {
                rVar = r.f2873b.c();
            }
            if ((i12 & 4) != 0) {
                i10 = p.f2863b.b();
            }
            if ((i12 & 8) != 0) {
                i11 = q.f2867b.a();
            }
            return bVar.b(abstractC0974h, rVar, i10, i11);
        }

        d2 b(AbstractC0974h abstractC0974h, r rVar, int i10, int i11);
    }

    private AbstractC0974h(boolean z10) {
        this.f2845a = z10;
    }

    public /* synthetic */ AbstractC0974h(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }
}

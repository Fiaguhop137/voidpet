package M0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p037c0.P;
import p037c0.Z;
import p037c0.v0;

/* JADX INFO: loaded from: classes.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6752a = a.f6753a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f6753a = new a();

        private a() {
        }

        public final o a(P p10, float f10) {
            if (p10 == null) {
                return b.f6754b;
            }
            if (p10 instanceof v0) {
                return new M0.b((v0) p10, f10);
            }
            throw new Ad.n();
        }

        public final o b(long j10) {
            return j10 != 16 ? new c(j10, null) : b.f6754b;
        }
    }

    public static final class b implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f6754b = new b();

        private b() {
        }

        @Override // M0.o
        public float a() {
            return Float.NaN;
        }

        @Override // M0.o
        public long e() {
            return Z.f26696b.e();
        }

        @Override // M0.o
        public P l() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static o g(o oVar) {
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static float j(o oVar) {
        return ((M0.b) oVar).a();
    }

    float a();

    long e();

    default o h(o oVar) {
        boolean z10 = oVar instanceof M0.b;
        if (z10 && (this instanceof M0.b)) {
            M0.b bVar = (M0.b) oVar;
            return new M0.b(bVar.b(), l.b(bVar.a(), new m(this)));
        }
        if (!z10 || (this instanceof M0.b)) {
            return (z10 || !(this instanceof M0.b)) ? oVar.k(new n(this)) : this;
        }
        return oVar;
    }

    default o k(Function0 function0) {
        return !Intrinsics.b(this, b.f6754b) ? this : (o) function0.invoke();
    }

    P l();
}

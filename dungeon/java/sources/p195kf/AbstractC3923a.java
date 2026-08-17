package p195kf;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3923a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f48137a = new D("CLOSED");

    public static final AbstractC3924b b(AbstractC3924b abstractC3924b) {
        while (true) {
            Object objG = abstractC3924b.g();
            if (objG == f48137a) {
                return abstractC3924b;
            }
            AbstractC3924b abstractC3924b2 = (AbstractC3924b) objG;
            if (abstractC3924b2 != null) {
                abstractC3924b = abstractC3924b2;
            } else if (abstractC3924b.m()) {
                return abstractC3924b;
            }
        }
    }

    public static final Object c(A a10, long j10, Function2 function2) {
        while (true) {
            if (a10.f48121c >= j10 && !a10.k()) {
                return B.a(a10);
            }
            Object objG = a10.g();
            if (objG == f48137a) {
                return B.a(f48137a);
            }
            A a11 = (A) ((AbstractC3924b) objG);
            if (a11 == null) {
                a11 = (A) function2.invoke(Long.valueOf(a10.f48121c + 1), a10);
                if (a10.o(a11)) {
                    if (a10.k()) {
                        a10.n();
                    }
                }
            }
            a10 = a11;
        }
    }
}

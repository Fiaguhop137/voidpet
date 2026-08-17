package p213lf;

import Ad.q;
import Ad.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function2;
import p088ef.C;
import p088ef.I0;
import p088ef.a1;
import p195kf.K;
import p195kf.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final void a(Function2 function2, Object obj, Ed.b bVar) {
        Ed.b bVarA = h.a(bVar);
        try {
            CoroutineContext context = bVarA.getContext();
            Object objI = K.i(context, null);
            try {
                h.b(bVarA);
                Object objD = !(function2 instanceof a) ? Fd.b.d(function2, obj, bVarA) : ((Function2) kotlin.jvm.internal.K.e(function2, 2)).invoke(obj, bVarA);
                K.f(context, objI);
                if (objD != Fd.b.e()) {
                    bVarA.resumeWith(q.b(objD));
                }
            } catch (Throwable th) {
                K.f(context, objI);
                throw th;
            }
        } catch (Throwable th2) {
            q.a aVar = q.f327b;
            bVarA.resumeWith(q.b(r.a(th2)));
        }
    }

    public static final Object b(z zVar, Object obj, Function2 function2) {
        Object c10;
        Object objY0;
        try {
            c10 = !(function2 instanceof a) ? Fd.b.d(function2, obj, zVar) : ((Function2) kotlin.jvm.internal.K.e(function2, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            c10 = new C(th, false, 2, null);
        }
        if (c10 != Fd.b.e() && (objY0 = zVar.y0(c10)) != I0.f40775b) {
            if (objY0 instanceof C) {
                throw ((C) objY0).f40752a;
            }
            return I0.h(objY0);
        }
        return Fd.b.e();
    }

    public static final Object c(z zVar, Object obj, Function2 function2) throws Throwable {
        Object c10;
        Object objY0;
        try {
            c10 = !(function2 instanceof a) ? Fd.b.d(function2, obj, zVar) : ((Function2) kotlin.jvm.internal.K.e(function2, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            c10 = new C(th, false, 2, null);
        }
        if (c10 != Fd.b.e() && (objY0 = zVar.y0(c10)) != I0.f40775b) {
            if (objY0 instanceof C) {
                Throwable th2 = ((C) objY0).f40752a;
                if (!(th2 instanceof a1) || ((a1) th2).f40814a != zVar) {
                    throw th2;
                }
                if (c10 instanceof C) {
                    throw ((C) c10).f40752a;
                }
            } else {
                c10 = I0.h(objY0);
            }
            return c10;
        }
        return Fd.b.e();
    }
}

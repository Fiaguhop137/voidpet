package p088ef;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p195kf.AbstractC3934l;
import p195kf.C3930h;
import p195kf.C3933k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K extends kotlin.coroutines.a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40782b = new a(null);

    public static final class a extends b {
        private a() {
            super(d.f48281C1, new J());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final K d(CoroutineContext.Element element) {
            if (element instanceof K) {
                return (K) element;
            }
            return null;
        }
    }

    public K() {
        super(d.f48281C1);
    }

    public static /* synthetic */ K q0(K k10, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return k10.m0(i10, str);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext S(CoroutineContext.b bVar) {
        return d.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element e(CoroutineContext.b bVar) {
        return d.a.a(this, bVar);
    }

    public abstract void e0(CoroutineContext coroutineContext, Runnable runnable);

    @Override // kotlin.coroutines.d
    public final Ed.b h(Ed.b bVar) {
        return new C3930h(this, bVar);
    }

    public boolean h0(CoroutineContext coroutineContext) {
        return true;
    }

    public K m0(int i10, String str) {
        AbstractC3934l.a(i10);
        return new C3933k(this, i10, str);
    }

    @Override // kotlin.coroutines.d
    public final void r(Ed.b bVar) {
        Intrinsics.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C3930h) bVar).o();
    }

    public String toString() {
        return T.a(this) + '@' + T.b(this);
    }
}

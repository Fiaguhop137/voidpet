package p106ff;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p088ef.C3282e0;
import p088ef.E0;
import p088ef.InterfaceC3286g0;
import p088ef.InterfaceC3299n;
import p088ef.O0;
import p088ef.Y;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f implements Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f41898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f41900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f41901f;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3299n f41902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f41903b;

        public a(InterfaceC3299n interfaceC3299n, e eVar) {
            this.f41902a = interfaceC3299n;
            this.f41903b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f41902a.A(this.f41903b, Unit.f48228a);
        }
    }

    public e(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ e(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    private e(Handler handler, String str, boolean z10) {
        super(null);
        this.f41898c = handler;
        this.f41899d = str;
        this.f41900e = z10;
        this.f41901f = z10 ? this : new e(handler, str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(e eVar, Runnable runnable) {
        eVar.f41898c.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G0(e eVar, Runnable runnable, Throwable th) {
        eVar.f41898c.removeCallbacks(runnable);
        return Unit.f48228a;
    }

    private final void y0(CoroutineContext coroutineContext, Runnable runnable) {
        E0.d(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C3282e0.b().e0(coroutineContext, runnable);
    }

    @Override // p088ef.K
    public void e0(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f41898c.post(runnable)) {
            return;
        }
        y0(coroutineContext, runnable);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f41898c == this.f41898c && eVar.f41900e == this.f41900e;
    }

    @Override // p088ef.K
    public boolean h0(CoroutineContext coroutineContext) {
        return (this.f41900e && Intrinsics.b(Looper.myLooper(), this.f41898c.getLooper())) ? false : true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f41898c) ^ (this.f41900e ? 1231 : 1237);
    }

    @Override // p088ef.Y
    public InterfaceC3286g0 t(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        if (this.f41898c.postDelayed(runnable, kotlin.ranges.e.j(j10, 4611686018427387903L))) {
            return new d(this, runnable);
        }
        y0(coroutineContext, runnable);
        return O0.f40789a;
    }

    @Override // p088ef.K
    public String toString() {
        String strS0 = s0();
        if (strS0 != null) {
            return strS0;
        }
        String string = this.f41899d;
        if (string == null) {
            string = this.f41898c.toString();
        }
        if (!this.f41900e) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // p088ef.Y
    public void z(long j10, InterfaceC3299n interfaceC3299n) {
        a aVar = new a(interfaceC3299n, this);
        if (this.f41898c.postDelayed(aVar, kotlin.ranges.e.j(j10, 4611686018427387903L))) {
            interfaceC3299n.t(new c(this, aVar));
        } else {
            y0(interfaceC3299n.getContext(), aVar);
        }
    }

    @Override // p106ff.f
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e t0() {
        return this.f41901f;
    }
}

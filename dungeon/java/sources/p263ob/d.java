package p263ob;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f50526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50527b;

    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f50528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f50529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f50530c;

        a(long j10, d dVar, Function1 function1) {
            this.f50528a = j10;
            this.f50529b = dVar;
            this.f50530c = function1;
        }

        @Override // p263ob.e
        public long a() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f50528a;
            d.f(this.f50529b, c.Timer, (String) this.f50530c.invoke(Long.valueOf(jCurrentTimeMillis)), null, 4, null);
            return b.q(jCurrentTimeMillis, p070df.b.MILLISECONDS);
        }
    }

    public d(List logHandlers) {
        Intrinsics.checkNotNullParameter(logHandlers, "logHandlers");
        this.f50526a = logHandlers;
        this.f50527b = 4;
    }

    public static /* synthetic */ void c(d dVar, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        dVar.b(str, th);
    }

    private final void e(c cVar, String str, Throwable th) {
        if (c.f50513b.a(cVar) >= this.f50527b) {
            Iterator it = this.f50526a.iterator();
            while (it.hasNext()) {
                ((p263ob.a) it.next()).a(cVar, str, th);
            }
        }
    }

    static /* synthetic */ void f(d dVar, c cVar, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        dVar.e(cVar, str, th);
    }

    public static /* synthetic */ void i(d dVar, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        dVar.h(str, th);
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        f(this, c.Debug, message, null, 4, null);
    }

    public final void b(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        e(c.Error, message, th);
    }

    public final void d(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        f(this, c.Info, message, null, 4, null);
    }

    public final e g(Function1 logFormatter) {
        Intrinsics.checkNotNullParameter(logFormatter, "logFormatter");
        return new a(System.currentTimeMillis(), this, logFormatter);
    }

    public final void h(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        e(c.Warn, message, th);
    }
}

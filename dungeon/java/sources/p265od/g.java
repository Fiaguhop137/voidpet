package p265od;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p263ob.b;
import p263ob.c;
import p263ob.d;
import p263ob.e;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p265od.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50591b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f50592a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g(File filesDirectory) {
        Intrinsics.checkNotNullParameter(filesDirectory, "filesDirectory");
        b bVar = b.f50512a;
        this.f50592a = new d(CollectionsKt.o(bVar.a("dev.expo.updates"), bVar.b(filesDirectory, "dev.expo.updates")));
    }

    public static /* synthetic */ void e(g gVar, String str, b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = b.None;
        }
        gVar.c(str, bVar);
    }

    public static /* synthetic */ void h(g gVar, String str, Exception exc, b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bVar = b.None;
        }
        gVar.f(str, exc, bVar);
    }

    public static /* synthetic */ void k(g gVar, String str, b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = b.None;
        }
        gVar.i(str, bVar);
    }

    private final String l(String str, b bVar, c cVar, Long l10, String str2, String str3) {
        return new c(new Date().getTime(), str, bVar.g(), cVar.g(), l10, str2, str3, null).a();
    }

    private final String m(String str, Exception exc, b bVar, c cVar, Long l10, String str2, String str3) {
        long time = new Date().getTime();
        String strG = bVar.g();
        String strG2 = cVar.g();
        StackTraceElement[] stackTrace = exc.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        List listZ0 = AbstractC3952n.z0(stackTrace, 20);
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listZ0, 10));
        Iterator it = listZ0.iterator();
        while (it.hasNext()) {
            String string = ((StackTraceElement) it.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(string);
        }
        return new c(time, str, strG, strG2, l10, str2, str3, arrayList).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(g gVar, String str, long j10) {
        return gVar.l(str, b.None, c.Timer, Long.valueOf(j10), null, null);
    }

    public static /* synthetic */ void q(g gVar, String str, b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = b.None;
        }
        gVar.o(str, bVar);
    }

    @Override // p265od.a
    public e a(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return this.f50592a.g(new f(this, label));
    }

    public final void c(String message, b code) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(code, "code");
        d(message, code, null, null);
    }

    public final void d(String message, b code, String str, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f50592a.a(l(message, code, c.Debug, null, str, str2));
    }

    public final void f(String message, Exception cause, b code) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(code, "code");
        g(message, cause, code, null, null);
    }

    public final void g(String message, Exception cause, b code, String str, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(code, "code");
        d.c(this.f50592a, m(message, cause, code, c.Error, null, str, str2), null, 2, null);
    }

    public final void i(String message, b code) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(code, "code");
        j(message, code, null, null);
    }

    public final void j(String message, b code, String str, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f50592a.d(l(message, code, c.Info, null, str, str2));
    }

    public final void o(String message, b code) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(code, "code");
        p(message, code, null, null);
    }

    public final void p(String message, b code, String str, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(code, "code");
        d.i(this.f50592a, l(message, code, c.Warn, null, str, str2), null, 2, null);
    }
}

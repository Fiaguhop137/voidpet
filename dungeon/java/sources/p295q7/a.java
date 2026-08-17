package p295q7;

import com.facebook.systrace.TraceListener;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f51596a = new a();

    /* JADX INFO: renamed from: q7.a$a, reason: collision with other inner class name */
    public enum EnumC0617a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f51601f = Gd.a.a(e());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f51602a;

        EnumC0617a(char c10) {
            this.f51602a = c10;
        }
    }

    private a() {
    }

    public static final void a(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        p381v3.a.a(sectionName, i10);
    }

    public static final void b(long j10, String sectionName, int i10, long j11) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        a(j10, sectionName, i10);
    }

    public static final void c(long j10, String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        p381v3.a.c(sectionName);
    }

    public static final void d(long j10, String sectionName, String[] args, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(args, "args");
        p381v3.a.c(sectionName + "|" + f51596a.e(args, i10));
    }

    private final String e(String[] strArr, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 1; i11 < i10; i11 += 2) {
            String str = strArr[i11 - 1];
            String str2 = strArr[i11];
            sb2.append(str);
            sb2.append('=');
            sb2.append(str2);
            if (i11 < i10 - 1) {
                sb2.append(';');
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final void f(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        g(j10, sectionName, i10);
    }

    public static final void g(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        p381v3.a.d(sectionName, i10);
    }

    public static final void h(long j10, String sectionName, int i10, long j11) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        g(j10, sectionName, i10);
    }

    public static final void i(long j10) {
        p381v3.a.f();
    }

    public static final boolean j(long j10) {
        return false;
    }

    public static final void k(TraceListener traceListener) {
    }

    public static final void l(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        a(j10, sectionName, i10);
    }

    public static final void m(long j10, String counterName, int i10) {
        Intrinsics.checkNotNullParameter(counterName, "counterName");
        p381v3.a.j(counterName, i10);
    }

    public static final void n(long j10, String str, EnumC0617a enumC0617a) {
    }

    public static final void o(long j10, String sectionName, Runnable block) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(block, "block");
        c(j10, sectionName);
        try {
            block.run();
        } finally {
            i(j10);
        }
    }

    public static final void p(TraceListener traceListener) {
    }
}

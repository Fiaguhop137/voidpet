package H3;

import G3.n;
import G3.q;
import G3.r;
import If.C1106h;
import If.InterfaceC1107i;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f4154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f4155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4157d;

        a(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4156c = obj;
            this.f4157d |= Integer.MIN_VALUE;
            return e.e(null, this);
        }
    }

    public static final void a(A3.a.b bVar) {
        try {
            bVar.o();
        } catch (Exception unused) {
        }
    }

    public static final n.a b(n.a aVar, String str) {
        int iG0 = StringsKt.g0(str, ':', 0, false, 6, null);
        if (iG0 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iG0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = StringsKt.f1(strSubstring).toString();
        String strSubstring2 = str.substring(iG0 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        aVar.a(string, strSubstring2);
        return aVar;
    }

    public static final void c(AutoCloseable autoCloseable) {
        try {
            p002a1.e.a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final n d(n nVar, n nVar2) {
        n.a aVarD = nVar.d();
        for (Map.Entry entry : nVar2.b().entrySet()) {
            aVarD.d((String) entry.getKey(), (List) entry.getValue());
        }
        return aVarD.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(r rVar, Ed.b bVar) {
        a aVar;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        InterfaceC1107i interfaceC1107i;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f4157d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4157d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f4156c;
        Object objE = Fd.b.e();
        int i11 = aVar.f4157d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1107i = (C1106h) aVar.f4155b;
            autoCloseable = (AutoCloseable) aVar.f4154a;
            try {
                Ad.r.b(obj);
                autoCloseable2 = autoCloseable;
                Kd.a.a(autoCloseable2, null);
                return interfaceC1107i;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    Kd.a.a(autoCloseable, th);
                    throw th3;
                }
            }
        }
        Ad.r.b(obj);
        try {
            InterfaceC1107i c1106h = new C1106h();
            aVar.f4154a = rVar;
            aVar.f4155b = c1106h;
            aVar.f4157d = 1;
            if (rVar.x0(c1106h, aVar) == objE) {
                return objE;
            }
            autoCloseable2 = rVar;
            interfaceC1107i = c1106h;
            Kd.a.a(autoCloseable2, null);
            return interfaceC1107i;
        } catch (Throwable th4) {
            autoCloseable = rVar;
            th = th4;
            throw th;
        }
    }

    public static final r f(q qVar) {
        r rVarC = qVar.c();
        if (rVarC != null) {
            return rVarC;
        }
        throw new IllegalStateException("body == null");
    }
}

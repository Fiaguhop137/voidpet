package Wc;

import Ad.r;
import android.app.Activity;
import android.content.Context;
import javax.crypto.Cipher;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p088ef.AbstractC3289i;
import p088ef.C3282e0;
import p088ef.L0;
import p088ef.O;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15004d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p173jb.b f15006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15007c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: Wc.b$b, reason: collision with other inner class name */
    static final class C0202b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f15008a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15010c;

        C0202b(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15008a = obj;
            this.f15010c |= Integer.MIN_VALUE;
            return b.this.c(null, false, null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f15011a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15013c;

        c(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15011a = obj;
            this.f15013c |= Integer.MIN_VALUE;
            return b.this.e(null, null, this);
        }
    }

    static final class d extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Wc.c f15015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Cipher f15016c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Wc.c cVar, Cipher cipher, Ed.b bVar) {
            super(2, bVar);
            this.f15015b = cVar;
            this.f15016c = cipher;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            return new d(this.f15015b, this.f15016c, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((d) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Wc.a {
            Object objE = Fd.b.e();
            int i10 = this.f15014a;
            if (i10 == 0) {
                r.b(obj);
                Wc.c cVar = this.f15015b;
                Cipher cipher = this.f15016c;
                this.f15014a = 1;
                obj = cVar.b(cipher, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            q.f.b bVar = (q.f.b) obj;
            if (bVar != null) {
                return bVar;
            }
            throw new Wc.a("Couldn't get the authentication result", null, 2, null);
        }
    }

    public b(Context context, p173jb.b moduleRegistry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleRegistry, "moduleRegistry");
        this.f15005a = context;
        this.f15006b = moduleRegistry;
    }

    private final Activity d() {
        Object objB = this.f15006b.b(p227mb.a.class);
        Intrinsics.checkNotNullExpressionValue(objB, "getModule(...)");
        return ((p227mb.a) objB).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Cipher cipher, String str, Ed.b bVar) throws Wc.a {
        c cVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f15013c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f15013c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objG = cVar.f15011a;
        Object objE = Fd.b.e();
        int i11 = cVar.f15013c;
        try {
            if (i11 == 0) {
                r.b(objG);
                if (this.f15007c) {
                    throw new Wc.a("Authentication is already in progress", null, 2, null);
                }
                this.f15007c = true;
                b();
                Activity activityD = d();
                androidx.fragment.app.j jVar = activityD instanceof androidx.fragment.app.j ? (androidx.fragment.app.j) activityD : null;
                if (jVar == null) {
                    throw new Wc.a("Cannot display biometric prompt when the app is not in the foreground", null, 2, null);
                }
                Wc.c cVar2 = new Wc.c(jVar, this.f15005a, str);
                L0 l0T0 = C3282e0.c().t0();
                d dVar = new d(cVar2, cipher, null);
                cVar.f15013c = 1;
                objG = AbstractC3289i.g(l0T0, dVar, cVar);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(objG);
            }
            this.f15007c = false;
            return objG;
        } catch (Throwable th) {
            this.f15007c = false;
            throw th;
        }
    }

    public final void b() throws Wc.a {
        p287q.e eVarG = p287q.e.g(this.f15005a);
        Intrinsics.checkNotNullExpressionValue(eVarG, "from(...)");
        int iA = eVarG.a(15);
        if (iA == -2) {
            throw new Wc.a("Biometric authentication is unsupported", null, 2, null);
        }
        if (iA == -1) {
            throw new Wc.a("Biometric authentication status is unknown", null, 2, null);
        }
        if (iA != 1) {
            if (iA == 15) {
                throw new Wc.a("An update is required before the biometrics can be used", null, 2, null);
            }
            if (iA == 11) {
                throw new Wc.a("No biometrics are currently enrolled", null, 2, null);
            }
            if (iA != 12) {
                return;
            }
        }
        throw new Wc.a("No hardware available for biometric authentication. Use expo-local-authentication to check if the device supports it", null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Cipher cipher, boolean z10, String str, Ed.b bVar) throws Wc.a {
        C0202b c0202b;
        Cipher cipherA;
        if (bVar instanceof C0202b) {
            c0202b = (C0202b) bVar;
            int i10 = c0202b.f15010c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0202b.f15010c = i10 - Integer.MIN_VALUE;
            } else {
                c0202b = new C0202b(bVar);
            }
        } else {
            c0202b = new C0202b(bVar);
        }
        Object objE = c0202b.f15008a;
        Object objE2 = Fd.b.e();
        int i11 = c0202b.f15010c;
        if (i11 == 0) {
            r.b(objE);
            if (!z10) {
                return cipher;
            }
            c0202b.f15010c = 1;
            objE = e(cipher, str, c0202b);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(objE);
        }
        q.f.c cVarB = ((q.f.b) objE).b();
        if (cVarB == null || (cipherA = cVarB.a()) == null) {
            throw new Wc.a("Couldn't get cipher from authentication result", null, 2, null);
        }
        return cipherA;
    }
}

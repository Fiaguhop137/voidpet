package Pc;

import Ad.j;
import Rb.u;
import Zb.i;
import android.content.Context;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;
import p013ac.f;
import p013ac.h;
import p013ac.k;
import p013ac.m;
import p013ac.t;
import p157ic.C3594b;
import p157ic.C3596d;
import p157ic.P;
import p157ic.a0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LPc/e;", "Lcc/c;", "<init>", "()V", "Lcc/e;", "j", "()Lcc/e;", "", "z", "()Ljava/lang/String;", "LPc/a;", "d", "Lkotlin/Lazy;", "y", "()LPc/a;", "installationId", "LPc/b;", "e", "A", "()LPc/b;", "mRegistrationInfo", "Landroid/content/Context;", "x", "()Landroid/content/Context;", "context", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class e extends p049cc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy installationId = j.b(new Pc.c(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy mRegistrationInfo = j.b(new Pc.d(this));

    public static final class a implements Function1 {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return e.this.z();
        }
    }

    public static final class b implements Function1 {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return e.this.A().a();
        }
    }

    public static final class c implements Function2 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            Intrinsics.checkNotNullParameter(objArr, "<unused var>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            e.this.A().c((String) promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return Unit.f48228a;
        }
    }

    public static final class d implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f8889a = new d();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return F.e(String.class);
        }
    }

    /* JADX INFO: renamed from: Pc.e$e, reason: collision with other inner class name */
    public static final class C0149e implements Function1 {
        public C0149e() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
            e.this.A().c((String) objArr[0]);
            return Unit.f48228a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pc.b A() {
        return (Pc.b) this.mRegistrationInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pc.a B(e eVar) {
        return new Pc.a(eVar.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pc.b C(e eVar) {
        return new Pc.b(eVar.x());
    }

    @Override // p049cc.c
    @NotNull
    public p049cc.e j() {
        p013ac.e oVar;
        p013ac.e oVar2;
        p381v3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            p049cc.d dVar = new p049cc.d(this);
            dVar.u("NotificationsServerRegistrationModule");
            C3594b[] c3594bArr = new C3594b[0];
            a aVar = new a();
            Class cls = Integer.TYPE;
            boolean zB = Intrinsics.b(String.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            if (zB) {
                oVar = new m("getInstallationIdAsync", c3594bArr, aVar);
            } else if (Intrinsics.b(String.class, cls4)) {
                oVar = new h("getInstallationIdAsync", c3594bArr, aVar);
            } else if (Intrinsics.b(String.class, cls3)) {
                oVar = new p013ac.j("getInstallationIdAsync", c3594bArr, aVar);
            } else if (Intrinsics.b(String.class, cls2)) {
                oVar = new k("getInstallationIdAsync", c3594bArr, aVar);
            } else {
                oVar = Intrinsics.b(String.class, String.class) ? new p013ac.o("getInstallationIdAsync", c3594bArr, aVar) : new t("getInstallationIdAsync", c3594bArr, aVar);
            }
            dVar.m().put("getInstallationIdAsync", oVar);
            dVar.m().put("getRegistrationInfoAsync", new t("getRegistrationInfoAsync", new C3594b[0], new b()));
            if (Intrinsics.b(String.class, u.class)) {
                oVar2 = new f("setRegistrationInfoAsync", new C3594b[0], new c());
            } else {
                a0 a0VarO = dVar.o();
                C3594b c3594b = (C3594b) C3596d.f43900a.a().get(new Pair(F.b(String.class), Boolean.TRUE));
                if (c3594b == null) {
                    c3594b = new C3594b(new P(F.b(String.class), true, d.f8889a), a0VarO);
                }
                C3594b[] c3594bArr2 = {c3594b};
                C0149e c0149e = new C0149e();
                if (Intrinsics.b(Unit.class, cls)) {
                    oVar2 = new m("setRegistrationInfoAsync", c3594bArr2, c0149e);
                } else if (Intrinsics.b(Unit.class, cls4)) {
                    oVar2 = new h("setRegistrationInfoAsync", c3594bArr2, c0149e);
                } else if (Intrinsics.b(Unit.class, cls3)) {
                    oVar2 = new p013ac.j("setRegistrationInfoAsync", c3594bArr2, c0149e);
                } else if (Intrinsics.b(Unit.class, cls2)) {
                    oVar2 = new k("setRegistrationInfoAsync", c3594bArr2, c0149e);
                } else {
                    oVar2 = Intrinsics.b(Unit.class, String.class) ? new p013ac.o("setRegistrationInfoAsync", c3594bArr2, c0149e) : new t("setRegistrationInfoAsync", c3594bArr2, c0149e);
                }
            }
            dVar.m().put("setRegistrationInfoAsync", oVar2);
            return dVar.w();
        } finally {
            p381v3.a.f();
        }
    }

    public final Context x() throws i {
        Context contextA = f().A();
        if (contextA != null) {
            return contextA;
        }
        throw new i();
    }

    protected final Pc.a y() {
        return (Pc.a) this.installationId.getValue();
    }

    public String z() {
        String strB = y().b();
        Intrinsics.checkNotNullExpressionValue(strB, "getOrCreateUUID(...)");
        return strB;
    }
}

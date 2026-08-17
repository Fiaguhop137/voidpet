package Oc;

import Ad.v;
import Rb.u;
import Y0.p;
import Zb.i;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
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
import p013ac.j;
import p013ac.k;
import p013ac.m;
import p013ac.t;
import p157ic.C3594b;
import p157ic.C3596d;
import p157ic.P;
import p157ic.a0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LOc/c;", "Lcc/c;", "<init>", "()V", "LRb/u;", "promise", "", "C", "(LRb/u;)V", "E", "F", "Lcc/e;", "j", "()Lcc/e;", "LOb/a;", "B", "()LOb/a;", "permissions", "Landroid/content/Context;", "A", "()Landroid/content/Context;", "context", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends p049cc.c {

    public static final class a implements Function2 {
        public a() {
        }

        public final void a(Object[] objArr, u promise) throws p372uc.a {
            Intrinsics.checkNotNullParameter(objArr, "<unused var>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            if (c.this.A().getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                c.this.E(promise);
            } else {
                c.this.C(promise);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws p372uc.a {
            a((Object[]) obj, (u) obj2);
            return Unit.f48228a;
        }
    }

    public static final class b implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8555a = new b();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return F.n(u.class);
        }
    }

    /* JADX INFO: renamed from: Oc.c$c, reason: collision with other inner class name */
    public static final class C0145c implements Function1 {
        public C0145c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws p372uc.a {
            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
            u uVar = (u) objArr[0];
            if (c.this.A().getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                c.this.E(uVar);
            } else {
                c.this.C(uVar);
            }
            return Unit.f48228a;
        }
    }

    public static final class d implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f8557a = new d();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return F.e(p191kb.b.class);
        }
    }

    public static final class e implements Function2 {
        public e() {
        }

        public final void a(Object[] objArr, u promise) throws p372uc.a {
            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            if (c.this.A().getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                c.this.E(promise);
            } else {
                c.this.F(promise);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws p372uc.a {
            a((Object[]) obj, (u) obj2);
            return Unit.f48228a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context A() throws i {
        Context contextA = f().A();
        if (contextA != null) {
            return contextA;
        }
        throw new i();
    }

    private final Ob.a B() throws p372uc.a {
        Ob.a aVarZ = f().z();
        if (aVarZ != null) {
            return aVarZ;
        }
        throw new p372uc.a(F.b(Ob.a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(u promise) throws p372uc.a {
        Ob.a aVarB = B();
        Oc.a aVar = new Oc.a(this, promise);
        String[] strArr = Oc.d.f8559a;
        aVarB.b(aVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(c cVar, u uVar, Map permissionsMap) {
        boolean z10;
        boolean z11;
        String strG;
        Intrinsics.checkNotNullParameter(permissionsMap, "permissionsMap");
        p pVarH = p.h(cVar.A());
        Intrinsics.checkNotNullExpressionValue(pVarH, "from(...)");
        boolean zA = pVarH.a();
        Bundle bundleA = p128h1.c.a(v.a("importance", Integer.valueOf(pVarH.j())));
        Object systemService = cVar.A().getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            bundleA.putInt("interruptionFilter", notificationManager.getCurrentInterruptionFilter());
        }
        boolean z12 = false;
        if (!permissionsMap.isEmpty()) {
            Iterator it = permissionsMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                } else if (((Ob.b) ((Map.Entry) it.next()).getValue()).b() != Ob.d.GRANTED) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (!permissionsMap.isEmpty()) {
            Iterator it2 = permissionsMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = true;
                    break;
                } else if (((Ob.b) ((Map.Entry) it2.next()).getValue()).b() != Ob.d.DENIED) {
                    z11 = false;
                    break;
                }
            }
        } else {
            z11 = true;
            break;
        }
        if (!permissionsMap.isEmpty()) {
            Iterator it3 = permissionsMap.entrySet().iterator();
            do {
                if (!it3.hasNext()) {
                    z12 = true;
                    break;
                }
            } while (((Ob.b) ((Map.Entry) it3.next()).getValue()).a());
        } else {
            z12 = true;
            break;
        }
        if (!z11 && zA) {
            strG = z10 ? Ob.d.GRANTED.g() : Ob.d.UNDETERMINED.g();
        } else {
            strG = Ob.d.DENIED.g();
        }
        uVar.resolve(p128h1.c.a(v.a("expires", "never"), v.a("status", strG), v.a("canAskAgain", Boolean.valueOf(z12)), v.a("granted", Boolean.valueOf(z10)), v.a("android", bundleA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(u promise) {
        p pVarH = p.h(A());
        Intrinsics.checkNotNullExpressionValue(pVarH, "from(...)");
        boolean zA = pVarH.a();
        Ob.d dVar = zA ? Ob.d.GRANTED : Ob.d.DENIED;
        Bundle bundleA = p128h1.c.a(v.a("importance", Integer.valueOf(pVarH.j())));
        Object systemService = A().getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            bundleA.putInt("interruptionFilter", notificationManager.getCurrentInterruptionFilter());
        }
        promise.resolve(p128h1.c.a(v.a("expires", "never"), v.a("status", dVar.g()), v.a("canAskAgain", Boolean.valueOf(zA)), v.a("granted", Boolean.valueOf(dVar == Ob.d.GRANTED)), v.a("android", bundleA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(u promise) throws p372uc.a {
        Ob.a aVarB = B();
        Oc.b bVar = new Oc.b(this, promise);
        String[] strArr = Oc.d.f8559a;
        aVarB.e(bVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(c cVar, u uVar, Map map) throws p372uc.a {
        cVar.C(uVar);
    }

    @Override // p049cc.c
    @NotNull
    public p049cc.e j() {
        p013ac.e oVar;
        p013ac.e fVar;
        p381v3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            p049cc.d dVar = new p049cc.d(this);
            dVar.u("ExpoNotificationPermissionsModule");
            if (Intrinsics.b(u.class, u.class)) {
                fVar = new f("getPermissionsAsync", new C3594b[0], new a());
            } else {
                a0 a0VarO = dVar.o();
                C3594b c3594b = (C3594b) C3596d.f43900a.a().get(new Pair(F.b(u.class), Boolean.FALSE));
                if (c3594b == null) {
                    c3594b = new C3594b(new P(F.b(u.class), false, b.f8555a), a0VarO);
                }
                C3594b[] c3594bArr = {c3594b};
                C0145c c0145c = new C0145c();
                if (Intrinsics.b(Unit.class, Integer.TYPE)) {
                    oVar = new m("getPermissionsAsync", c3594bArr, c0145c);
                } else if (Intrinsics.b(Unit.class, Boolean.TYPE)) {
                    oVar = new h("getPermissionsAsync", c3594bArr, c0145c);
                } else if (Intrinsics.b(Unit.class, Double.TYPE)) {
                    oVar = new j("getPermissionsAsync", c3594bArr, c0145c);
                } else if (Intrinsics.b(Unit.class, Float.TYPE)) {
                    oVar = new k("getPermissionsAsync", c3594bArr, c0145c);
                } else {
                    oVar = Intrinsics.b(Unit.class, String.class) ? new p013ac.o("getPermissionsAsync", c3594bArr, c0145c) : new t("getPermissionsAsync", c3594bArr, c0145c);
                }
                fVar = oVar;
            }
            dVar.m().put("getPermissionsAsync", fVar);
            a0 a0VarO2 = dVar.o();
            C3594b c3594b2 = (C3594b) C3596d.f43900a.a().get(new Pair(F.b(p191kb.b.class), Boolean.TRUE));
            if (c3594b2 == null) {
                c3594b2 = new C3594b(new P(F.b(p191kb.b.class), true, d.f8557a), a0VarO2);
            }
            dVar.m().put("requestPermissionsAsync", new f("requestPermissionsAsync", new C3594b[]{c3594b2}, new e()));
            return dVar.w();
        } finally {
            p381v3.a.f();
        }
    }
}

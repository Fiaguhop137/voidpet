package com.facebook.react;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2298y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f31312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Y f31313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f31315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.facebook.react.devsupport.U f31316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private O f31317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC2299z f31318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private B6.a f31319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31320i;

    public C2298y(Activity activity, O o10, String str, Bundle bundle, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        D6.e.b();
        this.f31320i = z10;
        this.f31312a = activity;
        this.f31314c = str;
        this.f31315d = bundle;
        this.f31316e = new com.facebook.react.devsupport.U();
        this.f31317f = o10;
    }

    public C2298y(Activity activity, InterfaceC2299z interfaceC2299z, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f31320i = D6.e.b();
        this.f31312a = activity;
        this.f31314c = str;
        this.f31315d = bundle;
        this.f31316e = new com.facebook.react.devsupport.U();
        this.f31318g = interfaceC2299z;
    }

    private final p456z6.e d() {
        O o10;
        I iC;
        if (D6.e.a()) {
            InterfaceC2299z interfaceC2299z = this.f31318g;
            if ((interfaceC2299z != null ? interfaceC2299z.l() : null) != null) {
                InterfaceC2299z interfaceC2299z2 = this.f31318g;
                if (interfaceC2299z2 != null) {
                    return interfaceC2299z2.l();
                }
                return null;
            }
        }
        O o11 = this.f31317f;
        if (o11 != null && o11.g()) {
            O o12 = this.f31317f;
            if ((o12 != null ? o12.c() : null) != null && (o10 = this.f31317f) != null && (iC = o10.c()) != null) {
                return iC.E();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(C2298y c2298y) {
        O o10;
        I iC;
        O o11 = c2298y.f31317f;
        if (o11 == null || !o11.g()) {
            return;
        }
        O o12 = c2298y.f31317f;
        if ((o12 != null ? o12.c() : null) == null || (o10 = c2298y.f31317f) == null || (iC = o10.c()) == null) {
            return;
        }
        iC.k0();
    }

    protected Y b() {
        Y y10 = new Y(this.f31312a);
        y10.setIsFabric(this.f31320i);
        return y10;
    }

    public final ReactContext c() {
        if (!D6.e.a()) {
            return e().D();
        }
        InterfaceC2299z interfaceC2299z = this.f31318g;
        if (interfaceC2299z == null || interfaceC2299z == null) {
            return null;
        }
        return interfaceC2299z.i();
    }

    public final I e() {
        O o10 = this.f31317f;
        if (o10 == null) {
            throw new IllegalStateException("Cannot get ReactInstanceManager without a ReactNativeHost.");
        }
        I iC = o10.c();
        Intrinsics.checkNotNullExpressionValue(iC, "getReactInstanceManager(...)");
        return iC;
    }

    public final Y f() {
        if (!D6.e.a()) {
            return this.f31313b;
        }
        B6.a aVar = this.f31319h;
        if (aVar != null) {
            return (Y) (aVar != null ? aVar.a() : null);
        }
        return null;
    }

    public final void g(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        if (D6.e.a()) {
            InterfaceC2299z interfaceC2299z = this.f31318g;
            if (this.f31319h == null && interfaceC2299z != null) {
                this.f31319h = interfaceC2299z.j(this.f31312a, appKey, this.f31315d);
            }
            B6.a aVar = this.f31319h;
            if (aVar != null) {
                aVar.start();
                return;
            }
            return;
        }
        if (this.f31313b != null) {
            throw new IllegalStateException("Cannot loadApp while app is already running.");
        }
        Y yB = b();
        this.f31313b = yB;
        O o10 = this.f31317f;
        if (o10 == null || yB == null) {
            return;
        }
        yB.u(o10 != null ? o10.c() : null, appKey, this.f31315d);
    }

    public final void h(int i10, int i11, Intent intent, boolean z10) {
        O o10;
        I iC;
        InterfaceC2299z interfaceC2299z;
        if (D6.e.a() && (interfaceC2299z = this.f31318g) != null && z10) {
            if (interfaceC2299z != null) {
                interfaceC2299z.onActivityResult(this.f31312a, i10, i11, intent);
                return;
            }
            return;
        }
        O o11 = this.f31317f;
        if (o11 == null || !o11.g() || !z10 || (o10 = this.f31317f) == null || (iC = o10.c()) == null) {
            return;
        }
        iC.V(this.f31312a, i10, i11, intent);
    }

    public final boolean i() {
        I iC;
        InterfaceC2299z interfaceC2299z;
        if (D6.e.a() && (interfaceC2299z = this.f31318g) != null) {
            if (interfaceC2299z != null) {
                interfaceC2299z.c();
            }
            return true;
        }
        O o10 = this.f31317f;
        if (o10 == null || !o10.g()) {
            return false;
        }
        O o11 = this.f31317f;
        if (o11 != null && (iC = o11.c()) != null) {
            iC.W();
        }
        return true;
    }

    public final void j(Configuration configuration) {
        InterfaceC2299z interfaceC2299z;
        if (D6.e.a() && (interfaceC2299z = this.f31318g) != null) {
            if (interfaceC2299z != null) {
                Activity activity = this.f31312a;
                if (activity == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                interfaceC2299z.m(activity);
                return;
            }
            return;
        }
        O o10 = this.f31317f;
        if (o10 == null || !o10.g()) {
            return;
        }
        I iE = e();
        Activity activity2 = this.f31312a;
        if (activity2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        iE.X(activity2, configuration);
    }

    public final void k() {
        O o10;
        I iC;
        InterfaceC2299z interfaceC2299z;
        x();
        if (D6.e.a() && (interfaceC2299z = this.f31318g) != null) {
            if (interfaceC2299z != null) {
                interfaceC2299z.o(this.f31312a);
                return;
            }
            return;
        }
        O o11 = this.f31317f;
        if (o11 == null || !o11.g() || (o10 = this.f31317f) == null || (iC = o10.c()) == null) {
            return;
        }
        iC.Z(this.f31312a);
    }

    public final void l() {
        O o10;
        I iC;
        InterfaceC2299z interfaceC2299z;
        if (D6.e.a() && (interfaceC2299z = this.f31318g) != null) {
            if (interfaceC2299z != null) {
                interfaceC2299z.n(this.f31312a);
                return;
            }
            return;
        }
        O o11 = this.f31317f;
        if (o11 == null || !o11.g() || (o10 = this.f31317f) == null || (iC = o10.c()) == null) {
            return;
        }
        iC.b0(this.f31312a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        O o10;
        I iC;
        InterfaceC2299z interfaceC2299z;
        if (!(this.f31312a instanceof M6.a)) {
            throw new ClassCastException("Host Activity `" + this.f31312a.getClass().getSimpleName() + "` does not implement DefaultHardwareBackBtnHandler");
        }
        if (D6.e.a() && (interfaceC2299z = this.f31318g) != null) {
            if (interfaceC2299z != null) {
                Activity activity = this.f31312a;
                Intrinsics.d(activity, "null cannot be cast to non-null type com.facebook.react.modules.core.DefaultHardwareBackBtnHandler");
                interfaceC2299z.k(activity, (M6.a) activity);
                return;
            }
            return;
        }
        O o11 = this.f31317f;
        if (o11 == null || !o11.g() || (o10 = this.f31317f) == null || (iC = o10.c()) == null) {
            return;
        }
        Activity activity2 = this.f31312a;
        Intrinsics.d(activity2, "null cannot be cast to non-null type com.facebook.react.modules.core.DefaultHardwareBackBtnHandler");
        iC.d0(activity2, (M6.a) activity2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public final boolean n(int i10, KeyEvent event) {
        O o10;
        O o11;
        Intrinsics.checkNotNullParameter(event, "event");
        if (i10 != 90) {
            return false;
        }
        if (D6.e.a()) {
            InterfaceC2299z interfaceC2299z = this.f31318g;
            if ((interfaceC2299z != null ? interfaceC2299z.l() : null) == null) {
                o10 = this.f31317f;
                return o10 != null ? false : false;
            }
        } else {
            o10 = this.f31317f;
            if (o10 != null || !o10.g() || (o11 = this.f31317f) == null || !o11.f()) {
                return false;
            }
        }
        event.startTracking();
        return true;
    }

    public final boolean o(int i10) {
        O o10;
        I iC;
        InterfaceC2299z interfaceC2299z;
        if (i10 != 90) {
            return false;
        }
        if (D6.e.a() && (interfaceC2299z = this.f31318g) != null) {
            p456z6.e eVarL = interfaceC2299z != null ? interfaceC2299z.l() : null;
            if (eVarL == null || (eVarL instanceof t0)) {
                return false;
            }
            eVarL.C();
            return true;
        }
        O o11 = this.f31317f;
        if (o11 == null || !o11.g() || (o10 = this.f31317f) == null || !o10.f()) {
            return false;
        }
        O o12 = this.f31317f;
        if (o12 != null && (iC = o12.c()) != null) {
            iC.s0();
        }
        return true;
    }

    public final boolean p(Intent intent) {
        I iC;
        InterfaceC2299z interfaceC2299z;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (D6.e.a() && (interfaceC2299z = this.f31318g) != null) {
            if (interfaceC2299z != null) {
                interfaceC2299z.onNewIntent(intent);
            }
            return true;
        }
        O o10 = this.f31317f;
        if (o10 == null || !o10.g()) {
            return false;
        }
        O o11 = this.f31317f;
        if (o11 != null && (iC = o11.c()) != null) {
            iC.f0(intent);
        }
        return true;
    }

    public final void q() {
        O o10;
        I iC;
        InterfaceC2299z interfaceC2299z;
        if (D6.e.a() && (interfaceC2299z = this.f31318g) != null) {
            if (interfaceC2299z != null) {
                interfaceC2299z.q(this.f31312a);
                return;
            }
            return;
        }
        O o11 = this.f31317f;
        if (o11 == null || !o11.g() || (o10 = this.f31317f) == null || (iC = o10.c()) == null) {
            return;
        }
        iC.g0(this.f31312a);
    }

    public final void r(boolean z10) {
        O o10;
        I iC;
        InterfaceC2299z interfaceC2299z;
        if (D6.e.a() && (interfaceC2299z = this.f31318g) != null) {
            if (interfaceC2299z != null) {
                interfaceC2299z.onWindowFocusChange(z10);
                return;
            }
            return;
        }
        O o11 = this.f31317f;
        if (o11 == null || !o11.g() || (o10 = this.f31317f) == null || (iC = o10.c()) == null) {
            return;
        }
        iC.h0(z10);
    }

    public final void s() {
        p456z6.e eVarD = d();
        if (eVarD == null) {
            return;
        }
        if (!(eVarD instanceof t0)) {
            eVarD.z();
            return;
        }
        if (!D6.e.a()) {
            UiThreadUtil.runOnUiThread(new RunnableC2297x(this));
            return;
        }
        InterfaceC2299z interfaceC2299z = this.f31318g;
        if (interfaceC2299z != null) {
            interfaceC2299z.b("ReactDelegate.reload()");
        }
    }

    public final void u(Y y10) {
        this.f31313b = y10;
    }

    public final void v(B6.a aVar) {
        this.f31319h = aVar;
    }

    public final boolean w(int i10, KeyEvent keyEvent) {
        p456z6.e eVarD = d();
        if (eVarD != null && !(eVarD instanceof t0)) {
            if (i10 == 82) {
                eVarD.C();
                return true;
            }
            com.facebook.react.devsupport.U u10 = this.f31316e;
            if (Intrinsics.b(u10 != null ? Boolean.valueOf(u10.b(i10, this.f31312a.getCurrentFocus())) : null, Boolean.TRUE)) {
                eVarD.z();
                return true;
            }
        }
        return false;
    }

    public final void x() {
        if (D6.e.a()) {
            B6.a aVar = this.f31319h;
            if (aVar != null) {
                aVar.stop();
            }
            this.f31319h = null;
            return;
        }
        Y y10 = this.f31313b;
        if (y10 != null) {
            if (y10 != null) {
                y10.v();
            }
            this.f31313b = null;
        }
    }
}

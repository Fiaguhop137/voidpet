package p246nc;

import Rb.d;
import Rb.f;
import Rb.r;
import Rb.w;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.views.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p157ic.M;
import p157ic.N;

/* JADX INFO: loaded from: classes2.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f49948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f49949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f49950d;

    public a(String name, View view, Function1 function1) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f49947a = name;
        this.f49948b = view;
        this.f49949c = function1;
    }

    private final WritableMap a(Object obj) {
        Object objB = M.b(M.f43874a, obj, null, false, 6, null);
        if ((objB instanceof Unit) || objB == null) {
            return null;
        }
        if (objB instanceof WritableMap) {
            return (WritableMap) objB;
        }
        WritableMap writableMapB = M.b.f43875a.b();
        N.b(writableMapB, "payload", objB);
        return writableMapB;
    }

    @Override // p246nc.b
    public void invoke(Object obj) {
        Context context = this.f49948b.getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        NativeModulesProxy nativeModulesProxyA = w.a((ReactContext) context);
        if (nativeModulesProxyA == null) {
            return;
        }
        d dVarF = nativeModulesProxyA.getKotlinInteropModuleRegistry().f();
        if (!this.f49950d) {
            r rVarK = dVarF.u().h().k(this.f49948b.getClass());
            if (rVarK == null) {
                p263ob.d.i(f.a(), "⚠️ Cannot get module holder for " + this.f49948b.getClass(), null, 2, null);
                return;
            }
            expo.modules.kotlin.views.r rVarQ = dVarF.u().h().q(rVarK, this.f49948b.getClass());
            b bVarC = rVarQ != null ? rVarQ.c() : null;
            if (bVarC == null) {
                p263ob.d.i(f.a(), "⚠️ Cannot get callbacks for " + rVarK.g().getClass(), null, 2, null);
                return;
            }
            String[] strArrA = bVarC.a();
            int length = strArrA.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    p263ob.d.i(f.a(), "⚠️ Event " + this.f49947a + " wasn't exported from " + rVarK.g().getClass(), null, 2, null);
                    return;
                }
                if (Intrinsics.b(strArrA[i10], this.f49947a)) {
                    this.f49950d = true;
                    break;
                }
                i10++;
            }
        }
        Yb.b bVarQ = dVarF.q();
        if (bVarQ != null) {
            View view = this.f49948b;
            String str = this.f49947a;
            WritableMap writableMapA = a(obj);
            Function1 function1 = this.f49949c;
            bVarQ.c(view, str, writableMapA, function1 != null ? (Short) function1.invoke(obj) : null);
        }
    }
}

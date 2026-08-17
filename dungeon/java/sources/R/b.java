package R;

import I.AbstractC1022b0;
import I.AbstractC1039h;
import I.AbstractC1083w;
import I.InterfaceC1054m;
import I.T1;
import S.B;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f9847a = 36;

    public static final String c(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object d(Object[] objArr, i iVar, String str, Function0 function0, InterfaceC1054m interfaceC1054m, int i10, int i11) {
        Object[] objArr2;
        Object obj;
        Object objD;
        if ((i11 & 2) != 0) {
            iVar = l.f();
        }
        i iVar2 = iVar;
        int i12 = i11 & 4;
        Object objInvoke = null;
        if (i12 != 0) {
            str = null;
        }
        if (AbstractC1083w.L()) {
            AbstractC1083w.U(441892779, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)");
        }
        long jB = AbstractC1039h.b(interfaceC1054m, 0);
        if (str == null || str.length() == 0) {
            str = Long.toString(jB, CharsKt.checkRadix(f9847a));
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        }
        String str2 = str;
        Intrinsics.d(iVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        e eVar = (e) interfaceC1054m.T(h.g());
        Object objD2 = interfaceC1054m.D();
        InterfaceC1054m.a aVar = InterfaceC1054m.f4688a;
        if (objD2 == aVar.a()) {
            if (eVar != null && (objD = eVar.d(str2)) != null) {
                objInvoke = iVar2.a(objD);
            }
            if (objInvoke == null) {
                objInvoke = function0.invoke();
            }
            objArr2 = objArr;
            Object dVar = new d(iVar2, eVar, str2, objInvoke, objArr2);
            interfaceC1054m.t(dVar);
            objD2 = dVar;
        } else {
            objArr2 = objArr;
        }
        d dVar2 = (d) objD2;
        Object objB = dVar2.b(objArr2);
        if (objB == null) {
            objB = function0.invoke();
        }
        boolean zF = interfaceC1054m.F(dVar2) | ((((i10 & 112) ^ 48) > 32 && interfaceC1054m.F(iVar2)) || (i10 & 48) == 32) | interfaceC1054m.F(eVar) | interfaceC1054m.U(str2) | interfaceC1054m.F(objB) | interfaceC1054m.F(objArr2);
        Object objD3 = interfaceC1054m.D();
        if (zF || objD3 == aVar.a()) {
            Object[] objArr3 = objArr2;
            obj = objB;
            Object aVar2 = new a(dVar2, iVar2, eVar, str2, obj, objArr3);
            interfaceC1054m.t(aVar2);
            objD3 = aVar2;
        } else {
            obj = objB;
        }
        AbstractC1022b0.f((Function0) objD3, interfaceC1054m, 0);
        if (AbstractC1083w.L()) {
            AbstractC1083w.T();
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(d dVar, i iVar, e eVar, String str, Object obj, Object[] objArr) {
        dVar.d(iVar, eVar, str, obj, objArr);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(e eVar, Object obj) {
        String strC;
        if (obj == null || eVar.b(obj)) {
            return;
        }
        if (obj instanceof B) {
            B b10 = (B) obj;
            if (b10.l() == T1.h() || b10.l() == T1.m() || b10.l() == T1.k()) {
                strC = "MutableState containing " + b10.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strC = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strC = c(obj);
        }
        throw new IllegalArgumentException(strC);
    }
}

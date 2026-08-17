package androidx.compose.ui.platform;

import Ad.InterfaceC0795e;
import I.T1;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.platform.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1885v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class[] f22179a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: androidx.compose.ui.platform.v0$a */
    static final class a extends kotlin.jvm.internal.o implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f22180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p237n3.f f22181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22182c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, p237n3.f fVar, String str) {
            super(0);
            this.f22180a = z10;
            this.f22181b = fVar;
            this.f22182c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18invoke();
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m18invoke() {
            if (this.f22180a) {
                this.f22181b.e(this.f22182c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.v0$b */
    static final class b extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22183a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(AbstractC1885v0.f(obj));
        }
    }

    public static final C1881t0 b(View view, p237n3.i iVar) {
        Object parent = view.getParent();
        Intrinsics.d(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(V.n.f13780H);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, iVar);
    }

    public static final C1881t0 c(String str, p237n3.i iVar) {
        boolean z10;
        String str2 = R.e.class.getSimpleName() + ':' + str;
        p237n3.f fVarI = iVar.i();
        Bundle bundleA = fVarI.a(str2);
        R.e eVarC = R.h.c(bundleA != null ? h(bundleA) : null, b.f22183a);
        try {
            fVarI.c(str2, new C1883u0(eVarC));
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new C1881t0(eVarC, new a(z10, fVarI, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(R.e eVar) {
        return g(eVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof S.B) {
            S.B b10 = (S.B) obj;
            if (b10.l() != T1.h() && b10.l() != T1.m() && b10.l() != T1.k()) {
                return false;
            }
            Object value = b10.getValue();
            if (value == null) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof InterfaceC0795e) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class cls : f22179a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    private static final Map h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            Intrinsics.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}

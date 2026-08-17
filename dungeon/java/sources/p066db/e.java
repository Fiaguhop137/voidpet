package p066db;

import Ad.v;
import M6.g;
import Ob.a;
import Ob.b;
import Ob.c;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p227mb.d;
import p227mb.f;

/* JADX INFO: loaded from: classes2.dex */
public class e implements d, a, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p227mb.a f39892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f39894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f39895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Queue f39896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f39897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SharedPreferences f39898h;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39891a = context;
        this.f39896f = new LinkedList();
    }

    private final b B(String str, int i10) {
        Ob.d dVar;
        if (i10 == 0) {
            dVar = Ob.d.GRANTED;
        } else {
            dVar = y(str) ? Ob.d.DENIED : Ob.d.UNDETERMINED;
        }
        return new b(dVar, dVar == Ob.d.DENIED ? u(str) : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(p173jb.d dVar, Map permissionsMap) {
        boolean z10;
        boolean z11;
        String strG;
        Intrinsics.checkNotNullParameter(permissionsMap, "permissionsMap");
        boolean z12 = false;
        if (!permissionsMap.isEmpty()) {
            Iterator it = permissionsMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                } else if (((b) ((Map.Entry) it.next()).getValue()).b() != Ob.d.GRANTED) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (permissionsMap.isEmpty()) {
            z11 = false;
        } else {
            if (!permissionsMap.isEmpty()) {
                Iterator it2 = permissionsMap.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((b) ((Map.Entry) it2.next()).getValue()).b() != Ob.d.DENIED) {
                            z11 = false;
                        }
                    }
                }
            }
            z11 = true;
        }
        if (!permissionsMap.isEmpty()) {
            Iterator it3 = permissionsMap.entrySet().iterator();
            do {
                if (!it3.hasNext()) {
                    z12 = true;
                    break;
                }
            } while (((b) ((Map.Entry) it3.next()).getValue()).a());
        } else {
            z12 = true;
            break;
        }
        Bundle bundle = new Bundle();
        bundle.putString("expires", "never");
        if (z10) {
            strG = Ob.d.GRANTED.g();
        } else {
            strG = z11 ? Ob.d.DENIED.g() : Ob.d.UNDETERMINED.g();
        }
        bundle.putString("status", strG);
        bundle.putBoolean("canAskAgain", z12);
        bundle.putBoolean("granted", z10);
        dVar.resolve(bundle);
    }

    private final boolean D() {
        return Settings.System.canWrite(this.f39891a.getApplicationContext());
    }

    private final boolean E(String str) {
        if (Intrinsics.b(str, "android.permission.WRITE_SETTINGS")) {
            return D();
        }
        return z(str) == 0;
    }

    private final Map F(String[] strArr, int[] iArr) {
        HashMap map = new HashMap();
        for (Pair pair : AbstractC3952n.Z0(iArr, strArr)) {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            String str = (String) pair.getSecond();
            map.put(str, B(str, iIntValue));
        }
        return map;
    }

    private final void p(String[] strArr) {
        SharedPreferences sharedPreferences = this.f39898h;
        if (sharedPreferences == null) {
            Intrinsics.r("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str : strArr) {
            editorEdit.putBoolean(str, true);
        }
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(e eVar, c cVar, Map map) {
        int i10 = eVar.D() ? 0 : -1;
        Intrinsics.c(map);
        map.put("android.permission.WRITE_SETTINGS", eVar.B("android.permission.WRITE_SETTINGS", i10));
        cVar.a(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(e eVar, p173jb.d dVar, String[] strArr, Map map) {
        eVar.i(dVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private final void t() {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + this.f39891a.getPackageName()));
        intent.addFlags(268435456);
        this.f39893c = true;
        this.f39891a.startActivity(intent);
    }

    private final boolean u(String str) {
        Activity activityA;
        p227mb.a aVar = this.f39892b;
        return (aVar == null || (activityA = aVar.a()) == null || !Y0.b.t(activityA, str)) ? false : true;
    }

    private final g v() {
        return new a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(e eVar, int i10, String[] receivePermissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(receivePermissions, "receivePermissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (i10 != 13) {
            return false;
        }
        synchronized (eVar) {
            try {
                c cVar = eVar.f39897g;
                if (cVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.a(eVar.F(receivePermissions, grantResults));
                eVar.f39897g = null;
                Pair pair = (Pair) eVar.f39896f.poll();
                if (pair != null) {
                    p227mb.a aVar = eVar.f39892b;
                    Activity activityA = aVar != null ? aVar.a() : null;
                    M6.f fVar = activityA instanceof M6.f ? (M6.f) activityA : null;
                    if (fVar != null) {
                        eVar.f39897g = (c) pair.d();
                        fVar.a((String[]) pair.c(), 13, eVar.v());
                        return false;
                    }
                    c cVar2 = (c) pair.d();
                    String[] strArr = (String[]) pair.c();
                    int length = ((Object[]) pair.c()).length;
                    int[] iArr = new int[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr[i11] = -1;
                    }
                    cVar2.a(eVar.F(strArr, iArr));
                    for (Pair pair2 : eVar.f39896f) {
                        c cVar3 = (c) pair2.d();
                        String[] strArr2 = (String[]) pair2.c();
                        int length2 = ((Object[]) pair2.c()).length;
                        int[] iArr2 = new int[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            iArr2[i12] = -1;
                        }
                        cVar3.a(eVar.F(strArr2, iArr2));
                    }
                    eVar.f39896f.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean y(String str) {
        SharedPreferences sharedPreferences = this.f39898h;
        if (sharedPreferences == null) {
            Intrinsics.r("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(str, false);
    }

    private final int z(String str) {
        Activity activityA;
        p227mb.a aVar = this.f39892b;
        return (aVar == null || (activityA = aVar.a()) == null || !(activityA instanceof M6.f)) ? A(str) : Z0.b.a(activityA, str);
    }

    protected int A(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return Z0.b.a(this.f39891a, permission);
    }

    @Override // Ob.a
    public void b(c responseListener, String... permissions) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList(permissions.length);
        for (String str : permissions) {
            arrayList.add(Integer.valueOf(E(str) ? 0 : -1));
        }
        responseListener.a(F(permissions, CollectionsKt.T0(arrayList)));
    }

    @Override // Ob.a
    public void e(c responseListener, String... permissions) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        if (permissions.length == 0) {
            responseListener.a(new LinkedHashMap());
            return;
        }
        if (!AbstractC3952n.M(permissions, "android.permission.WRITE_SETTINGS")) {
            q(permissions, responseListener);
            return;
        }
        List listS0 = AbstractC3952n.S0(permissions);
        listS0.remove("android.permission.WRITE_SETTINGS");
        String[] strArr = (String[]) listS0.toArray(new String[0]);
        d dVar = new d(this, responseListener);
        if (D()) {
            if (strArr.length == 0) {
                dVar.a(new LinkedHashMap());
                return;
            } else {
                q(strArr, dVar);
                return;
            }
        }
        if (this.f39894d != null) {
            throw new IllegalStateException("Another permissions request is in progress. Await the old request and then try again.");
        }
        this.f39894d = dVar;
        this.f39895e = strArr;
        p(new String[]{"android.permission.WRITE_SETTINGS"});
        t();
    }

    @Override // p227mb.k
    public void f(p173jb.b moduleRegistry) {
        Intrinsics.checkNotNullParameter(moduleRegistry, "moduleRegistry");
        p227mb.a aVar = (p227mb.a) moduleRegistry.b(p227mb.a.class);
        if (aVar == null) {
            throw new IllegalStateException("Couldn't find implementation for ActivityProvider.");
        }
        this.f39892b = aVar;
        ((p245nb.c) moduleRegistry.b(p245nb.c.class)).b(this);
        this.f39898h = this.f39891a.getApplicationContext().getSharedPreferences("expo.modules.permissions.asked", 0);
    }

    @Override // Ob.a
    public void g(p173jb.d promise, String... permissions) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        e(new b(this, promise, permissions), (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    @Override // p227mb.d
    public List h() {
        return CollectionsKt.e(a.class);
    }

    @Override // Ob.a
    public void i(p173jb.d promise, String... permissions) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        b(new c(promise), (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    @Override // p227mb.f
    public void onHostDestroy() {
    }

    @Override // p227mb.f
    public void onHostPause() {
    }

    @Override // p227mb.f
    public void onHostResume() {
        if (this.f39893c) {
            this.f39893c = false;
            c cVar = this.f39894d;
            Intrinsics.c(cVar);
            String[] strArr = this.f39895e;
            Intrinsics.c(strArr);
            this.f39894d = null;
            this.f39895e = null;
            if (strArr.length == 0) {
                cVar.a(new LinkedHashMap());
            } else {
                q(strArr, cVar);
            }
        }
    }

    protected void q(String[] permissions, c listener) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(listener, "listener");
        x((String[]) Arrays.copyOf(permissions, permissions.length), listener);
    }

    protected final void x(String[] permissions, c listener) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(listener, "listener");
        p(permissions);
        p227mb.a aVar = this.f39892b;
        ComponentCallbacks2 componentCallbacks2A = aVar != null ? aVar.a() : null;
        if (!(componentCallbacks2A instanceof M6.f)) {
            int length = permissions.length;
            int[] iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = -1;
            }
            listener.a(F(permissions, iArr));
            return;
        }
        synchronized (this) {
            try {
                if (this.f39897g != null) {
                    this.f39896f.add(v.a(permissions, listener));
                } else {
                    this.f39897g = listener;
                    ((M6.f) componentCallbacks2A).a(permissions, 13, v());
                    Unit unit = Unit.f48228a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package p048cb;

import Ad.j;
import android.util.Log;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import p227mb.g;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27311b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f27312c = j.b(new p048cb.b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final expo.modules.adapters.react.a f27313a = new expo.modules.adapters.react.a(f27311b.a());

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return (List) c.f27312c.getValue();
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            p173jb.a aVar = p173jb.a.f47185a;
            return Cd.a.d(Integer.valueOf(aVar.a(F.b(((g) obj2).getClass()).n())), Integer.valueOf(aVar.a(F.b(((g) obj).getClass()).n())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c() {
        try {
            Object objInvoke = d.class.getMethod("getPackageList", null).invoke(null, null);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<expo.modules.core.interfaces.Package>");
            return CollectionsKt.K0((List) objInvoke, new b());
        } catch (Exception e10) {
            Log.e("ExpoModulesPackage", "Couldn't get expo package list.", e10);
            return CollectionsKt.l();
        }
    }

    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        List listCreateNativeModules = this.f27313a.createNativeModules(reactContext);
        Intrinsics.checkNotNullExpressionValue(listCreateNativeModules, "createNativeModules(...)");
        return listCreateNativeModules;
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        List listCreateViewManagers = this.f27313a.createViewManagers(reactContext);
        Intrinsics.checkNotNullExpressionValue(listCreateViewManagers, "createViewManagers(...)");
        return listCreateViewManagers;
    }
}

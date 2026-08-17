package expo.modules.kotlin.edgeToEdge;

import Ad.q;
import Ad.r;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import com.facebook.react.views.view.WindowUtilKt;
import expo.modules.core.BasePackage;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import p227mb.i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/edgeToEdge/EdgeToEdgePackage;", "Lexpo/modules/core/BasePackage;", "<init>", "()V", "Landroid/content/Context;", "activityContext", "", "Lmb/i;", "b", "(Landroid/content/Context;)Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EdgeToEdgePackage extends BasePackage {

    public static final class a implements i {
        a() {
        }

        @Override // p227mb.i
        public void a(Activity activity, Bundle bundle) {
            Object objB;
            Object objB2;
            Object obj = null;
            try {
                q.a aVar = q.f327b;
                int i10 = WindowUtilKt.f31260a;
                Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
                Object[] array = new ArrayList(0).toArray(new Object[0]);
                Method declaredMethod = WindowUtilKt.class.getDeclaredMethod("isEdgeToEdgeFeatureFlagOn", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, Arrays.copyOf(array, array.length));
                if (!(objInvoke instanceof Boolean)) {
                    objInvoke = null;
                }
                objB = q.b((Boolean) objInvoke);
            } catch (Throwable th) {
                q.a aVar2 = q.f327b;
                objB = q.b(r.a(th));
            }
            Throwable thD = q.d(objB);
            if (thD != null) {
                Log.e("EdgeToEdgePackage", "Failed to invoke 'isEdgeToEdgeFeatureFlagOn' on com.facebook.react.views.view.WindowUtilKt", thD);
            }
            if (q.f(objB)) {
                objB = null;
            }
            Boolean bool = (Boolean) objB;
            if (bool != null ? bool.booleanValue() : true) {
                Pair[] pairArr = {new Pair(Window.class, activity != null ? activity.getWindow() : null)};
                try {
                    int i11 = WindowUtilKt.f31260a;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add((Class) pairArr[0].c());
                    Class[] clsArr2 = (Class[]) arrayList.toArray(new Class[0]);
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pairArr[0].d());
                    Object[] array2 = arrayList2.toArray(new Object[0]);
                    Method declaredMethod2 = WindowUtilKt.class.getDeclaredMethod("enableEdgeToEdge", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                    declaredMethod2.setAccessible(true);
                    Object objInvoke2 = declaredMethod2.invoke(null, Arrays.copyOf(array2, array2.length));
                    if (objInvoke2 instanceof Unit) {
                        obj = objInvoke2;
                    }
                    objB2 = q.b((Unit) obj);
                } catch (Throwable th2) {
                    q.a aVar3 = q.f327b;
                    objB2 = q.b(r.a(th2));
                }
                Throwable thD2 = q.d(objB2);
                if (thD2 != null) {
                    Log.e("EdgeToEdgePackage", "Failed to invoke 'enableEdgeToEdge' on com.facebook.react.views.view.WindowUtilKt", thD2);
                }
                q.f(objB2);
                if (activity != null) {
                    Xb.a.b(activity);
                }
            }
        }
    }

    @Override // expo.modules.core.BasePackage, p227mb.g
    public List b(Context activityContext) {
        return CollectionsKt.e(new a());
    }
}

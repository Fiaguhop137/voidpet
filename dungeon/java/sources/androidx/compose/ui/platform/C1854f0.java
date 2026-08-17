package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.platform.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1854f0 implements InterfaceC1848c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1854f0 f22023b = new C1854f0();

    private C1854f0() {
    }

    @Override // androidx.compose.ui.platform.InterfaceC1848c0
    public Rect a(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e10) {
            if ((e10 instanceof NoSuchFieldException) || (e10 instanceof NoSuchMethodException) || (e10 instanceof IllegalAccessException) || (e10 instanceof InvocationTargetException)) {
                return C1852e0.f22019b.a(activity);
            }
            throw e10;
        }
    }
}

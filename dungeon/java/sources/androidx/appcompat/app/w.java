package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f20127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f20128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f20129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f20130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f20131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f20132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f20133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f20134h;

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f20134h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f20133g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f20134h = true;
        }
        Field field = f20133g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f20128b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f20127a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f20128b = true;
        }
        Field field2 = f20127a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f20130d) {
            try {
                f20129c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f20130d = true;
        }
        Class cls = f20129c;
        if (cls == null) {
            return;
        }
        if (!f20132f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f20131e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f20132f = true;
        }
        Field field = f20131e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}

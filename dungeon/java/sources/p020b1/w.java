package p020b1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p002a1.h;
import p146i1.j;
import p323s.f0;

/* JADX INFO: loaded from: classes.dex */
class w extends B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f25883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor f25884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f25885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f25886e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f25884c = constructor;
        f25883b = cls;
        f25885d = method2;
        f25886e = method;
    }

    w() {
    }

    private static boolean i(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f25885d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f25883b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f25886e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean k() {
        Method method = f25885d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object l() {
        try {
            return f25884c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p020b1.B
    public Typeface a(Context context, h.c cVar, Resources resources, int i10) {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        for (h.d dVar : cVar.a()) {
            ByteBuffer byteBufferB = C.b(context, resources, dVar.b());
            if (byteBufferB == null || !i(objL, byteBufferB, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return j(objL);
    }

    @Override // p020b1.B
    public Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i10) {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        f0 f0Var = new f0();
        for (j.b bVar : bVarArr) {
            Uri uriE = bVar.e();
            ByteBuffer byteBufferF = (ByteBuffer) f0Var.get(uriE);
            if (byteBufferF == null) {
                byteBufferF = C.f(context, cancellationSignal, uriE);
                f0Var.put(uriE, byteBufferF);
            }
            if (byteBufferF == null || !i(objL, byteBufferF, bVar.d(), bVar.g(), bVar.h())) {
                return null;
            }
        }
        Typeface typefaceJ = j(objL);
        if (typefaceJ == null) {
            return null;
        }
        return Typeface.create(typefaceJ, i10);
    }
}

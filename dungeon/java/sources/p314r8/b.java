package p314r8;

import android.os.IBinder;
import java.lang.reflect.Field;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a.AbstractBinderC0632a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f52423e;

    private b(Object obj) {
        this.f52423e = obj;
    }

    public static a c1(Object obj) {
        return new b(obj);
    }

    public static Object k(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f52423e;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            int length = declaredFields.length;
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 53);
            sb2.append("Unexpected number of IObjectWrapper declared fields: ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        r.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}

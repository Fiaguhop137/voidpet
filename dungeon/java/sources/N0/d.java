package N0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            c.f7167a.a("Unable to find PreviewProvider '" + str + '\'', e10);
            return null;
        }
    }

    public static final Object[] b(Class cls, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        int i11 = 0;
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            boolean z10 = false;
            Constructor<?> constructor = null;
            while (true) {
                if (i11 >= length) {
                    if (z10) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i11];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z10) {
                            z10 = true;
                            constructor = constructor2;
                        }
                    }
                    i11++;
                }
                constructor = null;
                break;
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            android.support.v4.media.session.b.a(objNewInstance);
            if (i10 < 0) {
                throw null;
            }
            throw null;
        } catch (Ld.b unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}

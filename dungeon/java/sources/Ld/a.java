package Ld;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.InterfaceC3968e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final d a(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Intrinsics.checkNotNullExpressionValue(clsAnnotationType, "annotationType(...)");
        d dVarE = e(clsAnnotationType);
        Intrinsics.d(dVarE, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return dVarE;
    }

    public static final Class b(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class clsC = ((InterfaceC3968e) dVar).c();
        Intrinsics.d(clsC, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsC;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class c(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class clsC = ((InterfaceC3968e) dVar).c();
        if (!clsC.isPrimitive()) {
            Intrinsics.d(clsC, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsC;
        }
        String name = clsC.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsC = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsC = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsC = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsC = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsC = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsC = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsC = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsC = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsC = Short.class;
                }
                break;
        }
        Intrinsics.d(clsC, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsC;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class d(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class clsC = ((InterfaceC3968e) dVar).c();
        if (clsC.isPrimitive()) {
            Intrinsics.d(clsC, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return clsC;
        }
        String name = clsC.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final d e(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return F.b(cls);
    }
}

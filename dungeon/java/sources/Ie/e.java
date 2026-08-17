package Ie;

import Xd.l;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public enum e {
    BOOLEAN(l.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(l.CHAR, "char", "C", "java.lang.Character"),
    BYTE(l.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(l.SHORT, "short", "S", "java.lang.Short"),
    INT(l.INT, "int", "I", "java.lang.Integer"),
    FLOAT(l.FLOAT, "float", "F", "java.lang.Float"),
    LONG(l.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(l.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Map f5428m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f5429n = new EnumMap(l.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f5430o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Set f5431p = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Map f5432q = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f5434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p464ze.c f5437d;

    static {
        for (e eVar : values()) {
            f5428m.put(eVar.o(), eVar);
            f5429n.put(eVar.p(), eVar);
            f5430o.put(eVar.i(), eVar);
            String strReplace = eVar.f5437d.a().replace('.', '/');
            f5431p.add(strReplace);
            f5432q.put(strReplace, "(" + eVar.f5436c + ")L" + strReplace + ";");
        }
    }

    e(l lVar, String str, String str2, String str3) {
        if (lVar == null) {
            e(8);
        }
        if (str == null) {
            e(9);
        }
        if (str2 == null) {
            e(10);
        }
        if (str3 == null) {
            e(11);
        }
        this.f5434a = lVar;
        this.f5435b = str;
        this.f5436c = str2;
        this.f5437d = new p464ze.c(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void e(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                case 13:
                case 14:
                case 15:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static e g(l lVar) {
        if (lVar == null) {
            e(5);
        }
        e eVar = (e) f5429n.get(lVar);
        if (eVar == null) {
            e(6);
        }
        return eVar;
    }

    public static e h(String str) {
        if (str == null) {
            e(3);
        }
        e eVar = (e) f5428m.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public String i() {
        String str = this.f5436c;
        if (str == null) {
            e(14);
        }
        return str;
    }

    public String o() {
        String str = this.f5435b;
        if (str == null) {
            e(13);
        }
        return str;
    }

    public l p() {
        l lVar = this.f5434a;
        if (lVar == null) {
            e(12);
        }
        return lVar;
    }

    public p464ze.c r() {
        p464ze.c cVar = this.f5437d;
        if (cVar == null) {
            e(15);
        }
        return cVar;
    }
}

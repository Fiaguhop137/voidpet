package p338se;

import Ad.n;
import Ie.d;
import Ie.e;
import Xd.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f53646a = new u();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53647a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[l.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f53647a = iArr;
        }
    }

    private u() {
    }

    @Override // p338se.t
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public s c(s possiblyPrimitiveType) {
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof s.d)) {
            return possiblyPrimitiveType;
        }
        s.d dVar = (s.d) possiblyPrimitiveType;
        if (dVar.i() == null) {
            return possiblyPrimitiveType;
        }
        String strF = d.c(dVar.i().r()).f();
        Intrinsics.checkNotNullExpressionValue(strF, "getInternalName(...)");
        return e(strF);
    }

    @Override // p338se.t
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public s b(String representation) {
        e eVar;
        Intrinsics.checkNotNullParameter(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i10];
            if (eVar.i().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (eVar != null) {
            return new s.d(eVar);
        }
        if (cCharAt == 'V') {
            return new s.d(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return new s.a(b(strSubstring));
        }
        if (cCharAt == 'L') {
            StringsKt.X(representation, ';', false, 2, null);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return new s.c(strSubstring2);
    }

    @Override // p338se.t
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public s.c e(String internalName) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        return new s.c(internalName);
    }

    @Override // p338se.t
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public s a(l primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        switch (a.f53647a[primitiveType.ordinal()]) {
            case 1:
                return s.f53634a.a();
            case 2:
                return s.f53634a.c();
            case 3:
                return s.f53634a.b();
            case 4:
                return s.f53634a.h();
            case 5:
                return s.f53634a.f();
            case 6:
                return s.f53634a.e();
            case 7:
                return s.f53634a.g();
            case 8:
                return s.f53634a.d();
            default:
                throw new n();
        }
    }

    @Override // p338se.t
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public s f() {
        return e("java/lang/Class");
    }

    @Override // p338se.t
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String d(s type) {
        String strI;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof s.a) {
            return '[' + d(((s.a) type).i());
        }
        if (type instanceof s.d) {
            e eVarI = ((s.d) type).i();
            return (eVarI == null || (strI = eVarI.i()) == null) ? "V" : strI;
        }
        if (!(type instanceof s.c)) {
            throw new n();
        }
        return 'L' + ((s.c) type).i() + ';';
    }
}

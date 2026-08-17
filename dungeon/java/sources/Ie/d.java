package Ie;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p464ze.c f5419b;

    private d(String str) {
        if (str == null) {
            a(7);
        }
        this.f5418a = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 3 && i10 != 5) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 3 && i10 != 5) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
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
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i10 != 5) {
            switch (i10) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 5) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static d b(p464ze.b bVar) {
        if (bVar == null) {
            a(1);
        }
        return new d(h(bVar));
    }

    public static d c(p464ze.c cVar) {
        if (cVar == null) {
            a(4);
        }
        d dVar = new d(cVar.a().replace('.', '/'));
        dVar.f5419b = cVar;
        return dVar;
    }

    public static d d(String str) {
        if (str == null) {
            a(0);
        }
        return new d(str);
    }

    public static String h(p464ze.b bVar) {
        if (bVar == null) {
            a(2);
        }
        p464ze.c cVarF = bVar.f();
        String strReplace = bVar.g().a().replace('.', '$');
        if (!cVarF.c()) {
            strReplace = cVarF.a().replace('.', '/') + "/" + strReplace;
        }
        if (strReplace == null) {
            a(3);
        }
        return strReplace;
    }

    public p464ze.c e() {
        return new p464ze.c(this.f5418a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5418a.equals(((d) obj).f5418a);
    }

    public String f() {
        String str = this.f5418a;
        if (str == null) {
            a(10);
        }
        return str;
    }

    public p464ze.c g() {
        int iLastIndexOf = this.f5418a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new p464ze.c(this.f5418a.substring(0, iLastIndexOf).replace('/', '.'));
        }
        p464ze.c cVar = p464ze.c.f58563d;
        if (cVar == null) {
            a(9);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f5418a.hashCode();
    }

    public String toString() {
        return this.f5418a;
    }
}

package Re;

/* JADX INFO: loaded from: classes3.dex */
public class D0 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N0 f11032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S f11033b;

    public D0(N0 n10, S s10) {
        if (n10 == null) {
            c(0);
        }
        if (s10 == null) {
            c(1);
        }
        this.f11032a = n10;
        this.f11033b = s10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D0(S s10) {
        this(N0.INVARIANT, s10);
        if (s10 == null) {
            c(2);
        }
    }

    private static /* synthetic */ void c(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Re.B0
    public boolean a() {
        return false;
    }

    @Override // Re.B0
    public N0 b() {
        N0 n10 = this.f11032a;
        if (n10 == null) {
            c(4);
        }
        return n10;
    }

    @Override // Re.B0
    public S getType() {
        S s10 = this.f11033b;
        if (s10 == null) {
            c(5);
        }
        return s10;
    }

    @Override // Re.B0
    public B0 o(Se.g gVar) {
        if (gVar == null) {
            c(6);
        }
        return new D0(this.f11032a, gVar.a(this.f11033b));
    }
}

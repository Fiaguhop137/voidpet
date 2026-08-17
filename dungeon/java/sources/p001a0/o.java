package p001a0;

import Ad.n;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes.dex */
public enum o implements n {
    Active,
    ActiveParent,
    Captured,
    Inactive;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f19055f = Gd.a.a(h());

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19056a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19056a = iArr;
        }
    }

    @Override // p001a0.n
    public boolean e() {
        int i10 = a.f19056a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new n();
    }

    @Override // p001a0.n
    public boolean g() {
        int i10 = a.f19056a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new n();
    }
}

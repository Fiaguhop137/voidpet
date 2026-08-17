package p374ue;

import Be.j;

/* JADX INFO: loaded from: classes3.dex */
public enum y implements j.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static j.b f55631h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f55633a;

    static class a implements j.b {
        a() {
        }

        @Override // Be.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(int i10) {
            return y.e(i10);
        }
    }

    y(int i10, int i11) {
        this.f55633a = i11;
    }

    public static y e(int i10) {
        if (i10 == 0) {
            return INTERNAL;
        }
        if (i10 == 1) {
            return PRIVATE;
        }
        if (i10 == 2) {
            return PROTECTED;
        }
        if (i10 == 3) {
            return PUBLIC;
        }
        if (i10 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i10 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // Be.j.a
    public final int getNumber() {
        return this.f55633a;
    }
}

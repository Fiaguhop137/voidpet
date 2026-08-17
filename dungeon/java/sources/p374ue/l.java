package p374ue;

import Be.j;

/* JADX INFO: loaded from: classes3.dex */
public enum l implements j.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static j.b f55340f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f55342a;

    static class a implements j.b {
        a() {
        }

        @Override // Be.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(int i10) {
            return l.e(i10);
        }
    }

    l(int i10, int i11) {
        this.f55342a = i11;
    }

    public static l e(int i10) {
        if (i10 == 0) {
            return FINAL;
        }
        if (i10 == 1) {
            return OPEN;
        }
        if (i10 == 2) {
            return ABSTRACT;
        }
        if (i10 != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // Be.j.a
    public final int getNumber() {
        return this.f55342a;
    }
}

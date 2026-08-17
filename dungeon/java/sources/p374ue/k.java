package p374ue;

import Be.j;

/* JADX INFO: loaded from: classes3.dex */
public enum k implements j.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static j.b f55333f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f55335a;

    static class a implements j.b {
        a() {
        }

        @Override // Be.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(int i10) {
            return k.e(i10);
        }
    }

    k(int i10, int i11) {
        this.f55335a = i11;
    }

    public static k e(int i10) {
        if (i10 == 0) {
            return DECLARATION;
        }
        if (i10 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i10 == 2) {
            return DELEGATION;
        }
        if (i10 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // Be.j.a
    public final int getNumber() {
        return this.f55335a;
    }
}

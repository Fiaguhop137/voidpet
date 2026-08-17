package Oa;

/* JADX INFO: loaded from: classes2.dex */
final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8536a = 3;

    private final boolean b(int i10) {
        return i10 % 10 == 1;
    }

    private final void c() {
        int i10 = this.f8536a + 2;
        this.f8536a = i10;
        if (b(i10)) {
            this.f8536a += 2;
        }
    }

    @Override // Oa.f
    public int a() {
        int i10 = this.f8536a;
        c();
        return i10;
    }
}

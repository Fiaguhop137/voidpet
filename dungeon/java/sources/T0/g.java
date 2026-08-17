package T0;

/* JADX INFO: loaded from: classes.dex */
class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f11876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11877b;

    g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f11876a = new Object[i10];
    }

    @Override // T0.f
    public boolean a(Object obj) {
        int i10 = this.f11877b;
        Object[] objArr = this.f11876a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f11877b = i10 + 1;
        return true;
    }

    @Override // T0.f
    public Object acquire() {
        int i10 = this.f11877b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f11876a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f11877b = i10 - 1;
        return obj;
    }

    @Override // T0.f
    public void b(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f11877b;
            Object[] objArr2 = this.f11876a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f11877b = i12 + 1;
            }
        }
    }
}

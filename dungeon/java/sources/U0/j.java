package U0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends e implements i {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public e[] f12828w0 = new e[4];

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f12829x0 = 0;

    @Override // U0.i
    public void a(f fVar) {
    }

    @Override // U0.i
    public void b() {
        this.f12829x0 = 0;
        Arrays.fill(this.f12828w0, (Object) null);
    }

    @Override // U0.i
    public void c(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.f12829x0 + 1;
        e[] eVarArr = this.f12828w0;
        if (i10 > eVarArr.length) {
            this.f12828w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f12828w0;
        int i11 = this.f12829x0;
        eVarArr2[i11] = eVar;
        this.f12829x0 = i11 + 1;
    }
}

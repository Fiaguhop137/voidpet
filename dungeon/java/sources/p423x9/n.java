package p423x9;

/* JADX INFO: loaded from: classes2.dex */
final class n extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f57428b;

    n(t tVar) {
        this.f57428b = tVar;
    }

    @Override // p423x9.j
    public final void a() {
        t tVar = this.f57428b;
        if (tVar.f57446m != null) {
            tVar.f57435b.d("Unbind from service.", new Object[0]);
            t tVar2 = this.f57428b;
            tVar2.f57434a.unbindService(tVar2.f57445l);
            this.f57428b.f57440g = false;
            this.f57428b.f57446m = null;
            this.f57428b.f57445l = null;
        }
        this.f57428b.t();
    }
}

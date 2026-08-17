package U5;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements P4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p025b6.k f13138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f13139b;

    public /* synthetic */ i(p025b6.k kVar, j jVar) {
        this.f13138a = kVar;
        this.f13139b = jVar;
    }

    @Override // P4.j
    public final void a(OutputStream outputStream) {
        j.v(this.f13138a, this.f13139b, outputStream);
    }
}

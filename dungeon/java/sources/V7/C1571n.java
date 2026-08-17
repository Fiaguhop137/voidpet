package V7;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: V7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1571n implements M.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f14208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7.o f14209b;

    public /* synthetic */ C1571n(M m10, N7.o oVar) {
        this.f14208a = m10;
        this.f14209b = oVar;
    }

    @Override // V7.M.b
    public final Object apply(Object obj) {
        return M.o(this.f14208a, this.f14209b, (SQLiteDatabase) obj);
    }
}

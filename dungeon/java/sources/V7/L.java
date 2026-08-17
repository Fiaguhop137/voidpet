package V7;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class L implements M.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f14158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7.o f14159b;

    public /* synthetic */ L(M m10, N7.o oVar) {
        this.f14158a = m10;
        this.f14159b = oVar;
    }

    @Override // V7.M.b
    public final Object apply(Object obj) {
        return M.f(this.f14158a, this.f14159b, (SQLiteDatabase) obj);
    }
}

package V7;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: V7.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1570m implements M.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f14205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7.i f14206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N7.o f14207c;

    public /* synthetic */ C1570m(M m10, N7.i iVar, N7.o oVar) {
        this.f14205a = m10;
        this.f14206b = iVar;
        this.f14207c = oVar;
    }

    @Override // V7.M.b
    public final Object apply(Object obj) {
        return M.x(this.f14205a, this.f14206b, this.f14207c, (SQLiteDatabase) obj);
    }
}

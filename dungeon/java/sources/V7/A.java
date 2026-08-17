package V7;

import android.database.Cursor;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A implements M.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f14147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f14148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q7.a.C0157a f14149c;

    public /* synthetic */ A(M m10, Map map, Q7.a.C0157a c0157a) {
        this.f14147a = m10;
        this.f14148b = map;
        this.f14149c = c0157a;
    }

    @Override // V7.M.b
    public final Object apply(Object obj) {
        return M.t(this.f14147a, this.f14148b, this.f14149c, (Cursor) obj);
    }
}

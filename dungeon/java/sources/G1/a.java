package G1;

import androidx.fragment.app.C1975f;
import androidx.fragment.app.F;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f3823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F.c f3824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1975f f3825c;

    public /* synthetic */ a(List list, F.c cVar, C1975f c1975f) {
        this.f3823a = list;
        this.f3824b = cVar;
        this.f3825c = c1975f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1975f.F(this.f3823a, this.f3824b, this.f3825c);
    }
}

package p184k4;

import com.applovin.impl.w0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f47967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f47969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f47970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f47971e;

    public /* synthetic */ B0(w0 w0Var, String str, Map map, Map map2, Map map3) {
        this.f47967a = w0Var;
        this.f47968b = str;
        this.f47969c = map;
        this.f47970d = map2;
        this.f47971e = map3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47967a.b(this.f47968b, this.f47969c, this.f47970d, this.f47971e);
    }
}

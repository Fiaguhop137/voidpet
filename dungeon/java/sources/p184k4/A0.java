package p184k4;

import com.applovin.impl.w0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f47962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f47964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f47965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f47966e;

    public /* synthetic */ A0(w0 w0Var, String str, Map map, Map map2, Map map3) {
        this.f47962a = w0Var;
        this.f47963b = str;
        this.f47964c = map;
        this.f47965d = map2;
        this.f47966e = map3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47962a.a(this.f47963b, this.f47964c, this.f47965d, this.f47966e);
    }
}

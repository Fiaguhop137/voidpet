package p184k4;

import com.applovin.impl.b1;
import com.applovin.impl.e1;
import org.json.JSONObject;

/* JADX INFO: renamed from: k4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3893b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f47993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f47995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JSONObject f47996d;

    public /* synthetic */ RunnableC3893b(e1 e1Var, String str, b1 b1Var, JSONObject jSONObject) {
        this.f47993a = e1Var;
        this.f47994b = str;
        this.f47995c = b1Var;
        this.f47996d = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47993a.a(this.f47994b, this.f47995c, this.f47996d);
    }
}

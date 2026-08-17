package p337sd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p158id.d;
import p247nd.r;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f53531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f53532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f53533c;

    public j(a launcherSelectionPolicy, d loaderSelectionPolicy, g reaperSelectionPolicy) {
        Intrinsics.checkNotNullParameter(launcherSelectionPolicy, "launcherSelectionPolicy");
        Intrinsics.checkNotNullParameter(loaderSelectionPolicy, "loaderSelectionPolicy");
        Intrinsics.checkNotNullParameter(reaperSelectionPolicy, "reaperSelectionPolicy");
        this.f53531a = launcherSelectionPolicy;
        this.f53532b = loaderSelectionPolicy;
        this.f53533c = reaperSelectionPolicy;
    }

    public final d a(List updates, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        return this.f53531a.a(updates, jSONObject);
    }

    public final List b(List updates, d launchedUpdate, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(launchedUpdate, "launchedUpdate");
        return this.f53533c.a(updates, launchedUpdate, jSONObject);
    }

    public final boolean c(d dVar, d dVar2, JSONObject jSONObject) {
        return this.f53532b.b(dVar, dVar2, jSONObject);
    }

    public final boolean d(r.c directive, d embeddedUpdate, d dVar, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(directive, "directive");
        Intrinsics.checkNotNullParameter(embeddedUpdate, "embeddedUpdate");
        return this.f53532b.a(directive, embeddedUpdate, dVar, jSONObject);
    }
}

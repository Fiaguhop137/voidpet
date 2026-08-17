package p027b8;

import android.os.Bundle;
import p135h8.a;
import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements a.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f26445d = new g(new f());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26446a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26448c;

    public g(f fVar) {
        this.f26447b = fVar.f26443a.booleanValue();
        this.f26448c = fVar.f26444b;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f26447b);
        bundle.putString("log_session_id", this.f26448c);
        return bundle;
    }

    final /* synthetic */ boolean b() {
        return this.f26447b;
    }

    final /* synthetic */ String c() {
        return this.f26448c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.f26446a;
        return AbstractC3851p.a(null, null) && this.f26447b == gVar.f26447b && AbstractC3851p.a(this.f26448c, gVar.f26448c);
    }

    public final int hashCode() {
        return AbstractC3851p.b(null, Boolean.valueOf(this.f26447b), this.f26448c);
    }
}

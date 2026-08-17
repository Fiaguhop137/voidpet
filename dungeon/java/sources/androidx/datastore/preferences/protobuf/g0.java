package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23469a;

    public g0(K k10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f23469a = null;
    }

    public C1965v a() {
        return new C1965v(getMessage());
    }
}

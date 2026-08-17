package io.sentry.featureflags;

import io.sentry.InterfaceC3698e0;
import io.sentry.protocol.C3762f;
import io.sentry.protocol.C3763g;
import io.sentry.util.C3799a;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f45839a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3799a f45840b = new C3799a();

    private d() {
    }

    public static b a() {
        return new d();
    }

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m267clone() {
        return a();
    }

    @Override // io.sentry.featureflags.b
    public C3763g l() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45840b.a();
        try {
            Map map = this.f45839a;
            if (map != null && !map.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f45839a.size());
                for (Map.Entry entry : this.f45839a.entrySet()) {
                    arrayList.add(new C3762f((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                C3763g c3763g = new C3763g(arrayList);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return c3763g;
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return null;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}

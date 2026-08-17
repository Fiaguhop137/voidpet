package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3151q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f37994b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile C3151q f37995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C3151q f37996d = new C3151q(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f37997a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: com.google.protobuf.q$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f37998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f37999b;

        a(Object obj, int i10) {
            this.f37998a = obj;
            this.f37999b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f37998a == aVar.f37998a && this.f37999b == aVar.f37999b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f37998a) * 65535) + this.f37999b;
        }
    }

    C3151q(boolean z10) {
    }

    public static C3151q b() {
        C3151q c3151qA;
        if (!f37994b) {
            return f37996d;
        }
        C3151q c3151q = f37995c;
        if (c3151q != null) {
            return c3151q;
        }
        synchronized (C3151q.class) {
            try {
                c3151qA = f37995c;
                if (c3151qA == null) {
                    c3151qA = AbstractC3150p.a();
                    f37995c = c3151qA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3151qA;
    }

    public GeneratedMessageLite.e a(T t10, int i10) {
        return (GeneratedMessageLite.e) this.f37997a.get(new a(t10, i10));
    }
}

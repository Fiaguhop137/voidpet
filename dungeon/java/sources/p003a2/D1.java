package p003a2;

import U1.AbstractC1459a;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class D1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D1 f19124d = new D1("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f19126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f19127c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LogSessionId f19128a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            AbstractC1459a.g(this.f19128a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f19128a = logSessionId;
        }
    }

    public D1(String str) {
        this.f19125a = str;
        this.f19126b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
        this.f19127c = new Object();
    }

    public synchronized LogSessionId a() {
        return ((a) AbstractC1459a.e(this.f19126b)).f19128a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) AbstractC1459a.e(this.f19126b)).a(logSessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D1)) {
            return false;
        }
        D1 d10 = (D1) obj;
        return Objects.equals(this.f19125a, d10.f19125a) && Objects.equals(this.f19126b, d10.f19126b) && Objects.equals(this.f19127c, d10.f19127c);
    }

    public int hashCode() {
        return Objects.hash(this.f19125a, this.f19126b, this.f19127c);
    }
}

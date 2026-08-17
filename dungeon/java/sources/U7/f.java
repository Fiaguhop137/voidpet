package U7;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private X7.a f13332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f13333b = new HashMap();

        public a a(L7.e eVar, b bVar) {
            this.f13333b.put(eVar, bVar);
            return this;
        }

        public f b() {
            if (this.f13332a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f13333b.keySet().size() < L7.e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f13333b;
            this.f13333b = new HashMap();
            return f.d(this.f13332a, map);
        }

        public a c(X7.a aVar) {
            this.f13332a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new U7.c.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i11))));
    }

    public static a b() {
        return new a();
    }

    static f d(X7.a aVar, Map map) {
        return new U7.b(aVar, map);
    }

    public static f f(X7.a aVar) {
        return b().a(L7.e.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(L7.e.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(L7.e.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, L7.e eVar, long j10, int i10) {
        builder.setMinimumLatency(g(eVar, j10, i10));
        j(builder, ((b) h().get(eVar)).c());
        return builder;
    }

    abstract X7.a e();

    public long g(L7.e eVar, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = (b) h().get(eVar);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    abstract Map h();
}

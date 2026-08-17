package A3;

import If.AbstractC1113o;
import If.Q;
import Q3.AbstractC1339e;
import Q3.k;
import Q3.l;
import p088ef.K;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: A3.a$a, reason: collision with other inner class name */
    public static final class C0002a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Q f152a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f157f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AbstractC1113o f153b = l.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f154c = 0.02d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f155d = 10485760;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f156e = 262144000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private K f158g = AbstractC1339e.a();

        public final a a() {
            long jO;
            Q q10 = this.f152a;
            if (q10 == null) {
                throw new IllegalStateException("directory == null");
            }
            double d10 = this.f154c;
            if (d10 > 0.0d) {
                try {
                    jO = kotlin.ranges.e.o((long) (d10 * k.a(this.f153b, q10)), this.f155d, this.f156e);
                } catch (Exception unused) {
                    jO = this.f155d;
                }
            } else {
                jO = this.f157f;
            }
            return new e(jO, q10, this.f153b, this.f158g);
        }

        public final C0002a b(Q q10) {
            this.f152a = q10;
            return this;
        }
    }

    public interface b {
        Q getMetadata();

        Q n();

        void o();

        c p();
    }

    public interface c extends AutoCloseable {
        b Q2();

        Q getMetadata();

        Q n();
    }

    b a(String str);

    c b(String str);

    AbstractC1113o getFileSystem();
}

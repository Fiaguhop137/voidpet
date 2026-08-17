package Z1;

import U1.AbstractC1459a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18168c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f18169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f18170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f18171c;

        public b() {
            this.f18169a = -9223372036854775807L;
            this.f18170b = -3.4028235E38f;
            this.f18171c = -9223372036854775807L;
        }

        private b(U0 u10) {
            this.f18169a = u10.f18166a;
            this.f18170b = u10.f18167b;
            this.f18171c = u10.f18168c;
        }

        /* synthetic */ b(U0 u10, a aVar) {
            this(u10);
        }

        public U0 d() {
            return new U0(this, null);
        }

        public b e(long j10) {
            AbstractC1459a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f18171c = j10;
            return this;
        }

        public b f(long j10) {
            this.f18169a = j10;
            return this;
        }

        public b g(float f10) {
            AbstractC1459a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f18170b = f10;
            return this;
        }
    }

    private U0(b bVar) {
        this.f18166a = bVar.f18169a;
        this.f18167b = bVar.f18170b;
        this.f18168c = bVar.f18171c;
    }

    /* synthetic */ U0(b bVar, a aVar) {
        this(bVar);
    }

    public b a() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u10 = (U0) obj;
        return this.f18166a == u10.f18166a && this.f18167b == u10.f18167b && this.f18168c == u10.f18168c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f18166a), Float.valueOf(this.f18167b), Long.valueOf(this.f18168c));
    }
}

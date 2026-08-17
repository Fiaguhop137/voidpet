package p308r2;

import U1.AbstractC1459a;
import java.io.IOException;
import p236n2.B;
import p236n2.C4027y;

/* JADX INFO: loaded from: classes.dex */
public interface k {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f52076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f52077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f52078d;

        public a(int i10, int i11, int i12, int i13) {
            this.f52075a = i10;
            this.f52076b = i11;
            this.f52077c = i12;
            this.f52078d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                return this.f52075a - this.f52076b > 1;
            }
            return this.f52077c - this.f52078d > 1;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f52080b;

        public b(int i10, long j10) {
            AbstractC1459a.a(j10 >= 0);
            this.f52079a = i10;
            this.f52080b = j10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C4027y f52081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f52082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f52083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f52084d;

        public c(C4027y c4027y, B b10, IOException iOException, int i10) {
            this.f52081a = c4027y;
            this.f52082b = b10;
            this.f52083c = iOException;
            this.f52084d = i10;
        }
    }

    long a(c cVar);

    int b(int i10);

    b c(a aVar, c cVar);

    default void d(long j10) {
    }
}

package V1;

import U1.F;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13910a;

    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f13911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f13912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f13913d;

        public b(int i10, long j10) {
            super(i10, null);
            this.f13911b = j10;
            this.f13912c = new ArrayList();
            this.f13913d = new ArrayList();
        }

        public void b(b bVar) {
            this.f13913d.add(bVar);
        }

        public void c(c cVar) {
            this.f13912c.add(cVar);
        }

        public b d(int i10) {
            int size = this.f13913d.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f13913d.get(i11);
                if (bVar.f13910a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public c e(int i10) {
            int size = this.f13912c.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = (c) this.f13912c.get(i11);
                if (cVar.f13910a == i10) {
                    return cVar;
                }
            }
            return null;
        }

        @Override // V1.e
        public String toString() {
            return e.a(this.f13910a) + " leaves: " + Arrays.toString(this.f13912c.toArray()) + " containers: " + Arrays.toString(this.f13913d.toArray());
        }
    }

    public static final class c extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final F f13914b;

        public c(int i10, F f10) {
            super(i10, null);
            this.f13914b = f10;
        }
    }

    private e(int i10) {
        this.f13910a = i10;
    }

    /* synthetic */ e(int i10, a aVar) {
        this(i10);
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f13910a);
    }
}

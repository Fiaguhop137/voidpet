package C9;

import java.util.Comparator;

/* JADX INFO: renamed from: C9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0870m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC0870m f1603a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC0870m f1604b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC0870m f1605c = new b(1);

    /* JADX INFO: renamed from: C9.m$a */
    class a extends AbstractC0870m {
        a() {
            super(null);
        }

        @Override // C9.AbstractC0870m
        public AbstractC0870m d(int i10, int i11) {
            return k(Integer.compare(i10, i11));
        }

        @Override // C9.AbstractC0870m
        public AbstractC0870m e(long j10, long j11) {
            return k(Long.compare(j10, j11));
        }

        @Override // C9.AbstractC0870m
        public AbstractC0870m f(Object obj, Object obj2, Comparator comparator) {
            return k(comparator.compare(obj, obj2));
        }

        @Override // C9.AbstractC0870m
        public AbstractC0870m g(boolean z10, boolean z11) {
            return k(Boolean.compare(z10, z11));
        }

        @Override // C9.AbstractC0870m
        public AbstractC0870m h(boolean z10, boolean z11) {
            return k(Boolean.compare(z11, z10));
        }

        @Override // C9.AbstractC0870m
        public int i() {
            return 0;
        }

        AbstractC0870m k(int i10) {
            if (i10 < 0) {
                return AbstractC0870m.f1604b;
            }
            return i10 > 0 ? AbstractC0870m.f1605c : AbstractC0870m.f1603a;
        }
    }

    /* JADX INFO: renamed from: C9.m$b */
    private static final class b extends AbstractC0870m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f1606d;

        b(int i10) {
            super(null);
            this.f1606d = i10;
        }

        @Override // C9.AbstractC0870m
        public AbstractC0870m d(int i10, int i11) {
            return this;
        }

        @Override // C9.AbstractC0870m
        public AbstractC0870m e(long j10, long j11) {
            return this;
        }

        @Override // C9.AbstractC0870m
        public AbstractC0870m f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // C9.AbstractC0870m
        public AbstractC0870m g(boolean z10, boolean z11) {
            return this;
        }

        @Override // C9.AbstractC0870m
        public AbstractC0870m h(boolean z10, boolean z11) {
            return this;
        }

        @Override // C9.AbstractC0870m
        public int i() {
            return this.f1606d;
        }
    }

    private AbstractC0870m() {
    }

    /* synthetic */ AbstractC0870m(a aVar) {
        this();
    }

    public static AbstractC0870m j() {
        return f1603a;
    }

    public abstract AbstractC0870m d(int i10, int i11);

    public abstract AbstractC0870m e(long j10, long j11);

    public abstract AbstractC0870m f(Object obj, Object obj2, Comparator comparator);

    public abstract AbstractC0870m g(boolean z10, boolean z11);

    public abstract AbstractC0870m h(boolean z10, boolean z11);

    public abstract int i();
}

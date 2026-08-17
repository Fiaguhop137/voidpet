package L;

import java.util.List;
import kotlin.collections.AbstractC3942d;

/* JADX INFO: loaded from: classes.dex */
public interface c extends List, b, Nd.a {

    private static final class a extends AbstractC3942d implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f6257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f6259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6260e;

        public a(c cVar, int i10, int i11) {
            this.f6257b = cVar;
            this.f6258c = i10;
            this.f6259d = i11;
            P.d.c(i10, i11, cVar.size());
            this.f6260e = i11 - i10;
        }

        @Override // kotlin.collections.AbstractC3940b
        public int c() {
            return this.f6260e;
        }

        @Override // kotlin.collections.AbstractC3942d, java.util.List
        public Object get(int i10) {
            P.d.a(i10, this.f6260e);
            return this.f6257b.get(this.f6258c + i10);
        }

        @Override // kotlin.collections.AbstractC3942d, java.util.List, L.c
        public c subList(int i10, int i11) {
            P.d.c(i10, i11, this.f6260e);
            c cVar = this.f6257b;
            int i12 = this.f6258c;
            return new a(cVar, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    default c subList(int i10, int i11) {
        return new a(this, i10, i11);
    }
}

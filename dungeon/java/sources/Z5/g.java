package Z5;

import V4.k;
import java.util.Collections;
import java.util.List;
import p025b6.o;
import p025b6.p;

/* JADX INFO: loaded from: classes2.dex */
public class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f18799a;

    private static class a implements b {
        private a() {
        }

        /* synthetic */ a(h hVar) {
            this();
        }

        @Override // Z5.g.b
        public List a() {
            return Collections.EMPTY_LIST;
        }

        @Override // Z5.g.b
        public int b() {
            return 0;
        }
    }

    public interface b {
        List a();

        int b();
    }

    public g() {
        this(new a(null));
    }

    public g(b bVar) {
        this.f18799a = (b) k.g(bVar);
    }

    @Override // Z5.e
    public int a(int i10) {
        List listA = this.f18799a.a();
        if (listA == null || listA.isEmpty()) {
            return i10 + 1;
        }
        for (int i11 = 0; i11 < listA.size(); i11++) {
            if (((Integer) listA.get(i11)).intValue() > i10) {
                return ((Integer) listA.get(i11)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // Z5.e
    public p b(int i10) {
        return o.d(i10, i10 >= this.f18799a.b(), false);
    }

    @Override // Z5.e
    public boolean c() {
        return true;
    }
}

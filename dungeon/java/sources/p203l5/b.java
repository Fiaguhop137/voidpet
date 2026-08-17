package p203l5;

import I5.g;
import V4.f;
import V4.n;
import V4.o;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f48639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f48640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f48641c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f48642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n f48643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f48644c;

        static /* bridge */ /* synthetic */ g c(a aVar) {
            aVar.getClass();
            return null;
        }

        public b e() {
            return new b(this, null);
        }
    }

    private b(a aVar) {
        this.f48639a = aVar.f48642a != null ? f.c(aVar.f48642a) : null;
        this.f48641c = aVar.f48643b != null ? aVar.f48643b : o.a(Boolean.FALSE);
        this.f48640b = aVar.f48644c;
        a.c(aVar);
    }

    /* synthetic */ b(a aVar, c cVar) {
        this(aVar);
    }

    public static a e() {
        return new a();
    }

    public f a() {
        return this.f48639a;
    }

    public n b() {
        return this.f48641c;
    }

    public g c() {
        return null;
    }

    public h d() {
        return this.f48640b;
    }
}

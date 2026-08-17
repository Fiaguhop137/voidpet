package p435y3;

import A3.g;
import Ad.j;
import F3.d;
import K3.f;
import Q3.AbstractC1338d;
import android.content.Context;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
public interface r {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f57819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f.b f57820b = f.b.f5972p;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Lazy f57821c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Lazy f57822d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private j.c f57823e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private h f57824f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final l.a f57825g = new l.a();

        public a(Context context) {
            this.f57819a = AbstractC1338d.b(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d d(a aVar) {
            return d.a.d(new d.a(), aVar.f57819a, 0.0d, 2, null).b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A3.a e() {
            return g.d();
        }

        public final r c() {
            Context context = this.f57819a;
            f.b bVar = this.f57820b;
            f.b bVarA = bVar.a((8191 & 1) != 0 ? bVar.f5973a : null, (8191 & 2) != 0 ? bVar.f5974b : null, (8191 & 4) != 0 ? bVar.f5975c : null, (8191 & 8) != 0 ? bVar.f5976d : null, (8191 & 16) != 0 ? bVar.f5977e : null, (8191 & 32) != 0 ? bVar.f5978f : null, (8191 & 64) != 0 ? bVar.f5979g : null, (8191 & 128) != 0 ? bVar.f5980h : null, (8191 & 256) != 0 ? bVar.f5981i : null, (8191 & 512) != 0 ? bVar.f5982j : null, (8191 & 1024) != 0 ? bVar.f5983k : null, (8191 & 2048) != 0 ? bVar.f5984l : null, (8191 & 4096) != 0 ? bVar.f5985m : null, (8191 & 8192) != 0 ? bVar.f5986n : this.f57825g.a());
            Lazy lazyB = this.f57821c;
            if (lazyB == null) {
                lazyB = j.b(new p(this));
            }
            Lazy lazyB2 = this.f57822d;
            if (lazyB2 == null) {
                lazyB2 = j.b(new q());
            }
            j.c cVar = this.f57823e;
            if (cVar == null) {
                cVar = j.c.f57809b;
            }
            h hVar = this.f57824f;
            if (hVar == null) {
                hVar = new h();
            }
            return new v(new v.a(context, bVarA, lazyB, lazyB2, cVar, hVar, null));
        }

        public final a f(h hVar) {
            this.f57824f = hVar;
            return this;
        }
    }

    A3.a a();

    f.b b();

    K3.d c(f fVar);

    d d();

    h getComponents();
}

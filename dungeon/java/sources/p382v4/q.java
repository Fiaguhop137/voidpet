package p382v4;

import L4.k;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p199l1.e;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
class q implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f56237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f56238b;

    static class a implements d, d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f56239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f56240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f56241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h f56242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.a f56243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f56244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f56245g;

        a(List list, e eVar) {
            this.f56240b = eVar;
            k.c(list);
            this.f56239a = list;
            this.f56241c = 0;
        }

        private void g() {
            if (this.f56245g) {
                return;
            }
            if (this.f56241c < this.f56239a.size() - 1) {
                this.f56241c++;
                e(this.f56242d, this.f56243e);
            } else {
                k.d(this.f56244f);
                this.f56243e.c(new p310r4.q("Fetch failed", new ArrayList(this.f56244f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ((d) this.f56239a.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List list = this.f56244f;
            if (list != null) {
                this.f56240b.a(list);
            }
            this.f56244f = null;
            Iterator it = this.f56239a.iterator();
            while (it.hasNext()) {
                ((d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) k.d(this.f56244f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f56245g = true;
            Iterator it = this.f56239a.iterator();
            while (it.hasNext()) {
                ((d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public p274p4.a d() {
            return ((d) this.f56239a.get(0)).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(h hVar, d.a aVar) {
            this.f56242d = hVar;
            this.f56243e = aVar;
            this.f56244f = (List) this.f56240b.acquire();
            ((d) this.f56239a.get(this.f56241c)).e(hVar, this);
            if (this.f56245g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (obj != null) {
                this.f56243e.f(obj);
            } else {
                g();
            }
        }
    }

    q(List list, e eVar) {
        this.f56237a = list;
        this.f56238b = eVar;
    }

    @Override // p382v4.n
    public n.a a(Object obj, int i10, int i11, p274p4.h hVar) {
        n.a aVarA;
        int size = this.f56237a.size();
        ArrayList arrayList = new ArrayList(size);
        f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) this.f56237a.get(i12);
            if (nVar.b(obj) && (aVarA = nVar.a(obj, i10, i11, hVar)) != null) {
                fVar = aVarA.f56230a;
                arrayList.add(aVarA.f56232c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a(fVar, new a(arrayList, this.f56238b));
    }

    @Override // p382v4.n
    public boolean b(Object obj) {
        Iterator it = this.f56237a.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f56237a.toArray()) + '}';
    }
}

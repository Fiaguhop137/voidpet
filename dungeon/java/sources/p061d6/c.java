package p061d6;

import W4.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p133h6.b;

/* JADX INFO: loaded from: classes2.dex */
public class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f39819a;

    public c(Set set) {
        this.f39819a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null) {
                this.f39819a.add(eVar);
            }
        }
    }

    public c(e... eVarArr) {
        this.f39819a = new ArrayList(eVarArr.length);
        for (e eVar : eVarArr) {
            if (eVar != null) {
                this.f39819a.add(eVar);
            }
        }
    }

    private void l(String str, Throwable th) {
        a.n("ForwardingRequestListener", str, th);
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void a(String str, String str2) {
        int size = this.f39819a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f39819a.get(i10)).a(str, str2);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // p061d6.e
    public void b(b bVar, String str, Throwable th, boolean z10) {
        int size = this.f39819a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f39819a.get(i10)).b(bVar, str, th, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // p061d6.e
    public void c(b bVar, Object obj, String str, boolean z10) {
        int size = this.f39819a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f39819a.get(i10)).c(bVar, obj, str, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public boolean d(String str) {
        int size = this.f39819a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((e) this.f39819a.get(i10)).d(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void e(String str, String str2, Map map) {
        int size = this.f39819a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f39819a.get(i10)).e(str, str2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void f(String str, String str2, Throwable th, Map map) {
        int size = this.f39819a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f39819a.get(i10)).f(str, str2, th, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }

    @Override // p061d6.e
    public void g(b bVar, String str, boolean z10) {
        int size = this.f39819a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f39819a.get(i10)).g(bVar, str, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void h(String str, String str2, Map map) {
        int size = this.f39819a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f39819a.get(i10)).h(str, str2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void i(String str, String str2, boolean z10) {
        int size = this.f39819a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f39819a.get(i10)).i(str, str2, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void j(String str, String str2, String str3) {
        int size = this.f39819a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f39819a.get(i10)).j(str, str2, str3);
            } catch (Exception e10) {
                l("InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // p061d6.e
    public void k(String str) {
        int size = this.f39819a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f39819a.get(i10)).k(str);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestCancellation", e10);
            }
        }
    }
}

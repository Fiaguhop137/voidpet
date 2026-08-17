package p061d6;

import com.facebook.imagepipeline.producers.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39817b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f39818a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(Set set) {
        if (set == null) {
            this.f39818a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.f39818a = arrayList;
        CollectionsKt.h0(set, arrayList);
    }

    @Override // p061d6.d
    public void a(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f39818a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).a(producerContext);
            } catch (Exception e10) {
                W4.a.n("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void b(e0 producerContext, String producerName, boolean z10) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator it = this.f39818a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).b(producerContext, producerName, z10);
            } catch (Exception e10) {
                W4.a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void c(e0 e0Var, String str, Map map) {
        Iterator it = this.f39818a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).c(e0Var, str, map);
            } catch (Exception e10) {
                W4.a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void d(e0 producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator it = this.f39818a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).d(producerContext, producerName);
            } catch (Exception e10) {
                W4.a.n("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // p061d6.d
    public void e(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f39818a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).e(producerContext);
            } catch (Exception e10) {
                W4.a.n("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public boolean f(e0 producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        List list = this.f39818a;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }

    @Override // p061d6.d
    public void g(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f39818a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).g(producerContext);
            } catch (Exception e10) {
                W4.a.n("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void h(e0 producerContext, String producerName, String producerEventName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(producerEventName, "producerEventName");
        Iterator it = this.f39818a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).h(producerContext, producerName, producerEventName);
            } catch (Exception e10) {
                W4.a.n("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // p061d6.d
    public void i(e0 producerContext, Throwable throwable) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator it = this.f39818a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).i(producerContext, throwable);
            } catch (Exception e10) {
                W4.a.n("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void j(e0 e0Var, String str, Map map) {
        Iterator it = this.f39818a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).j(e0Var, str, map);
            } catch (Exception e10) {
                W4.a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void k(e0 e0Var, String str, Throwable th, Map map) {
        Iterator it = this.f39818a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).k(e0Var, str, th, map);
            } catch (Exception e10) {
                W4.a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }
}

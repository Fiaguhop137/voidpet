package X5;

import V4.k;
import com.facebook.imagepipeline.producers.AbstractC2171c;
import com.facebook.imagepipeline.producers.InterfaceC2182n;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends p096f5.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l0 f15298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p061d6.d f15299i;

    /* JADX INFO: renamed from: X5.a$a, reason: collision with other inner class name */
    public static final class C0207a extends AbstractC2171c {
        C0207a() {
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC2171c
        protected void f() {
            a.this.D();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC2171c
        protected void g(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            a.this.E(throwable);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC2171c
        protected void h(Object obj, int i10) {
            a aVar = a.this;
            aVar.F(obj, i10, aVar.C());
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC2171c
        protected void i(float f10) {
            a.this.s(f10);
        }
    }

    protected a(d0 producer, l0 settableProducerContext, p061d6.d requestListener) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f15298h = settableProducerContext;
        this.f15299i = requestListener;
        if (!p151i6.b.d()) {
            o(settableProducerContext.getExtras());
            if (p151i6.b.d()) {
                p151i6.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.a(settableProducerContext);
                    Unit unit = Unit.f48228a;
                    p151i6.b.b();
                } catch (Throwable th) {
                    p151i6.b.b();
                    throw th;
                }
            } else {
                requestListener.a(settableProducerContext);
            }
            if (!p151i6.b.d()) {
                producer.b(A(), settableProducerContext);
                return;
            }
            p151i6.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                producer.b(A(), settableProducerContext);
                Unit unit2 = Unit.f48228a;
                return;
            } finally {
                p151i6.b.b();
            }
        }
        p151i6.b.a("AbstractProducerToDataSourceAdapter()");
        try {
            o(settableProducerContext.getExtras());
            if (p151i6.b.d()) {
                p151i6.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.a(settableProducerContext);
                    Unit unit3 = Unit.f48228a;
                    p151i6.b.b();
                } catch (Throwable th2) {
                    p151i6.b.b();
                    throw th2;
                }
            } else {
                requestListener.a(settableProducerContext);
            }
            if (p151i6.b.d()) {
                p151i6.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    producer.b(A(), settableProducerContext);
                    Unit unit4 = Unit.f48228a;
                    p151i6.b.b();
                } finally {
                    p151i6.b.b();
                }
            } else {
                producer.b(A(), settableProducerContext);
            }
            Unit unit5 = Unit.f48228a;
        } catch (Throwable th3) {
            p151i6.b.b();
            throw th3;
        }
    }

    private final InterfaceC2182n A() {
        return new C0207a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void D() {
        k.i(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(Throwable th) {
        if (super.q(th, B(this.f15298h))) {
            this.f15299i.i(this.f15298h, th);
        }
    }

    protected final Map B(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        return producerContext.getExtras();
    }

    public final l0 C() {
        return this.f15298h;
    }

    protected void F(Object obj, int i10, e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        boolean zD = AbstractC2171c.d(i10);
        if (super.u(obj, zD, B(producerContext)) && zD) {
            this.f15299i.e(this.f15298h);
        }
    }

    @Override // p096f5.a, p096f5.c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.a()) {
            return true;
        }
        this.f15299i.g(this.f15298h);
        this.f15298h.s();
        return true;
    }
}

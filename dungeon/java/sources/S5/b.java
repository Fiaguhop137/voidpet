package S5;

import Ad.v;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.AbstractC2172d;
import com.facebook.imagepipeline.producers.AbstractC2174f;
import com.facebook.imagepipeline.producers.C;
import com.facebook.imagepipeline.producers.InterfaceC2182n;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.e0;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p339sf.A;
import p339sf.C4185d;
import p339sf.E;
import p339sf.F;
import p339sf.InterfaceC4186e;
import p339sf.InterfaceC4187f;

/* JADX INFO: loaded from: classes2.dex */
public class b extends AbstractC2172d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f11551d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4186e.a f11552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f11553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4185d f11554c;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: S5.b$b, reason: collision with other inner class name */
    public static final class C0170b extends C {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f11555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f11556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f11557h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0170b(InterfaceC2182n consumer, e0 producerContext) {
            super(consumer, producerContext);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        }
    }

    public static final class c extends AbstractC2174f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4186e f11558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f11559b;

        c(InterfaceC4186e interfaceC4186e, b bVar) {
            this.f11558a = interfaceC4186e;
            this.f11559b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(InterfaceC4186e interfaceC4186e) {
            interfaceC4186e.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            if (Intrinsics.b(Looper.myLooper(), Looper.getMainLooper())) {
                this.f11559b.f11553b.execute(new S5.c(this.f11558a));
            } else {
                this.f11558a.cancel();
            }
        }
    }

    public static final class d implements InterfaceC4187f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0170b f11560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f11561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ X.a f11562c;

        d(C0170b c0170b, b bVar, X.a aVar) {
            this.f11560a = c0170b;
            this.f11561b = bVar;
            this.f11562c = aVar;
        }

        @Override // p339sf.InterfaceC4187f
        public void f(InterfaceC4186e call, IOException e10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            this.f11561b.m(call, e10, this.f11562c);
        }

        @Override // p339sf.InterfaceC4187f
        public void g(InterfaceC4186e call, E response) throws IOException {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f11560a.f11556g = SystemClock.elapsedRealtime();
            F fE = response.e();
            if (fE == null) {
                b bVar = this.f11561b;
                bVar.m(call, bVar.n("Response body null: " + response, response), this.f11562c);
                return;
            }
            b bVar2 = this.f11561b;
            X.a aVar = this.f11562c;
            C0170b c0170b = this.f11560a;
            try {
                try {
                    if (response.isSuccessful()) {
                        V5.b bVarC = V5.b.f14066c.c(response.o("Content-Range"));
                        if (bVarC != null && (bVarC.f14068a != 0 || bVarC.f14069b != Integer.MAX_VALUE)) {
                            c0170b.j(bVarC);
                            c0170b.i(8);
                        }
                        aVar.b(fE.a(), fE.d() < 0 ? 0 : (int) fE.d());
                    } else {
                        bVar2.m(call, bVar2.n("Unexpected HTTP code " + response, response), aVar);
                    }
                } catch (Exception e10) {
                    bVar2.m(call, e10, aVar);
                }
                Unit unit = Unit.f48228a;
                kotlin.io.c.a(fE, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.io.c.a(fE, th);
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(A okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        ExecutorService executorServiceD = okHttpClient.u().d();
        Intrinsics.checkNotNullExpressionValue(executorServiceD, "executorService(...)");
        this(okHttpClient, executorServiceD, false, 4, null);
    }

    public b(InterfaceC4186e.a callFactory, Executor cancellationExecutor, boolean z10) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(cancellationExecutor, "cancellationExecutor");
        this.f11552a = callFactory;
        this.f11553b = cancellationExecutor;
        this.f11554c = z10 ? new C4185d.a().e().a() : null;
    }

    public /* synthetic */ b(InterfaceC4186e.a aVar, Executor executor, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, executor, (i10 & 4) != 0 ? true : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(InterfaceC4186e interfaceC4186e, Exception exc, X.a aVar) {
        if (interfaceC4186e.J1()) {
            aVar.a();
        } else {
            aVar.onFailure(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IOException n(String str, E e10) {
        return new IOException(str, S5.d.f11564c.a(e10));
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0170b e(InterfaceC2182n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        return new C0170b(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a(C0170b fetchState, X.a callback) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.f11555f = SystemClock.elapsedRealtime();
        Uri uriG = fetchState.g();
        Intrinsics.checkNotNullExpressionValue(uriG, "getUri(...)");
        try {
            sf.C.a aVarD = new sf.C.a().l(uriG.toString()).d();
            C4185d c4185d = this.f11554c;
            if (c4185d != null) {
                aVarD.c(c4185d);
            }
            V5.b bVarB = fetchState.b().k().b();
            if (bVarB != null) {
                aVarD.a("Range", bVarB.f());
            }
            p339sf.C cB = aVarD.b();
            Intrinsics.checkNotNullExpressionValue(cB, "build(...)");
            k(fetchState, callback, cB);
        } catch (Exception e10) {
            callback.onFailure(e10);
        }
    }

    protected void k(C0170b fetchState, X.a callback, p339sf.C request) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC4186e interfaceC4186eB = this.f11552a.b(request);
        fetchState.b().b(new c(interfaceC4186eB, this));
        interfaceC4186eB.c0(new d(fetchState, this, callback));
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Map d(C0170b fetchState, int i10) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        return N.l(v.a("queue_time", String.valueOf(fetchState.f11556g - fetchState.f11555f)), v.a("fetch_time", String.valueOf(fetchState.f11557h - fetchState.f11556g)), v.a("total_time", String.valueOf(fetchState.f11557h - fetchState.f11555f)), v.a("image_size", String.valueOf(i10)));
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void b(C0170b fetchState, int i10) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        fetchState.f11557h = SystemClock.elapsedRealtime();
    }
}

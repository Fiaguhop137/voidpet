package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.A3;
import io.sentry.AbstractC3732l;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.InterfaceC3619a0;
import io.sentry.Y;
import io.sentry.android.replay.s;
import io.sentry.android.replay.util.n;
import io.sentry.protocol.x;
import io.sentry.transport.o;
import io.sentry.util.AbstractC3807i;
import io.sentry.util.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends io.sentry.android.replay.capture.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f45388A = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f45389B = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C3833z3 f45390v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final InterfaceC3619a0 f45391w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final o f45392x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final z f45393y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f45394z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f45396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1 function1) {
            super(1);
            this.f45396b = function1;
        }

        public final void a(h.c segment) throws InterruptedException {
            Intrinsics.checkNotNullParameter(segment, "segment");
            f fVar = f.this;
            fVar.L(fVar.f45394z);
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, f.this.f45391w, null, 2, null);
                Function1 function1 = this.f45396b;
                Date dateG0 = aVar.c().g0();
                Intrinsics.checkNotNullExpressionValue(dateG0, "getTimestamp(...)");
                function1.invoke(dateG0);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws InterruptedException {
            a((h.c) obj);
            return Unit.f48228a;
        }
    }

    static final class c extends kotlin.jvm.internal.o implements Function1 {
        c() {
            super(1);
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                f.this.f45394z.add(segment);
                f fVar = f.this;
                fVar.c(fVar.d() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.f48228a;
        }
    }

    static final class d extends kotlin.jvm.internal.o implements Function1 {
        d() {
            super(1);
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                f.this.f45394z.add(segment);
                f fVar = f.this;
                fVar.c(fVar.d() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.f48228a;
        }
    }

    static final class e extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f45399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f45400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ A f45401c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, f fVar, A a10) {
            super(1);
            this.f45399a = j10;
            this.f45400b = fVar;
            this.f45401c = a10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(h.c.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.c().g0().getTime() >= this.f45399a) {
                return Boolean.FALSE;
            }
            f fVar = this.f45400b;
            fVar.c(fVar.d() - 1);
            this.f45400b.P(it.c().h0());
            this.f45401c.f48334a = true;
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C3833z3 options, InterfaceC3619a0 interfaceC3619a0, o dateProvider, z random, ScheduledExecutorService executor, Function1 function1) {
        super(options, interfaceC3619a0, dateProvider, executor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f45390v = options;
        this.f45391w = interfaceC3619a0;
        this.f45392x = dateProvider;
        this.f45393y = random;
        this.f45394z = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(List list) throws InterruptedException {
        h.c.a aVar = (h.c.a) CollectionsKt.K(list);
        while (aVar != null) {
            h.c.a.b(aVar, this.f45391w, null, 2, null);
            aVar = (h.c.a) CollectionsKt.K(list);
            Thread.sleep(100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(f fVar, Y it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.m(fVar.b());
    }

    private final void N(String str, Function1 function1) {
        Date dateE;
        Long lM;
        s sVarQ = q();
        if (sVarQ == null) {
            this.f45390v.getLogger().c(EnumC3721i3.DEBUG, "Recorder config is not set, not creating segment for task: " + str, new Object[0]);
            return;
        }
        long jB = this.f45390v.getSessionReplay().b();
        long jA = this.f45392x.a();
        io.sentry.android.replay.i iVarN = n();
        if (iVarN == null || (lM = iVarN.m()) == null || (dateE = AbstractC3732l.e(lM.longValue())) == null) {
            dateE = AbstractC3732l.e(jA - jB);
        }
        Intrinsics.c(dateE);
        long time = jA - dateE.getTime();
        x xVarB = b();
        r().submit(new io.sentry.android.replay.util.m("BufferCaptureStrategy." + str, new io.sentry.android.replay.capture.b(this, time, dateE, xVarB, sVarQ, function1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(f fVar, long j10, Date date, x xVar, s sVar, Function1 function1) {
        function1.invoke(io.sentry.android.replay.capture.a.m(fVar, j10, date, xVar, fVar.d(), sVar.c(), sVar.d(), sVar.b(), sVar.a(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f45390v.getLogger().c(EnumC3721i3.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.f45390v.getLogger().a(EnumC3721i3.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(f fVar, Function2 function2, long j10) {
        io.sentry.android.replay.i iVarN = fVar.n();
        if (iVarN != null) {
            function2.invoke(iVarN, Long.valueOf(j10));
        }
        long jA = fVar.f45392x.a() - fVar.f45390v.getSessionReplay().b();
        io.sentry.android.replay.i iVarN2 = fVar.n();
        fVar.C(iVarN2 != null ? iVarN2.t(jA) : null);
        fVar.R(fVar.f45394z, jA);
    }

    private final void R(List list, long j10) {
        A a10 = new A();
        CollectionsKt.J(list, new e(j10, this, a10));
        if (a10.f48334a) {
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.v();
                }
                ((h.c.a) obj).d(i10);
                i10 = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(File file, f fVar) {
        AbstractC3807i.a(file);
        fVar.c(-1);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void A(s recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        N("configuration_changed", new c());
        super.A(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.a(event);
        h.a.h(h.f45403a, o(), this.f45392x.a() - this.f45390v.getSessionReplay().b(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.h
    public void e(boolean z10, Function1 onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (!n.a(this.f45393y, this.f45390v.getSessionReplay().k())) {
            this.f45390v.getLogger().c(EnumC3721i3.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        InterfaceC3619a0 interfaceC3619a0 = this.f45391w;
        if (interfaceC3619a0 != null) {
            interfaceC3619a0.z(new io.sentry.android.replay.capture.c(this));
        }
        if (!z10) {
            N("capture_replay", new b(onSegmentSent));
        } else {
            x().set(true);
            this.f45390v.getLogger().c(EnumC3721i3.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.h
    public void f(Bitmap bitmap, Function2 store) {
        Intrinsics.checkNotNullParameter(store, "store");
        r().submit(new io.sentry.android.replay.util.m("BufferCaptureStrategy.add_frame", new io.sentry.android.replay.capture.e(this, store, this.f45392x.a())));
    }

    @Override // io.sentry.android.replay.capture.h
    public h g() {
        if (x().get()) {
            this.f45390v.getLogger().c(EnumC3721i3.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        m mVar = new m(this.f45390v, this.f45391w, this.f45392x, r(), null, 16, null);
        mVar.z(q());
        mVar.h(d(), b(), A3.b.BUFFER);
        return mVar;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void pause() {
        N("pause", new d());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() {
        io.sentry.android.replay.i iVarN = n();
        r().submit(new io.sentry.android.replay.util.m("BufferCaptureStrategy.stop", new io.sentry.android.replay.capture.d(iVarN != null ? iVarN.r() : null, this)));
        super.stop();
    }
}

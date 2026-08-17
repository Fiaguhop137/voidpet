package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import io.sentry.A3;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.InterfaceC3619a0;
import io.sentry.Y;
import io.sentry.android.replay.s;
import io.sentry.protocol.x;
import io.sentry.transport.o;
import io.sentry.util.AbstractC3807i;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends io.sentry.android.replay.capture.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f45421y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f45422z = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C3833z3 f45423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final InterfaceC3619a0 f45424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final o f45425x;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends kotlin.jvm.internal.o implements Function1 {
        b() {
            super(1);
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, m.this.f45424w, null, 2, null);
                m mVar = m.this;
                mVar.c(mVar.d() + 1);
                m.this.i(aVar.c().g0());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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
                h.c.a.b((h.c.a) segment, m.this.f45424w, null, 2, null);
                m mVar = m.this;
                mVar.c(mVar.d() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.f48228a;
        }
    }

    static final class d extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f45429b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(File file) {
            super(1);
            this.f45429b = file;
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a.b((h.c.a) segment, m.this.f45424w, null, 2, null);
            }
            m.this.c(-1);
            AbstractC3807i.a(this.f45429b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.f48228a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C3833z3 options, InterfaceC3619a0 interfaceC3619a0, o dateProvider, ScheduledExecutorService executor, Function1 function1) {
        super(options, interfaceC3619a0, dateProvider, executor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f45423v = options;
        this.f45424w = interfaceC3619a0;
        this.f45425x = dateProvider;
    }

    public /* synthetic */ m(C3833z3 c3833z3, InterfaceC3619a0 interfaceC3619a0, o oVar, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3833z3, interfaceC3619a0, oVar, scheduledExecutorService, (i10 & 16) != 0 ? null : function1);
    }

    private final void I(String str, Function1 function1) {
        s sVarQ = q();
        if (sVarQ == null) {
            this.f45423v.getLogger().c(EnumC3721i3.DEBUG, "Recorder config is not set, not creating segment for task: " + str, new Object[0]);
            return;
        }
        long jA = this.f45425x.a();
        Date dateW = w();
        if (dateW == null) {
            return;
        }
        long time = jA - dateW.getTime();
        x xVarB = b();
        r().submit(new io.sentry.android.replay.util.m("SessionCaptureStrategy." + str, new i(this, time, dateW, xVarB, sVarQ, function1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(m mVar, long j10, Date date, x xVar, s sVar, Function1 function1) {
        function1.invoke(io.sentry.android.replay.capture.a.m(mVar, j10, date, xVar, mVar.d(), sVar.c(), sVar.d(), sVar.b(), sVar.a(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(m mVar, Function2 function2, long j10, s sVar) {
        io.sentry.android.replay.i iVarN = mVar.n();
        if (iVarN != null) {
            function2.invoke(iVarN, Long.valueOf(j10));
        }
        Date dateW = mVar.w();
        if (dateW == null) {
            mVar.f45423v.getLogger().c(EnumC3721i3.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (mVar.x().get()) {
            mVar.f45423v.getLogger().c(EnumC3721i3.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (sVar == null) {
            mVar.f45423v.getLogger().c(EnumC3721i3.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
            return;
        }
        long jA = mVar.f45425x.a();
        if (jA - dateW.getTime() >= mVar.f45423v.getSessionReplay().q()) {
            h.c cVarM = io.sentry.android.replay.capture.a.m(mVar, mVar.f45423v.getSessionReplay().q(), dateW, mVar.b(), mVar.d(), sVar.c(), sVar.d(), sVar.b(), sVar.a(), null, null, null, null, null, 7936, null);
            if (cVarM instanceof h.c.a) {
                h.c.a aVar = (h.c.a) cVarM;
                h.c.a.b(aVar, mVar.f45424w, null, 2, null);
                mVar.c(mVar.d() + 1);
                mVar.i(aVar.c().g0());
            }
        }
        if (jA - mVar.s().get() >= mVar.f45423v.getSessionReplay().o()) {
            mVar.f45423v.getReplayController().stop();
            mVar.f45423v.getLogger().c(EnumC3721i3.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(m mVar, Y it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.m(mVar.b());
        String strJ = it.j();
        mVar.C(strJ != null ? StringsKt.V0(strJ, '.', null, 2, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Y it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.m(x.f46302b);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void A(s recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        I("onConfigurationChanged", new b());
        super.A(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public void e(boolean z10, Function1 onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (this.f45423v.getSessionReplay().t()) {
            this.f45423v.getLogger().c(EnumC3721i3.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        x().set(z10);
    }

    @Override // io.sentry.android.replay.capture.h
    public void f(Bitmap bitmap, Function2 store) {
        Intrinsics.checkNotNullParameter(store, "store");
        s sVarQ = q();
        r().submit(new io.sentry.android.replay.util.m("SessionCaptureStrategy.add_frame", new l(this, store, this.f45425x.a(), sVarQ)));
    }

    @Override // io.sentry.android.replay.capture.h
    public h g() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void h(int i10, x replayId, A3.b bVar) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        super.h(i10, replayId, bVar);
        InterfaceC3619a0 interfaceC3619a0 = this.f45424w;
        if (interfaceC3619a0 != null) {
            interfaceC3619a0.z(new j(this));
        }
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void pause() {
        I("pause", new c());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() {
        io.sentry.android.replay.i iVarN = n();
        I("stop", new d(iVarN != null ? iVarN.r() : null));
        InterfaceC3619a0 interfaceC3619a0 = this.f45424w;
        if (interfaceC3619a0 != null) {
            interfaceC3619a0.z(new k());
        }
        super.stop();
    }
}

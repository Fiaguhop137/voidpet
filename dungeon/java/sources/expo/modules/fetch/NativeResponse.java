package expo.modules.fetch;

import Ad.r;
import Ad.v;
import If.InterfaceC1108j;
import Rb.d;
import android.util.Log;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p088ef.AbstractC3293k;
import p088ef.C3282e0;
import p088ef.O;
import p263ob.f;
import p339sf.E;
import p339sf.F;
import p339sf.InterfaceC4186e;
import p339sf.InterfaceC4187f;
import p339sf.t;
import p389vb.g;
import p389vb.h;
import p389vb.k;
import p389vb.l;
import p389vb.m;
import p389vb.o;
import p389vb.p;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0001\u0019B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\r\u0010 \u001a\u00020\u0016¢\u0006\u0004\b \u0010\u001aJ/\u0010%\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160#¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R*\u0010=\u001a\u00020\n2\u0006\u00107\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b*\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010A\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0#j\u0002`?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010@R(\u0010E\u001a\u0004\u0018\u00010\u00112\b\u00107\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010B\u001a\u0004\bC\u0010DR4\u0010L\u001a\n\u0018\u00010Fj\u0004\u0018\u0001`G2\u000e\u00107\u001a\n\u0018\u00010Fj\u0004\u0018\u0001`G8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR$\u0010T\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0011\u0010W\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lsf/f;", "LRb/d;", "appContext", "Lef/O;", "coroutineScope", "<init>", "(LRb/d;Lef/O;)V", "", "Lvb/p;", "validStates", "", "b0", "([Lvb/p;)Z", "Lsf/E;", "response", "Lvb/m;", "L", "(Lsf/E;)Lvb/m;", "LIf/j;", "stream", "", "h0", "(LIf/j;)V", "a", "()V", "e0", "", "r0", "()[B", "K", "O", "", "states", "Lkotlin/Function1;", "callback", "s0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lsf/e;", "call", "Ljava/io/IOException;", "e", "f", "(Lsf/e;Ljava/io/IOException;)V", "g", "(Lsf/e;Lsf/E;)V", "c", "Lef/O;", "Lvb/o;", "d", "Lvb/o;", "V", "()Lvb/o;", "sink", "value", "Lvb/p;", "Z", "()Lvb/p;", "q0", "(Lvb/p;)V", "state", "", "Lexpo/modules/fetch/StateChangeListener;", "Ljava/util/List;", "stateChangeOnceListeners", "Lvb/m;", "U", "()Lvb/m;", "responseInit", "Ljava/lang/Exception;", "Lkotlin/Exception;", "h", "Ljava/lang/Exception;", "S", "()Ljava/lang/Exception;", "error", "Lexpo/modules/fetch/NativeRequestRedirect;", "i", "Lexpo/modules/fetch/NativeRequestRedirect;", "getRedirectMode", "()Lexpo/modules/fetch/NativeRequestRedirect;", "m0", "(Lexpo/modules/fetch/NativeRequestRedirect;)V", "redirectMode", "P", "()Z", "bodyUsed", "j", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeResponse extends SharedObject implements InterfaceC4187f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f40958k = NativeResponse.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final O coroutineScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o sink;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private p state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List stateChangeOnceListeners;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private m responseInit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Exception error;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private NativeRequestRedirect redirectMode;

    static final class b extends kotlin.coroutines.jvm.internal.m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f40967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NativeResponse f40968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(E e10, NativeResponse nativeResponse, Ed.b bVar) {
            super(2, bVar);
            this.f40967b = e10;
            this.f40968c = nativeResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            return new b(this.f40967b, this.f40968c, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((b) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1108j interfaceC1108jP3;
            Fd.b.e();
            if (this.f40966a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            F fE = this.f40967b.e();
            if (fE == null || (interfaceC1108jP3 = fE.P3()) == null) {
                return Unit.f48228a;
            }
            this.f40968c.h0(interfaceC1108jP3);
            this.f40967b.close();
            if (this.f40968c.Z() == p.BODY_STREAMING_STARTED) {
                this.f40968c.b("didComplete", new Object[0]);
            }
            this.f40968c.q0(p.BODY_COMPLETED);
            this.f40968c.b("readyForJSFinalization", new Object[0]);
            return Unit.f48228a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40969a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f40971c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p pVar, Ed.b bVar) {
            super(2, bVar);
            this.f40971c = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(p pVar, Function1 function1) {
            return ((Boolean) function1.invoke(pVar)).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            return NativeResponse.this.new c(this.f40971c, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((c) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Fd.b.e();
            if (this.f40969a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            CollectionsKt.J(NativeResponse.this.stateChangeOnceListeners, new a(this.f40971c));
            return Unit.f48228a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeResponse(d appContext, O coroutineScope) {
        super(appContext);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.sink = new o();
        this.state = p.INITIALIZED;
        this.stateChangeOnceListeners = new ArrayList();
    }

    private final m L(E response) {
        int i10 = response.i();
        String strU = response.u();
        t<Pair> tVarS = response.s();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(tVarS, 10));
        for (Pair pair : tVarS) {
            arrayList.add(v.a(pair.c(), pair.d()));
        }
        return new m(arrayList, i10, strU, response.O().n().toString(), response.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p Z() {
        p pVar;
        synchronized (this) {
            pVar = this.state;
        }
        return pVar;
    }

    private final boolean b0(p... validStates) {
        if (AbstractC3952n.M(validStates, Z())) {
            return false;
        }
        String strN0 = AbstractC3952n.n0(validStates, ",", null, null, 0, null, new k(), 30, null);
        Log.w(f40958k, "Invalid state - currentState[" + Z().g() + "] validStates[" + strN0 + "]");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return String.valueOf(it.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(InterfaceC1108j stream) {
        while (!stream.z2()) {
            try {
                p pVar = p.RESPONSE_RECEIVED;
                p pVar2 = p.BODY_STREAMING_STARTED;
                if (b0(pVar, pVar2, p.BODY_STREAMING_CANCELED)) {
                    return;
                }
                if (Z() == pVar) {
                    this.sink.a(stream.B().y2());
                } else if (Z() != pVar2) {
                    return;
                } else {
                    b("didReceiveResponseData", stream.B().y2());
                }
            } catch (IOException e10) {
                this.error = e10;
                if (Z() == p.BODY_STREAMING_STARTED) {
                    b("didFailWithError", f.a(e10));
                }
                q0(p.ERROR_RECEIVED);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(p pVar) {
        synchronized (this) {
            this.state = pVar;
            Unit unit = Unit.f48228a;
        }
        AbstractC3293k.d(this.coroutineScope, null, null, new c(pVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t0(List list, Function1 function1, p newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (!list.contains(newState)) {
            return false;
        }
        function1.invoke(newState);
        return true;
    }

    public final void K() {
        if (b0(p.BODY_STREAMING_STARTED)) {
            return;
        }
        q0(p.BODY_STREAMING_CANCELED);
    }

    public final void O() {
        h hVar = new h();
        this.error = hVar;
        if (Z() == p.BODY_STREAMING_STARTED) {
            b("didFailWithError", f.a(hVar));
        }
        q0(p.ERROR_RECEIVED);
    }

    public final boolean P() {
        return this.sink.c();
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final Exception getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final m getResponseInit() {
        return this.responseInit;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final o getSink() {
        return this.sink;
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void a() {
        this.sink.b();
        super.a();
    }

    public final void e0() {
        if (b0(p.INITIALIZED)) {
            return;
        }
        q0(p.STARTED);
    }

    @Override // p339sf.InterfaceC4187f
    public void f(InterfaceC4186e call, IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (Intrinsics.b(e10.getMessage(), "Canceled")) {
            return;
        }
        p pVar = p.STARTED;
        p pVar2 = p.RESPONSE_RECEIVED;
        p pVar3 = p.BODY_STREAMING_STARTED;
        if (b0(pVar, pVar2, pVar3, p.BODY_STREAMING_CANCELED)) {
            return;
        }
        if (Z() == pVar3) {
            b("didFailWithError", f.a(e10));
        }
        this.error = e10;
        q0(p.ERROR_RECEIVED);
        b("readyForJSFinalization", new Object[0]);
    }

    @Override // p339sf.InterfaceC4187f
    public void g(InterfaceC4186e call, E response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.t() || this.redirectMode != NativeRequestRedirect.ERROR) {
            this.responseInit = L(response);
            q0(p.RESPONSE_RECEIVED);
            AbstractC3293k.d(this.coroutineScope, C3282e0.b(), null, new b(response, this, null), 2, null);
            return;
        }
        response.close();
        g gVar = new g();
        this.error = gVar;
        if (Z() == p.BODY_STREAMING_STARTED) {
            b("didFailWithError", f.a(gVar));
        }
        q0(p.ERROR_RECEIVED);
        b("readyForJSFinalization", new Object[0]);
    }

    public final void m0(NativeRequestRedirect nativeRequestRedirect) {
        this.redirectMode = nativeRequestRedirect;
    }

    public final byte[] r0() {
        p pVar = p.RESPONSE_RECEIVED;
        p pVar2 = p.BODY_COMPLETED;
        if (b0(pVar, pVar2)) {
            return null;
        }
        if (Z() == pVar) {
            q0(p.BODY_STREAMING_STARTED);
            b("didReceiveResponseData", this.sink.b());
        } else if (Z() == pVar2) {
            return this.sink.b();
        }
        return null;
    }

    public final void s0(List states, Function1 callback) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (states.contains(Z())) {
            callback.invoke(Z());
        } else {
            this.stateChangeOnceListeners.add(new l(states, callback));
        }
    }
}

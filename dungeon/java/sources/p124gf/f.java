package p124gf;

import Md.n;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.reflect.g;
import p088ef.InterfaceC3299n;
import p195kf.D;
import p195kf.G;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f42431a = new m(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42432b = G.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42433c = G.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f42434d = new D("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final D f42435e = new D("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final D f42436f = new D("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final D f42437g = new D("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final D f42438h = new D("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final D f42439i = new D("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final D f42440j = new D("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final D f42441k = new D("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final D f42442l = new D("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final D f42443m = new D("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final D f42444n = new D("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final D f42445o = new D("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final D f42446p = new D("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final D f42447q = new D("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final D f42448r = new D("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final D f42449s = new D("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends AbstractC3975l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42450a = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m(((Number) obj).longValue(), (m) obj2);
        }

        public final m m(long j10, m mVar) {
            return f.x(j10, mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC3299n interfaceC3299n, Object obj, n nVar) {
        Object objQ = interfaceC3299n.Q(obj, null, nVar);
        if (objQ == null) {
            return false;
        }
        interfaceC3299n.T(objQ);
        return true;
    }

    static /* synthetic */ boolean C(InterfaceC3299n interfaceC3299n, Object obj, n nVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            nVar = null;
        }
        return B(interfaceC3299n, obj, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m x(long j10, m mVar) {
        return new m(j10, mVar, mVar.y(), 0);
    }

    public static final g y() {
        return a.f42450a;
    }

    public static final D z() {
        return f42442l;
    }
}

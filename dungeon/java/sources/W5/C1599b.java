package W5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: W5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1599b implements InterfaceC1613p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f14717f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f14718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f14719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f14720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f14721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f14722e;

    /* JADX INFO: renamed from: W5.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1599b(int i10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new B(10, "FrescoIoBoundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        this.f14718a = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i10, new B(10, "FrescoDecodeExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool2, "newFixedThreadPool(...)");
        this.f14719b = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i10, new B(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool3, "newFixedThreadPool(...)");
        this.f14720c = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new B(10, "FrescoLightWeightBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool4, "newFixedThreadPool(...)");
        this.f14721d = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i10, new B(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        this.f14722e = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // W5.InterfaceC1613p
    public Executor a() {
        return this.f14721d;
    }

    @Override // W5.InterfaceC1613p
    public Executor b() {
        return this.f14718a;
    }

    @Override // W5.InterfaceC1613p
    public ScheduledExecutorService c() {
        return this.f14722e;
    }

    @Override // W5.InterfaceC1613p
    public Executor d() {
        return this.f14719b;
    }

    @Override // W5.InterfaceC1613p
    public Executor e() {
        return this.f14720c;
    }

    @Override // W5.InterfaceC1613p
    public Executor f() {
        return this.f14718a;
    }

    @Override // W5.InterfaceC1613p
    public Executor g() {
        return this.f14718a;
    }
}

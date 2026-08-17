package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1982e implements InterfaceC1991n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DefaultLifecycleObserver f24338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1991n f24339b;

    /* JADX INFO: renamed from: androidx.lifecycle.e$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24340a;

        static {
            int[] iArr = new int[AbstractC1987j.a.values().length];
            try {
                iArr[AbstractC1987j.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1987j.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1987j.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1987j.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1987j.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1987j.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1987j.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f24340a = iArr;
        }
    }

    public C1982e(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC1991n interfaceC1991n) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f24338a = defaultLifecycleObserver;
        this.f24339b = interfaceC1991n;
    }

    @Override // androidx.lifecycle.InterfaceC1991n
    public void f(InterfaceC1994q source, AbstractC1987j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (a.f24340a[event.ordinal()]) {
            case 1:
                this.f24338a.onCreate(source);
                break;
            case 2:
                this.f24338a.onStart(source);
                break;
            case 3:
                this.f24338a.onResume(source);
                break;
            case 4:
                this.f24338a.onPause(source);
                break;
            case 5:
                this.f24338a.onStop(source);
                break;
            case 6:
                this.f24338a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new Ad.n();
        }
        InterfaceC1991n interfaceC1991n = this.f24339b;
        if (interfaceC1991n != null) {
            interfaceC1991n.f(source, event);
        }
    }
}

package p379v1;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p088ef.InterfaceC3318x;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function2 f55918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC3318x f55919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final D f55920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final CoroutineContext f55921d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 transform, InterfaceC3318x ack, D d10, CoroutineContext callerContext) {
            super(null);
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(ack, "ack");
            Intrinsics.checkNotNullParameter(callerContext, "callerContext");
            this.f55918a = transform;
            this.f55919b = ack;
            this.f55920c = d10;
            this.f55921d = callerContext;
        }

        public final InterfaceC3318x a() {
            return this.f55919b;
        }

        public final CoroutineContext b() {
            return this.f55921d;
        }

        public D c() {
            return this.f55920c;
        }

        public final Function2 d() {
            return this.f55918a;
        }
    }

    private w() {
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

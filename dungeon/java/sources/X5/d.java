package X5;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends X5.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f15301j = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p096f5.c a(d0 producer, l0 settableProducerContext, p061d6.d listener) {
            Intrinsics.checkNotNullParameter(producer, "producer");
            Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
            Intrinsics.checkNotNullParameter(listener, "listener");
            return new d(producer, settableProducerContext, listener, null);
        }
    }

    private d(d0 d0Var, l0 l0Var, p061d6.d dVar) {
        super(d0Var, l0Var, dVar);
    }

    public /* synthetic */ d(d0 d0Var, l0 l0Var, p061d6.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, l0Var, dVar);
    }
}

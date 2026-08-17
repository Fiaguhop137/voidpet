package Ne;

import Re.AbstractC1388d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ne.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1249x {

    /* JADX INFO: renamed from: Ne.x$a */
    public static final class a implements InterfaceC1249x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8221a = new a();

        private a() {
        }

        @Override // Ne.InterfaceC1249x
        public Re.S a(p374ue.r proto, String flexibleId, AbstractC1388d0 lowerBound, AbstractC1388d0 upperBound) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    Re.S a(p374ue.r rVar, String str, AbstractC1388d0 abstractC1388d0, AbstractC1388d0 abstractC1388d1);
}

package F0;

import I.d2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public interface H extends d2 {

    public static final class a implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f2830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f2831b;

        public a(Object obj, boolean z10) {
            this.f2830a = obj;
            this.f2831b = z10;
        }

        public /* synthetic */ a(Object obj, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }

        @Override // I.d2
        public Object getValue() {
            return this.f2830a;
        }

        @Override // F0.H
        public boolean m() {
            return this.f2831b;
        }
    }

    boolean m();
}

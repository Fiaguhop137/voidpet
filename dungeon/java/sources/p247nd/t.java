package p247nd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p283pd.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    public static final class a extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f50137a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r updateDirective) {
            super(null);
            Intrinsics.checkNotNullParameter(updateDirective, "updateDirective");
            this.f50137a = updateDirective;
        }

        public final r a() {
            return this.f50137a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.b(this.f50137a, ((a) obj).f50137a);
        }

        public int hashCode() {
            return this.f50137a.hashCode();
        }

        public String toString() {
            return "DirectiveUpdateResponsePart(updateDirective=" + this.f50137a + ")";
        }
    }

    public static final class b extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f50138a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q update) {
            super(null);
            Intrinsics.checkNotNullParameter(update, "update");
            this.f50138a = update;
        }

        public final q a() {
            return this.f50138a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.b(this.f50138a, ((b) obj).f50138a);
        }

        public int hashCode() {
            return this.f50138a.hashCode();
        }

        public String toString() {
            return "ManifestUpdateResponsePart(update=" + this.f50138a + ")";
        }
    }

    private t() {
    }

    public /* synthetic */ t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

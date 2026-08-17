package kotlin.jvm.internal;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L implements kotlin.reflect.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f48343a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: kotlin.jvm.internal.L$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0568a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48344a;

            static {
                int[] iArr = new int[kotlin.reflect.q.values().length];
                try {
                    iArr[kotlin.reflect.q.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlin.reflect.q.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kotlin.reflect.q.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f48344a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(kotlin.reflect.p typeParameter) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C0568a.f48344a[typeParameter.m().ordinal()];
            if (i10 == 1) {
                Unit unit = Unit.f48228a;
            } else if (i10 == 2) {
                sb2.append("in ");
            } else {
                if (i10 != 3) {
                    throw new Ad.n();
                }
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            return sb2.toString();
        }
    }
}

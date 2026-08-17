package p062d7;

import Ad.n;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p348t6.b;

/* JADX INFO: loaded from: classes2.dex */
public enum h {
    CREATE,
    UPDATE,
    DELETE;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f39852f = Gd.a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39847a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: d7.h$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0440a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39853a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.UPDATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.DELETE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f39853a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(h type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int i10 = C0440a.f39853a[type.ordinal()];
            if (i10 == 1) {
                return "create";
            }
            if (i10 == 2) {
                return "update";
            }
            if (i10 == 3) {
                return "delete";
            }
            throw new n();
        }
    }

    static {
        b.a("LayoutAnimationType", p348t6.a.ERROR);
    }
}

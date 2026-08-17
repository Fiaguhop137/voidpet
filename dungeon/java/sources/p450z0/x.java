package p450z0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f58371a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final A f58372b = new A("TestTagsAsResourceId", false, b.f58376a, null, 8, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final A f58373c = new A("AccessibilityClassName", true, a.f58375a, null, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f58374d = 8;

    static final class a extends o implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58375a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    static final class b extends o implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f58376a = new b();

        b() {
            super(2);
        }

        public final Boolean a(Boolean bool, boolean z10) {
            return bool;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Boolean) obj, ((Boolean) obj2).booleanValue());
        }
    }

    private x() {
    }

    public final A a() {
        return f58373c;
    }

    public final A b() {
        return f58372b;
    }
}

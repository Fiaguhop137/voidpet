package p450z0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.reflect.k;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f58219e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f58221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f58222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f58223d;

    static final class a extends o implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58224a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public A(String str, Function2 function2) {
        this.f58220a = str;
        this.f58221b = function2;
    }

    public /* synthetic */ A(String str, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? a.f58224a : function2);
    }

    public A(String str, boolean z10) {
        this(str, (Function2) null, 2, (DefaultConstructorMarker) null);
        this.f58222c = z10;
    }

    public A(String str, boolean z10, Function2 function2, String str2) {
        this(str, function2);
        this.f58222c = z10;
        this.f58223d = str2;
    }

    public /* synthetic */ A(String str, boolean z10, Function2 function2, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, function2, (i10 & 8) != 0 ? null : str2);
    }

    public final String a() {
        return this.f58223d;
    }

    public final String b() {
        return this.f58220a;
    }

    public final boolean c() {
        return this.f58222c;
    }

    public final Object d(Object obj, Object obj2) {
        return this.f58221b.invoke(obj, obj2);
    }

    public final void e(B b10, k kVar, Object obj) {
        b10.a(this, obj);
    }

    public String toString() {
        return "AccessibilityKey: " + this.f58220a;
    }
}

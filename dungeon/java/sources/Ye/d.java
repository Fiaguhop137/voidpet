package Ye;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractC3941c;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f17825c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f17826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17827b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends AbstractC3941c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17828c = -1;

        b() {
        }

        @Override // kotlin.collections.AbstractC3941c
        protected void a() {
            do {
                int i10 = this.f17828c + 1;
                this.f17828c = i10;
                if (i10 >= d.this.f17826a.length) {
                    break;
                }
            } while (d.this.f17826a[this.f17828c] == null);
            if (this.f17828c >= d.this.f17826a.length) {
                b();
                return;
            }
            Object obj = d.this.f17826a[this.f17828c];
            Intrinsics.d(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            c(obj);
        }
    }

    public d() {
        this(new Object[20], 0);
    }

    private d(Object[] objArr, int i10) {
        super(null);
        this.f17826a = objArr;
        this.f17827b = i10;
    }

    private final void g(int i10) {
        Object[] objArr = this.f17826a;
        if (objArr.length > i10) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i10);
        Object[] objArrCopyOf = Arrays.copyOf(this.f17826a, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.f17826a = objArrCopyOf;
    }

    @Override // Ye.c
    public int a() {
        return this.f17827b;
    }

    @Override // Ye.c
    public void c(int i10, Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        g(i10);
        if (this.f17826a[i10] == null) {
            this.f17827b = a() + 1;
        }
        this.f17826a[i10] = value;
    }

    @Override // Ye.c
    public Object get(int i10) {
        return AbstractC3952n.a0(this.f17826a, i10);
    }

    @Override // Ye.c, java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }
}

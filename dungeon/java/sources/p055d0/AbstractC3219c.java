package p055d0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3219c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f39552d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f39554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39555c;

    /* JADX INFO: renamed from: d0.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AbstractC3219c(String str, long j10, int i10) {
        this.f39553a = str;
        this.f39554b = j10;
        this.f39555c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ AbstractC3219c(String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, i10);
    }

    public final int a() {
        return AbstractC3218b.f(this.f39554b);
    }

    public final int b() {
        return this.f39555c;
    }

    public abstract float c(int i10);

    public abstract float d(int i10);

    public final long e() {
        return this.f39554b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC3219c abstractC3219c = (AbstractC3219c) obj;
        if (this.f39555c == abstractC3219c.f39555c && Intrinsics.b(this.f39553a, abstractC3219c.f39553a)) {
            return AbstractC3218b.e(this.f39554b, abstractC3219c.f39554b);
        }
        return false;
    }

    public final String f() {
        return this.f39553a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float f10, float f11, float f12);

    public int hashCode() {
        return (((this.f39553a.hashCode() * 31) + AbstractC3218b.g(this.f39554b)) * 31) + this.f39555c;
    }

    public abstract float i(float f10, float f11, float f12);

    public abstract long j(float f10, float f11, float f12, float f13, AbstractC3219c abstractC3219c);

    public String toString() {
        return this.f39553a + " (id=" + this.f39555c + ", model=" + ((Object) AbstractC3218b.h(this.f39554b)) + ')';
    }
}

package com.facebook.react.uimanager;

import java.util.Comparator;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30670c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Comparator f30671d = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30673b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        p348t6.b.a("ViewAtIndex", p348t6.a.ERROR);
    }

    public x0(int i10, int i11) {
        this.f30672a = i10;
        this.f30673b = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(x0 x0Var, x0 x0Var2) {
        return x0Var.f30673b - x0Var2.f30673b;
    }

    public boolean equals(Object obj) {
        if (obj != null && Intrinsics.b(obj.getClass(), x0.class)) {
            x0 x0Var = (x0) obj;
            if (this.f30673b == x0Var.f30673b && this.f30672a == x0Var.f30672a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f30672a), Integer.valueOf(this.f30673b));
    }

    public String toString() {
        return "[" + this.f30672a + ", " + this.f30673b + "]";
    }
}

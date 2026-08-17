package p455z5;

import P4.d;
import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0761a f58469c = new C0761a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f58470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f58471b;

    /* JADX INFO: renamed from: z5.a$a, reason: collision with other inner class name */
    public static final class C0761a {
        private C0761a() {
        }

        public /* synthetic */ C0761a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(int i10, boolean z10) {
        this.f58470a = z10;
        this.f58471b = "anim://" + i10;
    }

    @Override // P4.d
    public String a() {
        return this.f58471b;
    }

    @Override // P4.d
    public boolean b(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.O(string, this.f58471b, false, 2, null);
    }

    @Override // P4.d
    public boolean c() {
        return false;
    }

    @Override // P4.d
    public boolean equals(Object obj) {
        if (!this.f58470a) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.b(a.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.b(this.f58471b, ((a) obj).f58471b);
    }

    @Override // P4.d
    public int hashCode() {
        return !this.f58470a ? super.hashCode() : this.f58471b.hashCode();
    }
}

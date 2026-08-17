package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Xa.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1641h0 {
    Pending("pending"),
    Purchased("purchased"),
    Unknown("unknown");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16034a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16033g = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16028b = new a(null);

    /* JADX INFO: renamed from: Xa.h0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    EnumC1641h0(String str) {
        this.f16034a = str;
    }

    public final String g() {
        return this.f16034a;
    }
}

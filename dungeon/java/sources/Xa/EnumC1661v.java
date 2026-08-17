package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Xa.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1661v {
    Ios("ios"),
    Android("android");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16197a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16196f = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16192b = new a(null);

    /* JADX INFO: renamed from: Xa.v$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    EnumC1661v(String str) {
        this.f16197a = str;
    }

    public final String g() {
        return this.f16197a;
    }
}

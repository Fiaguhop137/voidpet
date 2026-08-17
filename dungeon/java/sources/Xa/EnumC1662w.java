package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1662w {
    Unknown("unknown"),
    Apple("apple"),
    Google("google"),
    Horizon("horizon");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16207a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16206h = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16200b = new a(null);

    /* JADX INFO: renamed from: Xa.w$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final EnumC1662w a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1532845701:
                    if (value.equals("Horizon")) {
                        return EnumC1662w.Horizon;
                    }
                    break;
                case -1240244679:
                    if (value.equals("google")) {
                        return EnumC1662w.Google;
                    }
                    break;
                case -284840886:
                    if (value.equals("unknown")) {
                        return EnumC1662w.Unknown;
                    }
                    break;
                case 63476538:
                    if (value.equals("Apple")) {
                        return EnumC1662w.Apple;
                    }
                    break;
                case 93029210:
                    if (value.equals("apple")) {
                        return EnumC1662w.Apple;
                    }
                    break;
                case 1097468315:
                    if (value.equals("horizon")) {
                        return EnumC1662w.Horizon;
                    }
                    break;
                case 1379812394:
                    if (value.equals("Unknown")) {
                        return EnumC1662w.Unknown;
                    }
                    break;
                case 2138589785:
                    if (value.equals("Google")) {
                        return EnumC1662w.Google;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown IapStore value: " + value);
        }
    }

    EnumC1662w(String str) {
        this.f16207a = str;
    }

    public final String g() {
        return this.f16207a;
    }

    public final String h() {
        return this.f16207a;
    }
}

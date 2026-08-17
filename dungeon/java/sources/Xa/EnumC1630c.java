package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1630c {
    None("none"),
    UserChoice("user-choice"),
    AlternativeOnly("alternative-only");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15974a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f15973g = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15968b = new a(null);

    /* JADX INFO: renamed from: Xa.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final EnumC1630c a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -2044784157:
                    if (value.equals("user-choice")) {
                        return EnumC1630c.UserChoice;
                    }
                    break;
                case -1514152500:
                    if (value.equals("alternative-only")) {
                        return EnumC1630c.AlternativeOnly;
                    }
                    break;
                case -1178612372:
                    if (value.equals("UserChoice")) {
                        return EnumC1630c.UserChoice;
                    }
                    break;
                case 2433880:
                    if (value.equals("None")) {
                        return EnumC1630c.None;
                    }
                    break;
                case 3387192:
                    if (value.equals("none")) {
                        return EnumC1630c.None;
                    }
                    break;
                case 1033360601:
                    if (value.equals("AlternativeOnly")) {
                        return EnumC1630c.AlternativeOnly;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown AlternativeBillingModeAndroid value: " + value);
        }
    }

    EnumC1630c(String str) {
        this.f15974a = str;
    }
}

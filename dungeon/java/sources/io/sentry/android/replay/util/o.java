package io.sentry.android.replay.util;

import android.os.Build;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f45588a = new o();

    public enum a {
        SOC_MODEL,
        SOC_MANUFACTURER;

        private static final /* synthetic */ EnumEntries $ENTRIES = Gd.a.a(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45589a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SOC_MODEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SOC_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45589a = iArr;
        }
    }

    private o() {
    }

    public static /* synthetic */ String b(o oVar, a aVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return oVar.a(aVar, str);
    }

    public final String a(a key, String defaultValue) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (Build.VERSION.SDK_INT < 31) {
            return defaultValue;
        }
        int i10 = b.f45589a[key.ordinal()];
        if (i10 == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i10 != 2) {
                throw new Ad.n();
            }
            str = Build.SOC_MANUFACTURER;
        }
        Intrinsics.c(str);
        return str;
    }
}

package com.facebook.react.uimanager;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public enum I {
    NONE,
    BOX_NONE,
    BOX_ONLY,
    AUTO;


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30198g = Gd.a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30192a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(I pointerEvents) {
            Intrinsics.checkNotNullParameter(pointerEvents, "pointerEvents");
            return pointerEvents == I.AUTO || pointerEvents == I.BOX_ONLY;
        }

        public final boolean b(I pointerEvents) {
            Intrinsics.checkNotNullParameter(pointerEvents, "pointerEvents");
            return pointerEvents == I.AUTO || pointerEvents == I.BOX_NONE;
        }

        public final I c(String str) {
            if (str == null) {
                return I.AUTO;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return I.valueOf(StringsKt.I(upperCase, "-", "_", false, 4, null));
        }
    }

    public static final boolean g(I i10) {
        return f30192a.a(i10);
    }

    public static final boolean h(I i10) {
        return f30192a.b(i10);
    }
}

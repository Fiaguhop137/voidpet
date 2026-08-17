package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30991a = new a();

    private a() {
    }

    private final ColorStateList a(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        return typedArrayObtainStyledAttributes.getColorStateList(0);
    }

    public static final ColorStateList b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f30991a.a(context, 16842904);
    }

    public static final int c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ColorStateList colorStateListA = f30991a.a(context, 16842905);
        if (colorStateListA != null) {
            return colorStateListA.getDefaultColor();
        }
        return 0;
    }

    public static final ColorStateList d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f30991a.a(context, 16842906);
    }
}

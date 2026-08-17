package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.D;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f31258a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        D d10 = new D(context);
        this.f31258a = d10;
        d10.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        d10.setGravity(17);
        d10.setTextColor(-1);
        d10.setText("");
        if (p384v6.a.f56277b) {
            setBackgroundColor(1442775040);
        }
        setGravity(1);
        setOrientation(1);
        addView(d10);
    }

    public final void setName$ReactAndroid_release(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (p384v6.a.f56277b) {
            this.f31258a.setText("'" + name + "' is not registered.");
        }
    }
}

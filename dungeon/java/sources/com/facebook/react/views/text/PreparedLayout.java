package com.facebook.react.views.text;

import android.text.Layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayout;", "", "Landroid/text/Layout;", "layout", "", "maximumNumberOfLines", "", "verticalOffset", "<init>", "(Landroid/text/Layout;IF)V", "a", "Landroid/text/Layout;", "()Landroid/text/Layout;", "b", "I", "()I", "c", "F", "()F", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreparedLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Layout layout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maximumNumberOfLines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float verticalOffset;

    public PreparedLayout(Layout layout, int i10, float f10) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
        this.maximumNumberOfLines = i10;
        this.verticalOffset = f10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaximumNumberOfLines() {
        return this.maximumNumberOfLines;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getVerticalOffset() {
        return this.verticalOffset;
    }
}

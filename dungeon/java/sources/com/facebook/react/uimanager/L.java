package com.facebook.react.uimanager;

import android.graphics.Rect;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface L {
    void getClippingRect(Rect rect);

    boolean getRemoveClippedSubviews();

    void updateClippingRect(Set set);
}

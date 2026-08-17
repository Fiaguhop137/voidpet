package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((View) obj2).getId(), ((View) obj).getId());
    }
}

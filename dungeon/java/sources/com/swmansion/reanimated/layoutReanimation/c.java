package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f38938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f38939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroupManager f38940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f38941d;

    public /* synthetic */ c(ArrayList arrayList, View view, ViewGroupManager viewGroupManager, ViewGroup viewGroup) {
        this.f38938a = arrayList;
        this.f38939b = view;
        this.f38940c = viewGroupManager;
        this.f38941d = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReanimatedNativeHierarchyManager.j(this.f38938a, this.f38939b, this.f38940c, this.f38941d);
    }
}

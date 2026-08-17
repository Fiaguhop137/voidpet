package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f30149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f30151c;

    public A0(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        this.f30149a = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(View view, View view2) {
        ViewGroupManager.Companion companion = ViewGroupManager.INSTANCE;
        Integer numA = companion.a(view);
        int iIntValue = numA != null ? numA.intValue() : 0;
        Integer numA2 = companion.a(view2);
        return iIntValue - (numA2 != null ? numA2.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public final int c(int i10, int i11) {
        int[] iArr = this.f30151c;
        if (iArr != null && (i11 >= iArr.length || iArr[i11] >= i10)) {
            W4.a.K("ReactNative", "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(i10), Integer.valueOf(i11));
            i();
        }
        if (iArr == null) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(this.f30149a.getChildAt(i12));
            }
            CollectionsKt.A(arrayList, new z0(new y0()));
            int[] iArr2 = new int[i10];
            for (int i13 = 0; i13 < i10; i13++) {
                Object obj = arrayList.get(i13);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                iArr2[i13] = this.f30149a.indexOfChild((View) obj);
            }
            this.f30151c = iArr2;
            iArr = iArr2;
        }
        return iArr[i11];
    }

    public final void f(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ViewGroupManager.INSTANCE.a(view) != null) {
            this.f30150b++;
        }
        this.f30151c = null;
    }

    public final void g(View view) {
        if (ViewGroupManager.INSTANCE.a(view) != null) {
            this.f30150b--;
        }
        this.f30151c = null;
    }

    public final boolean h() {
        return this.f30150b > 0;
    }

    public final void i() {
        this.f30150b = 0;
        int childCount = this.f30149a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (ViewGroupManager.INSTANCE.a(this.f30149a.getChildAt(i10)) != null) {
                this.f30150b++;
            }
        }
        this.f30151c = null;
    }
}

package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f38150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[][] f38151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f38152c;

    A(Paint paint) {
        ArrayList arrayList = new ArrayList();
        this.f38150a = arrayList;
        this.f38151b = new int[256][];
        this.f38152c = paint;
        arrayList.add(new Path());
    }

    private int a(char c10) {
        int[] iArr = this.f38151b[c10 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c10 & 255];
    }

    Path b(char c10, String str) {
        Path path;
        int iA = a(c10);
        if (iA != 0) {
            path = (Path) this.f38150a.get(iA);
        } else {
            Path path2 = new Path();
            this.f38152c.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.f38151b;
            int i10 = c10 >> '\b';
            int[] iArr2 = iArr[i10];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i10] = iArr2;
            }
            iArr2[c10 & 255] = this.f38150a.size();
            this.f38150a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}

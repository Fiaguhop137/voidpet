package Eb;

import Ad.u;
import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f2761a = new d();

    private d() {
    }

    private final List a(int[] iArr, int i10, int i11, Pair pair) {
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Number) pair.d()).intValue();
        int i12 = 0;
        while (i12 < iIntValue) {
            int iIntValue2 = ((Number) pair.c()).intValue();
            int i13 = 0;
            while (i13 < iIntValue2) {
                int[] iArr2 = iArr;
                int i14 = i10;
                int i15 = i11;
                arrayList.add(h(iArr2, i14, i15, i13, i12, (i13 == 0 && i12 == 0) ? 1.0f : 2.0f));
                i13++;
                iArr = iArr2;
                i10 = i14;
                i11 = i15;
            }
            i12++;
        }
        return arrayList;
    }

    private final String c(int i10, int i11) {
        String str = "";
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                str = str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz#$%*+,-.:;=?@[]^_{|}~".charAt((int) ((i10 / ((float) Math.pow(83.0f, i11 - i12))) % 83.0f));
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return str;
    }

    private final int d(u uVar, float f10) {
        e eVar = e.f2762a;
        return (int) ((Math.max(0.0f, Math.min(18.0f, (float) Math.floor((eVar.b(((Number) uVar.d()).floatValue() / f10, 0.5f) * 9.0f) + 9.5f))) * 19.0f * 19.0f) + (Math.max(0.0f, Math.min(18.0f, (float) Math.floor((eVar.b(((Number) uVar.e()).floatValue() / f10, 0.5f) * 9.0f) + 9.5f))) * 19.0f) + Math.max(0.0f, Math.min(18.0f, (float) Math.floor((eVar.b(((Number) uVar.f()).floatValue() / f10, 0.5f) * 9.0f) + 9.5f))));
    }

    private final int e(u uVar) {
        e eVar = e.f2762a;
        int iA = eVar.a(((Number) uVar.d()).floatValue());
        int iA2 = eVar.a(((Number) uVar.e()).floatValue());
        return (iA << 16) + (iA2 << 8) + eVar.a(((Number) uVar.f()).floatValue());
    }

    private final void f(Pair pair, StringBuilder sb2) {
        sb2.append(c((((Number) pair.c()).intValue() - 1) + ((((Number) pair.d()).intValue() - 1) * 9), 1));
    }

    private final float g(List list, StringBuilder sb2) {
        if (list.isEmpty()) {
            sb2.append(c(0, 1));
            return 1.0f;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        u uVar = (u) it.next();
        float fMax = Math.max(Math.max(Math.abs(((Number) uVar.d()).floatValue()), Math.abs(((Number) uVar.e()).floatValue())), Math.abs(((Number) uVar.f()).floatValue()));
        while (it.hasNext()) {
            u uVar2 = (u) it.next();
            fMax = Math.max(fMax, Math.max(Math.max(Math.abs(((Number) uVar2.d()).floatValue()), Math.abs(((Number) uVar2.e()).floatValue())), Math.abs(((Number) uVar2.f()).floatValue())));
        }
        int iMax = (int) Math.max(0.0f, Math.min(82.0f, (float) Math.floor((fMax * 166.0f) - 0.5f)));
        float f10 = (iMax + 1) / 166.0f;
        sb2.append(c(iMax, 1));
        return f10;
    }

    private final u h(int[] iArr, int i10, int i11, int i12, int i13, float f10) {
        float fC = 0.0f;
        float fC2 = 0.0f;
        float fC3 = 0.0f;
        for (int i14 = 0; i14 < i11; i14++) {
            for (int i15 = 0; i15 < i10; i15++) {
                float fCos = ((float) Math.cos(((i12 * 3.1415927f) * i15) / i10)) * f10 * ((float) Math.cos(((i13 * 3.1415927f) * i14) / i11));
                int i16 = iArr[(i14 * i10) + i15];
                e eVar = e.f2762a;
                fC += eVar.c(Color.red(i16)) * fCos;
                fC2 += eVar.c(Color.green(i16)) * fCos;
                fC3 += fCos * eVar.c(Color.blue(i16));
            }
        }
        float f11 = 1.0f / (i10 * i11);
        return new u(Float.valueOf(fC * f11), Float.valueOf(fC2 * f11), Float.valueOf(fC3 * f11));
    }

    public final String b(Bitmap image, Pair numberOfComponents) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(numberOfComponents, "numberOfComponents");
        int[] iArr = new int[image.getWidth() * image.getHeight()];
        image.getPixels(iArr, 0, image.getWidth(), 0, 0, image.getWidth(), image.getHeight());
        List listA = a(iArr, image.getWidth(), image.getHeight(), numberOfComponents);
        u uVar = (u) CollectionsKt.j0(listA);
        List listD0 = CollectionsKt.d0(listA, 1);
        StringBuilder sb2 = new StringBuilder();
        f(numberOfComponents, sb2);
        float fG = g(listD0, sb2);
        sb2.append(c(e(uVar), 4));
        Iterator it = listD0.iterator();
        while (it.hasNext()) {
            sb2.append(c(d((u) it.next(), fG), 2));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

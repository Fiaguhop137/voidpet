package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f36527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f36528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f36529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f36530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b f36531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f36532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b f36533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Paint f36534h;

    c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p243n9.b.d(context, Y8.a.f16956D, i.class.getCanonicalName()), Y8.k.f17607q3);
        this.f36527a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17643u3, 0));
        this.f36533g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17625s3, 0));
        this.f36528b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17634t3, 0));
        this.f36529c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17652v3, 0));
        ColorStateList colorStateListA = p243n9.c.a(context, typedArrayObtainStyledAttributes, Y8.k.f17661w3);
        this.f36530d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17679y3, 0));
        this.f36531e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17670x3, 0));
        this.f36532f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17688z3, 0));
        Paint paint = new Paint();
        this.f36534h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}

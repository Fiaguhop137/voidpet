package com.facebook.imagepipeline.memory;

import V4.k;
import android.graphics.Bitmap;
import p079e6.E;
import p079e6.F;
import p079e6.i;

/* JADX INFO: loaded from: classes2.dex */
public class c extends a implements i {
    public c(Y4.d dVar, E e10, F f10, boolean z10) {
        super(dVar, e10, f10, z10);
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Bitmap h(int i10) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i10) / 2.0d), Bitmap.Config.RGB_565);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void l(Bitmap bitmap) {
        k.g(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int p(Bitmap bitmap) {
        k.g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Bitmap r(b bVar) {
        Bitmap bitmap = (Bitmap) super.r(bVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean v(Bitmap bitmap) {
        k.g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int o(int i10) {
        return i10;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int q(int i10) {
        return i10;
    }
}

package com.facebook.imagepipeline.platform;

import V4.d;
import V4.k;
import Y4.h;
import Z4.a;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

/* JADX INFO: loaded from: classes2.dex */
@d
@TargetApi(19)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.d f28963c;

    @d
    public KitKatPurgeableDecoder(com.facebook.imagepipeline.memory.d dVar) {
        this.f28963c = dVar;
    }

    private static void h(byte[] bArr, int i10) {
        bArr[i10] = -1;
        bArr[i10 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a aVar, BitmapFactory.Options options) {
        h hVar = (h) aVar.m();
        int size = hVar.size();
        a aVarA = this.f28963c.a(size);
        try {
            byte[] bArr = (byte[]) aVarA.m();
            hVar.D(0, bArr, 0, size);
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr, 0, size, options), "BitmapFactory returned null");
        } finally {
            a.g(aVarA);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a aVar, int i10, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(aVar, i10) ? null : DalvikPurgeableDecoder.f28949b;
        h hVar = (h) aVar.m();
        k.b(Boolean.valueOf(i10 <= hVar.size()));
        int i11 = i10 + 2;
        a aVarA = this.f28963c.a(i11);
        try {
            byte[] bArr2 = (byte[]) aVarA.m();
            hVar.D(0, bArr2, 0, i10);
            if (bArr != null) {
                h(bArr2, i10);
                i10 = i11;
            }
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr2, 0, i10, options), "BitmapFactory returned null");
        } finally {
            a.g(aVarA);
        }
    }
}

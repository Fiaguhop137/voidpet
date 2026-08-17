package p436y4;

import L4.l;
import android.graphics.Bitmap;
import p274p4.h;
import p274p4.j;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public final class C implements j {

    private static final class a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f57868a;

        a(Bitmap bitmap) {
            this.f57868a = bitmap;
        }

        @Override // p310r4.v
        public int a() {
            return l.i(this.f57868a);
        }

        @Override // p310r4.v
        public Class b() {
            return Bitmap.class;
        }

        @Override // p310r4.v
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f57868a;
        }

        @Override // p310r4.v
        public void recycle() {
        }
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(Bitmap bitmap, int i10, int i11, h hVar) {
        return new a(bitmap);
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, h hVar) {
        return true;
    }
}

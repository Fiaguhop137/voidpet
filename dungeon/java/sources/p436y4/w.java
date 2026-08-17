package p436y4;

import L4.k;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p310r4.r;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public final class w implements v, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f57945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f57946b;

    private w(Resources resources, v vVar) {
        this.f57945a = (Resources) k.d(resources);
        this.f57946b = (v) k.d(vVar);
    }

    public static v d(Resources resources, v vVar) {
        if (vVar == null) {
            return null;
        }
        return new w(resources, vVar);
    }

    @Override // p310r4.v
    public int a() {
        return this.f57946b.a();
    }

    @Override // p310r4.v
    public Class b() {
        return BitmapDrawable.class;
    }

    @Override // p310r4.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f57945a, (Bitmap) this.f57946b.get());
    }

    @Override // p310r4.r
    public void initialize() {
        v vVar = this.f57946b;
        if (vVar instanceof r) {
            ((r) vVar).initialize();
        }
    }

    @Override // p310r4.v
    public void recycle() {
        this.f57946b.recycle();
    }
}

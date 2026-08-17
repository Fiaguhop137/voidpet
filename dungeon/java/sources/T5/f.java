package T5;

import Z4.h;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f12277a;

    private f() {
    }

    public static f b() {
        if (f12277a == null) {
            f12277a = new f();
        }
        return f12277a;
    }

    @Override // Z4.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}

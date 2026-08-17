package X5;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends p096f5.b {
    @Override // p096f5.b
    public void f(p096f5.c cVar) {
        if (cVar.a()) {
            Z4.a aVar = (Z4.a) cVar.b();
            try {
                g((aVar == null || !(aVar.m() instanceof p025b6.d)) ? null : ((p025b6.d) aVar.m()).n3());
            } finally {
                Z4.a.g(aVar);
            }
        }
    }

    protected abstract void g(Bitmap bitmap);
}
